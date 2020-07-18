package EncryptionDecryption;

class shift extends methods {
	@Override
	public void Decryption(int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if (c >= 65 && c <= 90) {
				c -= 65;
				c = (char) ((((int)c - key) % 26) < 0 ? (c + 26 - key) % 26 : (c - key) % 26);
				OutPut += (char) (c + 65);
				
			} else if (c >= 97 && c <= 122) {
				c -= 97;
				c = (char) ((((int)c - key) % 26) < 0 ? (c + 26 - key) % 26 : (c - key) % 26);
				OutPut += (char) (c + 97);
			} else {
				OutPut += c;
			}
			
		}	
	}
	
	@Override
	public void Encryption(int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			if (c >= 65 && c <= 90) {
				c -= 65;
				OutPut += (char) ((c + key) % 26 + 65);
			}
			else if (c >= 97 && c <= 122) {
				c -= 97;
				OutPut += (char) ((c + key) % 26 + 97);
			} else {
				OutPut += c;
			}		
		}
	}
}

