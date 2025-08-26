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

public class ReadExcel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int sheet= wb.getNumberOfSheets();
	for(int i=0; i<sheet; i++) {
		if(wb.getSheetName(i).equalsIgnoreCase("demodata")) {
			Sheet s = wb.getSheetAt(i);
			
			Iterator<Row> row = s.iterator();
			Row fr = row.next();
			Iterator<Cell> cell = fr.cellIterator();
			int k=0;//to check every row initialize k=0
			while(cell.hasNext()) {
				Cell cl = cell.next();
				if(cl.getStringCellValue().equalsIgnoreCase("TestCases")) {
					System.out.println(cl);
					int column = k;
					System.out.println(column);
				}
			}
			k++;//check each row ,k++
			}
	}
}
}
