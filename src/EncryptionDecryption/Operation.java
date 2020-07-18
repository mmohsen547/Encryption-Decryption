package EncryptionDecryption;

import java.util.Hashtable;

class Operation {
	String args[];
	Hashtable<String, String> a;
	AlgorithmFactory Selector;
	int key;
	public Operation(String args[]) {
		// TODO Auto-generated constructor stub
		this.args = args;
		a = new Hashtable<String, String>();
		for (int i = 0; i < args.length - 1; i++) {
			if (i % 2 == 0) {
				a.put(args[i], args[i + 1]);
			}
		}
		this.Selector = new AlgorithmFactory();
	}
	private void SelectAlgo() {
		if(a.get("-alg") != null && a.get("-alg").equals("unicode")) {
			Selector.SetAlgothim(new unicode());
		}
		else {
			Selector.SetAlgothim(new shift());
		}
	}
	
	private void Read_Data() {
		if (a.get("-data") != null) {
			Selector.Read_Data(a.get("-data"));
		}
		else if (a.get("-in") != null) {
			Selector.ReadData(a.get("-in"));
		}
		else {
			Selector.Read_Data("");
		}
	}
	private void SelectKey() {
		if (a.get("-key") != null) {
			this.key = Integer.parseInt(a.get("-key"));
		}
		else {
			this.key = 0;
		}
	}
	private void SelectOperation() {
		if(a.get("-mode")!= null && a.get("-mode").equals("dec")) {
			Selector.Decryption(key);
		}
		else {
			Selector.Encryption(key);
		}
	}
	private void PrintData() {
		if (a.get("-out") != null) {
			Selector.WriteOutput(a.get("-out"));
		}
		else {
			Selector.WriteOutput();
		}
	}
	public void excute() {
		SelectAlgo();
		Read_Data();
		SelectKey();
		SelectOperation();
		PrintData();	
	}
}
