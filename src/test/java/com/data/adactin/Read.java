package com.data.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.reader.ConfigurationHelper;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Cell;

public class Read {

	
	public static void particularData(String sheetname , int row ,int cell ) throws IOException {
		
		String path =ConfigurationHelper.getInstance().getInstanceCR().getpath();
		
		File f = new File(path);
		
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		  
		Sheet s = w.getSheet(sheetname);
		
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
	    CellType ce =c.getCellType();
	    
	    if(ce.equals(CellType.STRING)) {
	    String sv = c.getStringCellValue();
	    System.out.println(sv);
	    
	    }else {
		double d = c.getNumericCellValue();
		int n = (int) d;
		 System.out.println(n);
		 
	    }
		 
		 
	} 
	public static void allData() throws IOException 
	{
       String path =ConfigurationHelper.getInstance().getInstanceCR().getpath();
		
		File f = new File(path);
		
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		  
		Sheet s = w.getSheet("java");
		
		
		int r = s.getPhysicalNumberOfRows();
		for (int i = 0; i < r; i++) {
			
			
			Row row = s.getRow(i);
			
			int cell = row.getPhysicalNumberOfCells();
			  
			for (int j = 0; j < cell; j++) {
				
				Cell ce = row.getCell(j);
				
				
				CellType ctype =ce.getCellType();
			    
			    if(ctype.equals(CellType.STRING)) {
			    String sv = ce.getStringCellValue();
			    System.out.println(sv);
			    
			    }else {
				double d = ce.getNumericCellValue();
				int n = (int) d;
				 System.out.print(n);
				
			}
			
		System.out.print("           |             ");
		
	}
	System.out.println();
	}}
	public static void main(String[]args) throws IOException	{
		//particularData("java",3,0);
		allData();
		
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

