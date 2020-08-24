package Revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xllsrandom {

	public static void main(String[] args) throws Exception {
		String path="C:\\ABC\\JAVA\\sidd.xls";
		File f=new File(path);
		FileOutputStream fp=new FileOutputStream (f);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("Random");
		ws.createRow(0).createCell(0).setCellValue("serial");
		ws.getRow(0).createCell(1).setCellValue("firstname");
		for(int i=1;i<500;i++) {
		ws.createRow(i).createCell(0).setCellValue(i);
		ws.getRow(i).createCell(1).setCellValue(abc(1,400));
		}
		wb.write(fp);
		wb.close();
	}

	public static int abc(int min,int max) throws Exception {
		if (min>=max) {
		throw new IllegalArgumentException("hello");}	
		  Random r=new Random();
			return r.nextInt(max-min)+1+min;
		}
	}


