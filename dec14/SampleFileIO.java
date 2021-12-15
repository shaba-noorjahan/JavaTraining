package com.shaba.dec14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SampleFileIO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream ("Sample.txt");
		DataOutputStream dos = new DataOutputStream (fos);
		dos.writeUTF ("Sample Write hghgkjg");
		
		
	    FileInputStream fis = new FileInputStream ("Sample.txt");
		DataInputStream dis = new DataInputStream (fis);
		String str = dis.readUTF();
		System.out.println(str);

	}

}
