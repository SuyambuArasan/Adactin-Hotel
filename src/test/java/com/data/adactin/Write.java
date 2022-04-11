package com.data.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.reader.ConfigurationHelper;

public class Write {
	
	private static void write() throws IOException {
	 
	String path = ConfigurationHelper.getInstance().getInstanceCR().getwritepath();	
	File f = new File(path);
	
	FileInputStream fi = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fi);
	
	//w.createSheet("project").createRow(0).createCell(0).setCellValue("name");
	
	//w.getSheet("project").getRow(0).createCell(1).setCellValue("phone number");
	
	w.getSheet("project").createRow(2).createCell(3).setCellValue("dinesh");
	
	
	FileOutputStream fo = new FileOutputStream(f);
	
	w.write(fo);
	
	w.close();
	
	System.out.println("executed");
	

	
	}
	
public static void main(String[]args) throws IOException {
	
	write();
}
}
