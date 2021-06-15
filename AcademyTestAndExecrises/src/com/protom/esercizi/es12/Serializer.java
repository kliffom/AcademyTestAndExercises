package com.protom.esercizi.es12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.protom.esercizi.es12.annotations.DateFormat;
import com.protom.esercizi.es12.annotations.Skip;
import com.protom.esercizi.es12.annotations.SkipField;
import com.protom.esercizi.es12.annotations.SkipNull;

public abstract class Serializer {

	
	public static void testReflection(Object obj) {
		
		Method[] methods = obj.getClass().getMethods();
		try {
			for(Method method: methods) {
				if(method.getName().startsWith("get") && !method.getName().toLowerCase().contains("class")) {
					
					SkipField skip = method.getAnnotation(SkipField.class);
					String parameter = method.getName().replaceAll("get", "").toLowerCase();
					
					if(skip==null) {
						System.out.println(parameter + ": " + method.invoke(obj));
					} else {
						String val = "" + method.invoke(obj);
						
						if(skip.value().equals("UPPER")) {
							val = val.toUpperCase();
						} else if (skip.value().equals("****")) {
							val = "****";
						}
						System.out.println(parameter + ": " + val);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void parser(Object obj, String mode) {
		
		if(!mode.toLowerCase().equals("xml") && !mode.toLowerCase().equals("json")) {
			System.out.println("Inserisci xml o json");
			return;
		}
			
		
		Map<String, Object> values = new HashMap<>();
		
		Method[] methods = obj.getClass().getMethods();
		Field[] fields = obj.getClass().getDeclaredFields();
		
		try {
			for(Method method: methods) {
				
				// Filtra tutti i metodi eccetto getClass
				if(method.getName().startsWith("get") && !method.getName().toLowerCase().contains("class")) {

					// Se c'è l'annotazione @Skip, skippa l'invocazione del metodo
					if(method.getAnnotation(Skip.class) != null) {
						continue;
					}
					
					if(method.getAnnotation(SkipNull.class) != null && method.invoke(obj) == null) {
						continue;
					}
					
					// Come si fa qui?
					if(method.getAnnotation(DateFormat.class) != null && method.invoke(obj) instanceof Date) {
						
						Date d = (Date) method.invoke(obj);
						DateFormat df = method.getAnnotation(DateFormat.class);
						
						String ds = df.format().replace("dd", String.valueOf(d.getDay()));
						ds = ds.replace("MM", String.valueOf(d.getMonth()));
						ds = ds.replace("yyyy", String.valueOf(d.getYear()));
						
						values.put(method.getName().substring(3).toLowerCase(), ds);
					}
					
					else {
						values.put(method.getName().substring(3).toLowerCase(), method.invoke(obj));
					}
				}
			}
			
			for(Field field: fields) {
				
				if(field.canAccess(obj) && values.containsKey(field.getName())) {
					
					if(field.getAnnotation(Skip.class) != null) {
						continue;
					}
					
					if(field.getAnnotation(SkipNull.class) != null && field.get(obj) == null) {
						continue;
					}
					
					values.put(field.getName().toLowerCase(), field.get(obj));
				}
				
			}
			
			
			StringBuilder sb = new StringBuilder();
			
			if(mode.toLowerCase().equals("xml")) {
				
				sb.append("<");
				sb.append(obj.getClass().getSimpleName());
				sb.append(">\n");
				
				for(String value: values.keySet()) {
					
					sb.append("\t<");
					sb.append(value);
					sb.append(">");
					sb.append(values.get(value));
					sb.append("</");
					sb.append(value);
					sb.append(">\n");
					
				}
				sb.append("</");
				sb.append(obj.getClass().getSimpleName());
				sb.append(">");
				
				System.out.println("XML:");
				System.out.println(sb.toString());
				
			} else if (mode.toLowerCase().equals("json")) {
				
				
				sb.append("{\n'class': '");
				sb.append(obj.getClass().getSimpleName());
				sb.append("'\n");
				
				for(String value: values.keySet()) {
					
					sb.append("'");
					sb.append(value);
					sb.append("': '");
					sb.append(values.get(value));
					sb.append("'\n");
					
				}
				
				sb.append("}");
				
				System.out.println("JSON:");
				System.out.println(sb.toString());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
