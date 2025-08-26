package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int sheet =  wb.getNumberOfSheets();
	for(int i=0; i<sheet; i++) {
		if(wb.getSheetName(i).equalsIgnoreCase("demodata")) {
		Sheet sheet1 =wb.getSheetAt(i);
		Iterator<Row> rows = sheet1.iterator();//get all the row count
		Row r = rows.next();//iterate only first row
		Iterator<Cell> cell = r.cellIterator();
		int k=0;
		while(cell.hasNext()) {
			Cell c = cell.next();
			if(c.getStringCellValue().equalsIgnoreCase("name")) {
			System.out.println(c);
			k++;
			int column =k;
			System.out.println(column);
			//to iterate all row we need to use hasNext() concept
			while(rows.hasNext()) {
				Row r1 = rows.next();
				if(r1.getCell(column).getStringCellValue().equalsIgnoreCase("priya")) {
					Iterator<Cell>  cv= r1.cellIterator();
					while(cv.hasNext()) {
						Cell data = cv.next();
						System.out.println(data);
					}
				}
				
			}
		}
	}
	}
	
}
}
}
