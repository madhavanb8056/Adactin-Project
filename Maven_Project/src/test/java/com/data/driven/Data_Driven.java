  package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

  public static void particular_Data() throws IOException {
	
	  File f = new File("C:\\Users\\Man Bala\\eclipse-workspace\\Maven_Project\\excel\\demo.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		CellType c = cell.getCellType();
		
		if (c.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if (c.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int e = (int) numericCellValue;
			
			String valueOf = String.valueOf(e);
			System.out.println(valueOf);
		}
  }

    public static void all_Data() throws IOException {
               
    	   File f = new File("C:\\\\Users\\\\Man Bala\\\\eclipse-workspace\\\\Maven_Project\\\\excel\\\\demo.xlsx");
    	   
    	   FileInputStream fis = new FileInputStream(f);
    	   
    	   Workbook wb = new XSSFWorkbook(fis);
    	   
    	   Sheet sheetAt = wb.getSheetAt(0);
    	   
    	   int numberOfRows = sheetAt.getPhysicalNumberOfRows();
    	   
    	   for (int i = 0; i < numberOfRows; i++) {
			
    		   Row row = sheetAt.getRow(i);
    		   
    		   int physicalNumberOfCells = row.getPhysicalNumberOfCells();
    		   
    		   for (int j = 0; j < physicalNumberOfCells; j++) {
				
    			   Cell cell = row.getCell(j);
    			   
    			   CellType c = cell.getCellType();
    			   
    			   if (c.equals(CellType.STRING)) {
					
    				   String stringCellValue = cell.getStringCellValue();
    		           
    				   System.out.println(stringCellValue);
    				  }else if (c.equals(CellType.NUMERIC)) {
						
    				    double numericCellValue = cell.getNumericCellValue();
                        
    				    int e = (int) numericCellValue;
    				    String valueOf = String.valueOf(e);
    				    System.out.println(valueOf);
    				 }
			}
    	}
    }		
    		   
    public static void write_Data() throws IOException {

	   File f = new File("C:\\Users\\Man Bala\\Desktop\\Book1.xlsx");
	   
	   FileInputStream fis = new FileInputStream(f);
	   
	   Workbook wb = new XSSFWorkbook(fis);
	   
	   wb.createSheet("data").createRow(0).createCell(0).setCellValue("Name");
	   wb.getSheet("data").getRow(0).createCell(1).setCellValue("marks");
	   
	   wb.getSheet("data").createRow(1).createCell(0).setCellValue("raja");
	   wb.getSheet("data").getRow(1).createCell(1).setCellValue("12");
	   
	   wb.getSheet("data").createRow(2).createCell(0).setCellValue("murali");
	   wb.getSheet("data").getRow(2).createCell(1).setCellValue("13");
	   
	   wb.getSheet("data").createRow(3).createCell(0).setCellValue("akash");
	   wb.getSheet("data").getRow(3).createCell(1).setCellValue("14");
	   
	   FileOutputStream fos = new FileOutputStream(f);
	    
	   wb.write(fos);
     }		
	
    
    public static void main(String[] args) throws IOException {
             write_Data();
    }
	
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

