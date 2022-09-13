package com.orangehrm.qa.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propConfig {
	public static Properties prop;
public static String STFilePath="\\src\\main\\resources\\appconfiguration-ST.properties";
public static String UATFilePath="\\src\\main\\resources\\appconfiguration-UAT.properties";
public static Properties loadProperties(String env) throws IOException {
	String filepath="";
	String path=System.getProperty("user.dir");
	System.out.println(path);
if(env.equals("ST"))
{
	filepath=path+STFilePath;
	System.out.println(filepath);		
}
else if (env.equals(UATFilePath))
{
	filepath=path+UATFilePath;
}
FileReader file=new FileReader(new File(filepath));
prop=new Properties();
prop.load(file);
return prop;
}
}
