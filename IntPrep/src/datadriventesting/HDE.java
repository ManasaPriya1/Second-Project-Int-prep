package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HDE {
//public static void main(String[] args) throws EncryptedDocumentException, IOException {
	public ArrayList<String> getData(String testcaseName) throws EncryptedDocumentException, IOException {
	ArrayList<String> ar = new ArrayList<String>();//craeting an array
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb =  WorkbookFactory.create(fis);
	int sheet = wb.getNumberOfSheets();//how many sheets are there
	System.out.println(sheet);
	System.out.println("---------------------");
	for(int i=0; i<sheet; i++) {
		//Looping to check in which sheet we have our data
		if(wb.getSheetName(i).equalsIgnoreCase("demodata")) {
			Sheet s = wb.getSheetAt(i);//getting sheet index
			System.out.println(s);
			Iterator<Row> r = s.iterator();//looping how many rows are present
			Row row = r.next();//check whetehr new row is available or not
			Iterator<Cell> cell = row.cellIterator();//how many cells are present
			int k=0;
			while(cell.hasNext()) {//if next cell is there , then true
			Cell c =cell.next();
			k++;
			int column =k;//to find which particular row we need to go
			//to iterate through every row
			while(r.hasNext()) {
				Row row1= r.next();
				if(row1.getCell(column).getStringCellValue().equalsIgnoreCase("testCaseName")) {
					Iterator<Cell> cell1 = row1.cellIterator();
					while(cell1.hasNext()) {
						//Cell c2 = cell1.next();
						//System.out.println(c2);
						ar.add(cell1.next().getStringCellValue());
					}
				}
			}
			
	}
	}
	}
	return ar;
	
	
	
	
	
	
	
	
}
}