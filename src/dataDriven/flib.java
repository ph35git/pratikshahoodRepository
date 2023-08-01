package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	// it is use to store the generic reusable method
	// all the methods are non static

	public String readExceldata(String excelpath,String Sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		
			FileInputStream fis = new FileInputStream(excelpath);
			 Workbook wb = WorkbookFactory.create(fis);                        
			 Sheet sheet = wb.getSheet(Sheetname);                             
			 Row row = sheet.getRow(rowcount);                                        
			 Cell cell = row.getCell(cellcount);                                      
			 String data = cell.getStringCellValue(); 
			 return data;
			
		}

	public int rowcount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
	}
}
