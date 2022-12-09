package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven2 {

	
	public static void particular_Data() throws IOException {
           
		File f = new File("C:\\Users\\Man Bala\\eclipse-workspace\\Maven_Project\\excel\\demo.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		CellType c = cell.getCellType();  //string or numeric
		
		if (c.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (c.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			int it = (int) numericCellValue;
			String valueOf = String.valueOf(it);
			System.out.println(valueOf);
		}
	}
	
     public static void all_Data() throws IOException {
    	 
    	 File f = new File("C:\\Users\\Man Bala\\eclipse-workspace\\Maven_Project\\excel\\demo.xlsx");
    	 
    	FileInputStream fis = new FileInputStream(f);
    	
    	Workbook wb = new XSSFWorkbook(fis);
    	
    	Sheet sheetAt = wb.getSheetAt(0);
    	
    	int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
    	
    	for (int i = 0; i < physicalNumberOfRows  ; i++) {
    		
    		Row row = sheetAt.getRow(i);
    		
    		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
    		
    		for (int j = 0; j < physicalNumberOfCells; j++) {
				
    			Cell cell = row.getCell(j);
    			
    			CellType c = cell.getCellType();
    			
    			if (c.equals(CellType.STRING)) {
					
    				String stringCellValue = cell.getStringCellValue();
    				System.out.println(stringCellValue);
				}
    			else if (c.equals(CellType.NUMERIC)) {
					
    				double numericCellValue = cell.getNumericCellValue();
    				
    				int it = (int) numericCellValue;
    				String valueOf = String.valueOf(it);
    				System.out.println(valueOf);
    				
    				
				}
			}
			
		}
   }	
     
     public static void write_Data() throws IOException {
            
    	 File f = new File("C:\\Users\\Man Bala\\Desktop\\priya3.xlsx");
    	 
    	 FileInputStream fis = new FileInputStream(f);
    	 
    	 Workbook wb = new XSSFWorkbook(fis);
    	 
    	 wb.createSheet("atendance").createRow(0).createCell(0).setCellValue("name");
    	 wb.getSheet("atendance").getRow(0).createCell(1).setCellValue("present");
    	 wb.getSheet("atendance").getRow(0).createCell(2).setCellValue("absent");
    	 
    	 wb.getSheet("atendance").createRow(1).createCell(0).setCellValue("priya");
    	 wb.getSheet("atendance").getRow(1).createCell(1).setCellValue("1");
    	 wb.getSheet("atendance").getRow(1).createCell(2).setCellValue("0");
    	 
    	 wb.getSheet("atendance").createRow(2).createCell(0).setCellValue("maddy");
    	 wb.getSheet("atendance").getRow(2).createCell(1).setCellValue("0");
    	 wb.getSheet("atendance").getRow(2).createCell(2).setCellValue("1");
    	 
    	 FileOutputStream fos = new FileOutputStream(f);
    	 
    	 wb.write(fos);
    	 
   }
	
	public static void main(String[] args) throws IOException {
		
            write_Data();		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

