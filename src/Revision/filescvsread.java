package Revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filescvsread {
//read//
//	public  static void  abc() {
//		try {
//		String path="files\\sister.csv";
//		File f=new File(path);
//		FileReader fr=new FileReader(f);
//		BufferedReader br=new BufferedReader(fr);
//		String line=null;
//		while ((line=br.readLine())!=null){
//		System.out.println(line);}}
//		catch(IOException e) {
//			System.out.println("great");
//		}
//		
	//write//	
		public static void filewriter() {
			try
			{
			String path="files\\sister.csv";
			File f=new File(path);
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter b=new BufferedWriter(fw);
			b.write("jo , 100 , pan ");
			b.newLine();
			b.write("yo , 200 , pan");
			b.write(23);
			b.close();
			
			}
			catch(IOException e) {
				
			
			e.printStackTrace();
		}
	}
}

