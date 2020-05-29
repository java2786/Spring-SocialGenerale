package com.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyEncoder {

	public static void main(String[] args) {
		String encodedPwd = encode("123456");
		System.out.println(encodedPwd);
		
		System.out.println(verify("123456", encodedPwd));	
		System.out.println(verify("hello", encodedPwd));	
		System.out.println(verify("12345", encodedPwd));	
		System.out.println(verify("12456", encodedPwd));	
		System.out.println(verify("encode", encodedPwd));	
	}

	private static boolean verify(String pwd, String encodedPassword) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.matches(pwd, encodedPassword);
	}
	private static String encode(String pwd) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd = encoder.encode(pwd);
		
//		System.out.println(encodedPwd);
		return encodedPwd;
	}
	
	
}
