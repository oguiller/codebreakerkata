package com.guille.codebreaker;

import com.guille.codebreaker.exceptions.InvalidInputException;

public class CodeValidator {
	
	public static void checkCode(String code) throws Exception{
		if(code.length() != 4){
			throw new InvalidInputException("The code is 4 characters long");
		}
	}
	
	public static void checValidString(String code) throws Exception{
		CodeColour.getListFromString(code);
	}
	

}
