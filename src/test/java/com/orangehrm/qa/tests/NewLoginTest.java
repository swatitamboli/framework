package com.orangehrm.qa.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.qa.utils.ExcelReader;

public class NewLoginTest {
@Test
public void login() throws IOException {
	String userDir=System.getProperty("user.dir");
	String path=userDir+"\\src\\test\\resources\\user.xlsx";
	System.out.println(path);
	String sheetName="data";
	ExcelReader excelreader=new ExcelReader(path,sheetName);
	System.out.println(excelreader.numberOfRowsInExcel());
	System.out.println(excelreader.numberOfCoulmnsInExcel());
	System.out.println(excelreader.getDataFromRow(0));
}
	@DataProvider
	public Object[][]data() throws IOException
	{
		String userDir=System.getProperty("user.dir");
		String path=userDir+"\\src\\test\\resources\\user.xlsx";
		System.out.println(path);
		String sheetName="data";
		ExcelReader excelreader=new ExcelReader(path,sheetName);
		return excelreader.getAllData();
}
	@Test(dataProvider = "data")
	public void test2(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][]data1() throws IOException
	{
		String userDir=System.getProperty("user.dir");
		String path=userDir+"\\src\\test\\resources\\user.xlsx";
		System.out.println(path);
		String sheetName="sheet2";
		ExcelReader excelreader=new ExcelReader(path,sheetName);
		return excelreader.getAllData();
}
	@Test(dataProvider = "data1")
	public void test2(String a,String b,String c,String d) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}