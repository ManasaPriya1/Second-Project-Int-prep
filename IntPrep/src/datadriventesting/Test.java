package datadriventesting;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

public class Test {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	HDE hde = new HDE();
	//HOW TO PULL AND PRINT DATA
ArrayList<String> a1= 	hde.getData("priya");
System.out.println(a1.get(0));
System.out.println(a1.get(1));
System.out.println(a1.get(2));
System.out.println(a1.get(3));

		
	
	}
}
