package EncryptionDecryption;

public interface Algorithm {
	void ReadData(String Filename);
	
	void Read_Data(String text);
		
	void Encryption(int key);
	
	void Decryption(int key);
	
	void WriteOutput();
	
	void WriteOutput(String FileName);
}
