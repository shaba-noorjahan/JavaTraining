package com.shaba.dec14;

import java.io.IOException;
import java.util.ArrayList;

public class FileIOExample {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
          writeFileUsingPOI();
	}
	
	public static void writeFileUsingPOI()throws IOException {
		writeFileUsingPOI();
	}
	XSSFWorkbook workbook = new SSfWorkbook();
	
	ArrayList<Object[]> data=new ArrayList<Object[]>();
	data.add(new String[]{"Name","ID","D.O.B"});
	data.add(new Object[] {"Tom","23","02.08.2000"});
	data.add(new Object[]{"Sam","54","09.8.2000"});
	data.add(new Object[] {"Jam","62","07.06.2000"});
	
	int rownum = 0;
	for(Object [] name : data)
	{
		Cell cell =row.createCell(cellnum++);
		if(obj instanceof String)
			cell.setCellValur((String)obj);
		else if(obj instanceof Double)
			cell.setCellValue((Double)obj);
		else if(obj instanceof Integer)
			cell.setCellValue((Integer)obj);
	}
}

Row rowGap = sheet.createRow(rownum++);
Row row = sheet.createRow(0);
cellTotal.setCellValue("Total Population");
Cell cell =row.createCell(2);
cell.setCellFormula("SUM(C2:C5)");
cell.setCellType(Cell.CELL_TYPE_FORMULA);
try {
	FileOutputStream out=new FileOutputStream(new File("NameDetails.xlsx"));
	workbook.write(out);
	out.close();
	System.out.println("NameDetails.xlsx has been created");
}
catch (Exception e)
{
	e.printStackTrace();
}
finally {
	workbook.close();
}
		
		
		
		

}
}