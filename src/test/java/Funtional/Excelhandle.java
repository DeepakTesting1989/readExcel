package Funtional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Excelhandle {
	
	//@Test
	public static void main(String arg[]) throws IOException

	 {
		FileInputStream fls= new FileInputStream("E:/Testing Doc/Child Info Testscript/BBBPCMS/Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fls);
		int sheets= workbook.getNumberOfSheets();
		
		for (int i=0;i<sheets;i++){
			
			if(workbook.getSheetName(i).equals("Login")){
				
				XSSFSheet sht=  workbook.getSheetAt(i);
				Iterator<Row> rows= sht.iterator();
				Row firstrow= rows.next();
				Iterator<Cell> cell=firstrow.cellIterator();
				Cell value= cell.next();
				System.out.println(value.getStringCellValue());
		
				
				
				
			}
		}
		
		
		
		
		
		
	}
}
