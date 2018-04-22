package week5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromXl {

	public Object readExcel() throws IOException {
		//Open the excel from the path
		XSSFWorkbook wBook =new XSSFWorkbook("./data/Lead.xlsx");
		
		//go to the first sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		//find the number of rows in the first sheet
		int rowCount = sheet.getLastRowNum();
		
		//go to the header row and find the number of cols
		XSSFRow headerRow = sheet.getRow(0);
		
		//find the number of columns
		short colCount = headerRow.getLastCellNum();
		
		Object [][] data = new Object [rowCount][colCount];
		
		//loop through every row and get the value of each row
		for(int i=1;i<=rowCount;i++)
		{
			//go to the ith row
			XSSFRow firstRow = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				//go to jth cell of the row
				XSSFCell cell = firstRow.getCell(j);
				//print the content of the cell
				System.out.println(cell.getStringCellValue());
				data[i-1][j]= cell.getStringCellValue();
			}
			
		}
		wBook.close();
		return data;
	}

}
