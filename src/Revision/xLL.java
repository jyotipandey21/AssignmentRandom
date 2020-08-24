package Revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xLL {

	public static void xllwrite() throws IOException {
		String path="C:\\ABC\\JAVA\\jai.xlsx";
		File f=new File(path);
		FileOutputStream fo=new FileOutputStream(f);		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("cars");
		Row rw=ws.createRow(5);
		Cell cl=rw.createCell(5);
		cl.setCellValue("jai bajrang bali");
		wb.write(fo);
		wb.close();
	}
}
