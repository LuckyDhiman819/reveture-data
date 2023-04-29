package iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo_ToRead {

	public static void main(String[] args) {
		readPatientFromFile();
	}

	private static void readPatientFromFile() {
		// TODO Auto-generated method stub
		
		Patient patient  = new Patient();
		try {
			ObjectInputStream out = new ObjectInputStream(new FileInputStream(new File("E:\\Revature/lucky123.csv")));
			
			patient = (Patient)out.readObject();
			
			System.out.println(patient);
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
