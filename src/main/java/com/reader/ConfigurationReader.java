package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
	
		
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\"
				+ "AdacitinHotel\\src\\main\\java\\com\\propert\\adactin.properties");
		
		
		FileInputStream fis = new FileInputStream(f);
		
		
		 p = new Properties();
		 p.load(fis);
		 

	}
	
	
	public static String getbrowser(){
	
	String browser =  p.getProperty("browser");
	return browser;
	}
	
	public  static String geturl(){
		
		String url =  p.getProperty("url");
		return url;
		}
	public  static String getpath(){
		
		String path =  p.getProperty("path");
		return path;
		}	

public  static String getwritepath(){
		
		String writepath =  p.getProperty("writepath");
		return writepath;
		}	
	
	
	
	
		
}
