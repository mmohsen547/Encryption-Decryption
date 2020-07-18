package EncryptionDecryption;

class AlgorithmFactory {
	private Algorithm algo;
	public void SetAlgothim(Algorithm algo) {
		this.algo = algo;
	}
	public void ReadData(String FileName) {
		this.algo.ReadData(FileName);
	}
	
	public void Read_Data(String name) {
		this.algo.Read_Data(name);
	}
	
	public void Encryption(int key) {
		this.algo.Encryption(key);
	}
	
	public void Decryption(int key) {
		this.algo.Decryption(key);
	}
	
	public void WriteOutput() {
		this.algo.WriteOutput();
	}
	public void WriteOutput(String FileName) {
		this.algo.WriteOutput(FileName);
	}
	
}