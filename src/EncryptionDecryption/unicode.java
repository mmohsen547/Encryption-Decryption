package EncryptionDecryption;

class unicode extends methods {

	
	@Override
	public void Encryption(int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			c += key;
			OutPut += c;	
		}
	}
	
	@Override
	public void Decryption(int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			c -= key;
			OutPut += c;
		}
	}
}
