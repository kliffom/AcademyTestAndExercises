package com.protom.esercizi.es12;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.protom.ecommerce.entity.Product;
import com.protom.ecommerce.entity.Tipologia;
import com.protom.esercizi.es12.entity.User;

public class SerialTest {

	public static void main(String[] args) {

		
		User user = new User().setNome("Luca").setCognome("Pangaro").setDataNascita(new GregorianCalendar(1996, Calendar.JANUARY, 9).getTime()).setUsername("kliffom").setPassword("pwd");;
		
		User user2 = new User().setNome("Mario").setCognome("Rossi").setUsername("mr").setPassword("pwd");
		
		
		Serializer.testReflection(new Product("Marca", Tipologia.SMARTPHONE, 250, 2, 3));
		
		Serializer.parser(user, "xml");
		Serializer.parser(user2, "json");
	}

}
