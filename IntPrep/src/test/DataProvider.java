//package test;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//public class DataProvider {
//	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
//@org.testng.annotations.DataProvider(name="driveTest")		
//public void getData() throws EncryptedDocumentException, IOException {	
//FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
//Workbook wb = WorkbookFactory.create(fis);
//int sheet = wb.getNumberOfSheets();
//Sheet s= wb.getSheetAt(0);
//int row = s.getPhysicalNumberOfRows();
//Row r = s.getRow(0);
//int cell= r.getLastCellNum();
//Object data[][] = new Object[row-1][cell];
//for(int i=0; i<row-1; i++) {
//	r = s.getRow(i+1);
//	for(int j=0; j<cell; j++) {
//		data[i][j] = r.getCell(j);
//	}
//	
//}
//}
//
//
//}
