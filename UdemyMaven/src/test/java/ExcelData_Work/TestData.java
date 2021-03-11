package ExcelData_Work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	
	public ArrayList<String> getData(String testCaseName) throws IOException
	{
        ArrayList<String> a=new ArrayList<String>();
		
		FileInputStream f=new FileInputStream("E://Rahul//HACKER RANK//MetaData.xlsx");  
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		int NoOfsheets=w.getNumberOfSheets();  //find no of sheets in excel file
	    for(int i=0;i<NoOfsheets;i++)
	    {
	       if(w.getSheetName(i).equalsIgnoreCase("TestData")) //to find sheet
	       {
	    	   XSSFSheet  sheet=w.getSheetAt(i);   //store sheet name
	    	   
	    	   Iterator<Row> row=sheet.iterator();  //sheet is collection of rows
	    	   Row firstrow=row.next();
	    	   Iterator<Cell> ce=firstrow.cellIterator();  //row is collection of rows
	    	   int k=0;
	    	   int column=0;
	    	   
	    	   while(ce.hasNext())
	    	   {
	    		   Cell value=ce.next();
	    		   if(value.getStringCellValue().equalsIgnoreCase("TestCase"))
	    		   {
	    			   column=k;
	    		   }
	    		   k++;
	    	   }
	    	   System.out.println("column : "+column);
	    	   
	    	   while(row.hasNext())
	    	   {
	    		   Row r=row.next();
	    		   
	    		   if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))
	    		   {
	    			   Iterator<Cell> cv=r.cellIterator();   
	    			  
	    			   while(cv.hasNext())
	    			   {
	    				   Cell c=cv.next();
	    				   if(c.getCellTypeEnum()==CellType.STRING)         //enum use for which kind of data available
	    				   {
	    				   a.add(c.getStringCellValue());
	    				   }
	    				   else {
	    					   a.add(NumberToTextConverter.toText((c.getNumericCellValue())));// to convert numeric into string
	    				   }
	    			   }   
	    		   }		   
	    	   }
	       }
	    }		
		    return a;
	}
	
}
