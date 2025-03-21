package testcases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readFile {

    public static void main(String[] args) throws IOException {
        // Correct the file path by using forward slashes or escaped backslashes
      /*  File f = new File("C:\\Users\\ahmedh\\Documents\\New folder\\textfile.txt");  // Use correct path
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);
        
       String line ;
       while((line=reader.readLine())!=null) {
    	   System.out.println(line);
       }
        reader.close();
        
        */
    	
    	
    	File f = new File("C:\\Users\\ahmedh\\Documents\\New folder\\new.xlsx");
    	FileInputStream fi = new FileInputStream(f);
    	Workbook workbook = WorkbookFactory.create(fi);
    	
    	Sheet  sheet0 = workbook.getSheetAt(0);
    	/*Row row0 = sheet0.getRow(0);
    	Cell cellA = row0.getCell(0);
        System.out.println(cellA);
        fi.close();
        */
    	
    	for(Row row :sheet0) {
    		for(Cell cell: row) {
    			switch(cell.getCellType()) {
    			case STRING:
    				System.out.println(cell.getStringCellValue()+"\t");
    				break;
    			case NUMERIC:
    				System.out.println(cell.getNumericCellValue()+"\t");
    				break;
    			case BOOLEAN:
    				System.out.println(cell.getBooleanCellValue()+"\t");
    				break;
    			default:
                    System.out.print("Unknown Type\t");
                    break;
    			}
    		}
    	}
        
        
        
    }
}
