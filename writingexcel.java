package testcases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingexcel {

	public static  void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("firstsheet");
		Row row = sheet.createRow(0);
		Cell cellA = row.createCell(0);
		Cell cellB = row.createCell(1);
		cellA.setCellValue("first cell");
		cellB.setCellValue("second cell");
		
		File f = new File("C:\\Users\\ahmedh\\Documents\\New folder\\new.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		fo.close();
		System.out.println("file created......");
		 
	}

}
