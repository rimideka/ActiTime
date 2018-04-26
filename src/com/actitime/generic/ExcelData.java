package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	//to get the data
	
public static String getData(String pathname, String sheetname, int rn, int cn)
{
	
	try
	{
		FileInputStream fis = new FileInputStream(new File("./data/input.xlsx"));
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rn).getCell(cn).toString();
		return data;
	}
	catch(Exception e)
	{
		return " ";
	}
}

//To get row Count

	public static int getRowCount(String pathname,String sheetname)
	{
		
		try
		{	File file=new File("./data/input.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook wb= WorkbookFactory.create(fis);
			int rc=wb.getSheet(sheetname).getLastRowNum();
			return rc;
			
		}	
		
		catch(Exception e)
		{
			return 0;
		}
		
	}
	
//To get Cell/Column count	
	
	
	
	public static int getCellCount(String pathname,String sheetname,int rn)
	{
		
		try
		{	File file=new File("./data/input.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook wb= WorkbookFactory.create(fis);
			int cc=wb.getSheet(sheetname).getRow(rn).getLastCellNum();
			return cc;
			
		}	
		
		catch(Exception e)
		{
			return 0;
		}
		
	}
	
	
}
