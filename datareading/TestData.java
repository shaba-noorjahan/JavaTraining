package com.shaba.datareading;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestData {

	public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger(TestData.class.getName());
		// TODO Auto-generated method stub
		
		File f=new File("/Users/shazeena/Desktop/shaba training/ExampleMaven/resources/Data.xls");
		
		FileInputStream fin=new FileInputStream(f);
		
	    HSSFWorkbook workbook=new HSSFWorkbook(fin);
	    
		HSSFSheet sheet=workbook.getSheet("Sheet1");
		
		log.info("last row is "+sheet.getLastRowNum());
		
		HSSFRow heading=sheet.getRow(0);
		
		log.info(String.valueOf(heading.getLastCellNum()));
		
		Map<String, String> data=new HashMap<String, String>();
		
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			HSSFRow row=sheet.getRow(i);
//			String key =row.getCell(0).getStringCellValue();
//			String value=row.getCell(1).getStringCellValue();
			String key =row.getCell(0).toString();
			String value=row.getCell(1).toString();
			//row.getCell(2).getStringCellValue()
			log.info("key is "+key+"\t value "+value);
			//log.info("value is "+value);
			String str = "123";
		}
		
		
		
		
		
		
		

	}

}
