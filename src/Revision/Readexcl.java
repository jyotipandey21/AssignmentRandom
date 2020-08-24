
  package Revision;
  
  import java.io.File; import java.io.FileInputStream; import
  java.io.FileNotFoundException; import java.io.IOException; import
  java.util.Iterator;
  
  import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import
  org.apache.poi.xssf.usermodel.XSSFSheet; import
  org.apache.poi.xssf.usermodel.XSSFWorkbook;
  
  public class Readexcl {
  
  
  public static void main(String[] args) throws IOException { 
	  
//	  String  path="C:\\ABC\\JAVA\\sidd.xls";
//           File f=new File(path);
  readxlsxfile("C:\\ABC\\JAVA\\sidd.xls");



	}

	private static void readxlsxfile(String file) {
		try {
			XSSFWorkbook ws=new XSSFWorkbook (new FileInputStream(file));
			XSSFSheet sheet=ws.getSheet("memo");
			XSSFRow row =null;
			int i=0;
			while((row=sheet.getRow(i))!=null){
				System.out.println(row.getCell(0).getNumericCellValue());
				System.out.println(row.getCell(1).getStringCellValue());
				i++;
				
			}
		}
		catch (IOException e) {
			
		}
	}




  
  
 
  }
  
  
  
 
