package guru99;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public Object data() throws IOException
	{
		XSSFWorkbook work=new XSSFWorkbook("./data/CreatAccount.xlsx");

		XSSFSheet sheet=work.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();

		XSSFRow headRow = sheet.getRow(0);

		short colCount = headRow.getLastCellNum();

		Object[][] data=new Object[rowCount][colCount];
		for(int i=1;i<rowCount;i++)
		{
			XSSFRow firstRow = sheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell = firstRow.getCell(j);
				
				String value = cell.getStringCellValue();
				System.out.println(value);
				data[i-1][j]=cell.getStringCellValue();

			}
		}
		work.close();
		return data;


	}
}
