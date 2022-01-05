package com.xworkz.createSheetsInform;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateInformation {
	
	private static Workbook workbook;//creating a workbook
	private static Sheet sh;//creating a table 
	private static FileInputStream fis;//put in value
	private static FileOutputStream fos;//fos is the set the value.
	private static Row row;//creating a rows
	private static Cell cell;//creating a column
	
	public static void main(String[] args) throws Exception  {
		
			fis=new FileInputStream("./mavenSheet.xlxx");
			workbook=WorkbookFactory.create(fis);
		
		sh=workbook.getSheet("Sheet1");
		int noOfRows=sh.getLastRowNum();
		System.out.println(noOfRows);
		for(int i=1;i<noOfRows;i++) {
			System.out.println(sh.getRow(i).getCell(0));
			System.out.println(sh.getRow(i).getCell(0));
			System.out.println(sh.getRow(i).getCell(0));
			System.out.println(sh.getRow(i).getCell(0));
		}
		
		/*row=sh.createRow(1);
		cell=row.createCell(0);
		cell.setCellValue("create");
		System.out.println(cell.getStringCellValue());
		fos= new FileOutputStream(".mavenSheet.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();*/
		System.out.println("close");
	}

}
