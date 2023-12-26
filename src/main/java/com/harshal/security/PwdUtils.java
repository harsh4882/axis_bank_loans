package com.harshal.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {
	
	public String  encodePwd(String pwd) {
		
		Encoder encoder = Base64.getEncoder();
		
		byte[] enocode = encoder.encode(pwd.getBytes());
		
		String encodedPwd = new String(enocode);
		
		return encodedPwd;
	}
}
