package dataaccess;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	public static String[][] readExcel() {
		// TODO Auto-generated method stub

		String data[][] =null;
		
		
		try {
			
			FileInputStream fs = new FileInputStream("C:\\Users\\ravis\\Desktop\\TestSampleData.xls");
			HSSFWorkbook book = new HSSFWorkbook(fs);
			
			HSSFSheet sheet = book.getSheet("TestData");
			
			int rc,cc;
			
			rc = sheet.getPhysicalNumberOfRows();
			cc = sheet.getRow(0).getPhysicalNumberOfCells();
			
			
			data = new String[rc-1][cc];
			for(int i=1; i<rc;i++) {
				
				HSSFRow row = sheet.getRow(i);
				
				HSSFCell col1 = row.getCell(0);
				
				HSSFCell col2 = row.getCell(1);
				
				//System.out.println(col1.getStringCellValue() +" \t "+col2.getStringCellValue());
				
				data[i-1][0] =col1.getStringCellValue();
				data[i-1][1] = col2.getStringCellValue();
				
			}
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return data;
		
	}

}
