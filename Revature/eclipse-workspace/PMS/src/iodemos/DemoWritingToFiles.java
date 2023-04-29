package iodemos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoWritingToFiles {
	
	public static void writeToFile() {
		
		FileWriter file  = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("`Entre the name of file which you want to create");
			String name = sc.nextLine();
			name = "E:\\Revature/"+name+".txt";
			System.out.println("Entre the some Quotes");
			String str = sc.nextLine();
			file = new FileWriter(name);
			
			file.write(str);
			file.close();
		     System.out.println("Successfully wrote to the file.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		writeToFile();
		
	}
	
}
