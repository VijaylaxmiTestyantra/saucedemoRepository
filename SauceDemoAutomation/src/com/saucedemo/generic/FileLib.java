package com.saucedemo.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vijaylaxmi\\eclipse-workspace1\\SauceDemoAutomation\\data\\saucedemodata.properties");
		Properties p = new Properties();	
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String readDataFromProperty1(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vijaylaxmi\\eclipse-workspace1\\SauceDemoAutomation\\data\\saucedemodata.properties");
		Properties p = new Properties();	
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
