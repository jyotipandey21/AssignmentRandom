package Revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readtext {
//public static void reader() {
//	try {
//		String p="files\\learning.txt";
//	 File path=new  File(p);
//	 FileReader fr=new FileReader(path);
//	 BufferedReader bf=new  BufferedReader(fr);
//	 String line=null;
//	 while((line=bf.readLine())!=null)
//	 {System.out.println(line);}
//	}
//	catch(IOException e) {
//		e.getStackTrace();}
//	}

public static void writer() {
	try
	{
		String a="files\\\\learning.txt";
		File f=new File(a);
		FileWriter fw=new FileWriter(f);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("last,first,age");
		bf.newLine();
		bf.write(2);
		bf.write("pan,jyoti,25");
		bf.close();
	}
	catch (IOException e) {
		e.printStackTrace();
		System.out.println("hello");
	}
}

	

	
}
