package Guru99.Guru99;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Apache_POI {
	
	By name = By.className("name");
  @Test
  @Parameters({"filepath","filename","sheetname"})
  public void f(String filepath, String filename, String sheetname) throws IOException 
  {
	  
	  File file = new File(filepath+"\\"+filename);
	  //Create an object of FileInputStream class to read excel file

	  FileInputStream fi = new FileInputStream(file);
	  DataFormatter format = new DataFormatter(); // this is used for format like to display integer as 1 instead of 1.0
	  Workbook wb = null;
	  Cell Cello;
	  String fileextension = filename.substring(filename.indexOf(".")); 
	  if (fileextension.equalsIgnoreCase(".xlsx"))
	  {
		  wb = new XSSFWorkbook(fi);
	  }
	  else if(fileextension.equalsIgnoreCase(".xls"))
	  {
		  wb = new HSSFWorkbook(fi);
	  }
	  
	   org.apache.poi.ss.usermodel.Sheet excelsheet = wb.getSheet(sheetname);
	   int row_count = excelsheet.getLastRowNum()-excelsheet.getFirstRowNum()+1;
	   System.out.println("Row Count :"+row_count);
	   for(int i=0;i<row_count;i++)
	   {
		   Row row = excelsheet.getRow(i);
		   for(int j=0;j<excelsheet.getLastRowNum();j++)
		   {
			   String Cell = row.getCell(j).toString();
			   Cello = row.getCell(j);
			   
			   System.out.println("Data : "+Cell);
			   System.out.println("Value:"+format.formatCellValue(Cello));
			   
		   }
		   System.out.println();
	   }
  }
  @Test
  @Parameters({"filepath2","filename2"})
  public void g(String filepath2, String filename2) throws IOException
  {
	 
	 //FileInputStream fi = new FileInputStream(f);
	 HSSFWorkbook wb = new HSSFWorkbook();
	 String exten = filename2.substring(filename2.indexOf("."));
	 HSSFSheet sh = wb.createSheet("output");
	 HSSFRow r = sh.createRow(0);
	 HSSFCell c = r.createCell(0);
	 c.setCellValue("25/09/2018");
	 File f = new File(filepath2+"\\"+filename2);
	 FileOutputStream fo = new FileOutputStream(f);
	 wb.write(fo);
	 wb.close();
	 
  }
}
