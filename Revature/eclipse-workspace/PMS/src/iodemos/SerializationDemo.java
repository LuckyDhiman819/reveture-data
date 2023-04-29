package iodemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		writeToFile();
	}
	
	private static void writeToFile() {
		
		System.out.println("####object Saving Program");
		
		Patient patient = new Patient("Lucky", 7988857, "Password");
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("E:\\Revature/lucky123.csv")));
			out.writeObject(patient);
			System.out.println("Data Saved");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
