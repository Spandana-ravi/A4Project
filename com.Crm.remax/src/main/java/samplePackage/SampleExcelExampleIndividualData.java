package samplePackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelExampleIndividualData 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Book1.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(2).getCell(3));
		String value2=format.formatCellValue(sh.getRow(1).getCell(2));
		System.out.println(value);
		System.out.println(value2);
		
	}


}
