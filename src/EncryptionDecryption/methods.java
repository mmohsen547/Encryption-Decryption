package EncryptionDecryption;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public abstract class methods implements Algorithm{
	protected String data;
	protected String OutPut = "";
	
	public void ReadData(String FileName) {
		String s = "";
		try {
			File file = new File(FileName);
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				s += read.nextLine() + "\n";
			}
			read.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		this.data = s;
	}
	public void Read_Data(String data) {
		this.data = data;
	}
	@Override
	public void WriteOutput() {
		// TODO Auto-generated method stub
		System.out.println(OutPut);
	}
	public void WriteOutput(String FileName) {
		try {
			File file = new File(FileName);
			FileWriter writer = new FileWriter(file);
			writer.write(OutPut);
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
	}
}
