package Revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readhtlm {
	public static void readihtm() {
//		try
//		{
//		String path="files\\sitecfreation.html";
//		File f=new File(path);
//		FileReader fr=new FileReader(f);
//		BufferedReader bf=new BufferedReader(fr);
//		String line=null;
//		while((line=bf.readLine())!=null) {
//			System.out.println(line);
//		}
//		}
//		catch(IOException e) {
//			e.getStackTrace();
		}
		
		public static void writerhtm() {
			try
			{
			String path="files\\\\sitecfreation.html";
			File f=new File(path);
			FileWriter fr=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter (fr);
			bf.write("new world");
			bf.newLine();
			bf.write("2020");
			bf.equals("2.2");
			bf.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}


