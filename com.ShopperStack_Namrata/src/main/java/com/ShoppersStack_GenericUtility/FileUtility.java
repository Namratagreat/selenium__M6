package com.ShoppersStack_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.eventusermodel.EventWorkbookBuilder;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	
	public String readpropertyFile(String key) throws IOException {
		FileInputStream strem=new FileInputStream(FramworkConstants.propertyFilepath);
		Properties pro=new Properties();
		pro.load(strem);
		
		 String st = pro.getProperty(key);
		 return st;
		 
		 
		
	}
		
	public String ReadExclFile(String sheetName,int Rownum,int cellnum) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fil=new FileInputStream(FramworkConstants.Excelfilepath);
		Workbook wb= WorkbookFactory.create(fil);
		String value = wb.getSheet(sheetName).getRow( Rownum).getCell(cellnum).getStringCellValue();
		return value;
		
		
	}
		
		

}
