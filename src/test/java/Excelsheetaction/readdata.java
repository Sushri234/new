package Excelsheetaction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readdata {
	
	
	@Test
	public static void Read_data() throws IOException
	{
		FileInputStream files= new FileInputStream("C:\\Users\\DELL\\Documents\\My sheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(files);
		Sheet s=wb.getSheet("sheet1");
		Row r= s.getRow(5);
		Cell c= r.getCell(2);
		//System.out.println(c.getStringCellValue());
		 String address= c.getStringCellValue();
	        
	        System.out.println("Address is :"+ address);
	}
}


