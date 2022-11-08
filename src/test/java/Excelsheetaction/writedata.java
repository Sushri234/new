package Excelsheetaction;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writedata {
	
	
	
	@Test
	public void File_write()
	{
		File file = new File("C:\\Users\\DELL\\Documents\\Filewrite.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb .createSheet();
		
		sh.createRow(0).createCell(0).setCellValue("Employee");
		sh.createRow(1).createCell(0).setCellValue("Sushri");
		sh.createRow(2).createCell(0).setCellValue("Suparna");
		sh.createRow(3).createCell(0).setCellValue("Srusti");
		sh.createRow(4).createCell(0).setCellValue("Sweta");
		sh.getRow(0).createCell(1).setCellValue("Employee ID");
		sh.getRow(1).createCell(1).setCellValue("023823");
		sh.getRow(2).createCell(1).setCellValue("023826");
		sh.getRow(3).createCell(1).setCellValue("023828");
		sh.getRow(4).createCell(1).setCellValue("023824");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}



