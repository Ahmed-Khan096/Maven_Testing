package testcases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class textfile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ahmedh\\Documents\\New folder\\test.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter("C:\\Users\\ahmedh\\Documents\\New folder\\test.txt");
		BufferedWriter  write = new BufferedWriter(fw);
		write.write("please write this inside the file ");
		write.newLine();
		write.write("please write this inside the file ");

		write.flush();
		
		FileReader fr = new FileReader("C:\\Users\\ahmedh\\Documents\\New folder\\test.txt");
		BufferedReader read = new BufferedReader(fr);
		String i = "";
		while((i=read.readLine())!=null) {
			System.out.println(i);
		}
	}

}
