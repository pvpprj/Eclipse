package day3;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class CSVReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String csvFile = "src\\test\\resources\\data\\indiateam.csv";

	        CSVReader reader = null;
	        try {
	            reader = new CSVReader(new FileReader(csvFile),'+');
	            String[] line;
	            while ((line = reader.readNext()) != null) {
	                System.out.println("Country [Field1= " + line[0] + ", Name= " + line[1] + " , Score=" + line[2] + "]");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
