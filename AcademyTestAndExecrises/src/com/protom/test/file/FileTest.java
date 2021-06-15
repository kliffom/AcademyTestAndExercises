package com.protom.test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try  {
			
			File file = new File("/home/kliffom//Documenti/test-file.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			// Così scrive in append
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Stringa 1\n");
			bw.write("Stringa 2\n");
			
			bw.close();
			fw.close();
			//Fine append
			
			//Inizio lettura
			System.out.println("Leggo dopo append");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String curLine;
			
			while((curLine=br.readLine())!=null) {
				System.out.println(curLine);
			}
			br.close();
			fr.close();
			//Fine lettura
			
			//Scrittura non in append
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("Stringa 1\n");
			bw.write("Stringa 2\n");
			
			bw.close();
			fw.close();
			//Fine scrittura
			
			//Inizio lettura
			System.out.println("Leggo dopo !append");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			curLine = "";
			
			while((curLine=br.readLine())!=null) {
				System.out.println(curLine);
			}
			br.close();
			fr.close();
			//Fine lettura
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
