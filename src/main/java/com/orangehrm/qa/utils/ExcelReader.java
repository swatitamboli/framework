package com.orangehrm.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
XSSFWorkbook xssfworkbook;
XSSFSheet sheet;
FileInputStream fis;
public ExcelReader(String path, String sheetName) throws IOException
{
	fis=new FileInputStream(new File(path));
	xssfworkbook=new XSSFWorkbook(fis);
	sheet=xssfworkbook.getSheet(sheetName);
}
public int numberOfRowsInExcel() 
{
	return sheet.getPhysicalNumberOfRows();
}
public int numberOfCoulmnsInExcel() {
	return sheet.getRow(0).getPhysicalNumberOfCells();
}
public List<String> getDataFromRow(int rownum)
{
	List<String>list= new ArrayList();
	Row row=sheet.getRow(rownum);
	for(int i=0;i<row.getLastCellNum();i++)
	{
		String data=row.getCell(i).getStringCellValue();
		list.add(data);
	}
	return list;
}
public Object[][]getAllData(){
	int rowCount =sheet.getPhysicalNumberOfRows();
	int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
	Object [][]obj=new Object [rowCount-1][this.numberOfCoulmnsInExcel()];
	for(int i=1;i<rowCount;i++)
	{
		Row row=sheet.getRow(i);
		for(int j=0;j<colCount;j++)
		{
			obj[i-1][j]=row.getCell(j).toString();
		}
	}
	return obj;
}
}
