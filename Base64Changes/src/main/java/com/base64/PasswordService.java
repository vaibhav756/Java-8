package com.base64;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static void main(String[] args) throws Exception{

		String password="vaibhav456";
		Encoder encoder = Base64.getEncoder();
		byte[] passBytes = encoder.encode(password.getBytes());
		String encodedPwd=new String(passBytes);
		System.out.println("Plain Password : "+password+"   ---   Encoded password : "+encodedPwd);
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedPwd.getBytes());
		String decodedPwd=new String(decode);
		System.out.println("Encoded password : "+encodedPwd+"   ---   Decoded password : "+decodedPwd);
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(password.getBytes());
		
		String str=new String(digest);
		System.out.println("Encrypted password : "+str);
		
		byte[] encode = encoder.encode(str.getBytes());
		String encodedAndEncPwd=new String(encode);
		System.out.println("Encrypted+EncodedPwd : "+encodedAndEncPwd);
		
		byte[] decode2 = decoder.decode(encodedAndEncPwd);
		String decString=new String(decode2);
		System.out.println(decString);
		
	}

}
