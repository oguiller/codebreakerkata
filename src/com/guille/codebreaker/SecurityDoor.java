package com.guille.codebreaker;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import com.guille.codebreaker.exceptions.InvalidInputException;

public class SecurityDoor {
	
	private List<CodeColour> code;
	
	public SecurityDoor(){
		CodeGenerator codeGenerator = new CodeGenerator();
		codeGenerator.generateCode();
		code = codeGenerator.getCode();
		System.out.println("The code generated is: "+code);
	}

	public String readCode(InputStream in) throws Exception {
		String code = readCodeFromInput(in);
		performValidations(code);
	    return analyzeCode(code);
	}

	private void performValidations(String code) throws Exception {
		CodeValidator.checkCode(code);
		CodeValidator.checValidString(code);
	}

	private String readCodeFromInput(InputStream in) {
		String code = "";
		Scanner scanner = new Scanner(in);
		System.out.println("Please introduce the code: ");
		code = scanner.next();
		return code;
	}

	private String analyzeCode(String code) throws InvalidInputException {
		List<CodeColour> codeColour = CodeColour.getListFromString(code);
		String output = createOutputCode(codeColour);
		return output;
	}

	private String createOutputCode(List<CodeColour> codeColour) {
		StringBuffer xOutput = new StringBuffer();
		StringBuffer starOutput = new StringBuffer();
		
		for(int i = 0; i < codeColour.size(); i++){
			if(this.code.contains(codeColour.get(i))){
				if(codeColour.get(i).equals(this.code.get(i))){
					xOutput.append("X");
				} else {
					starOutput.append("*");
				}
			}
		}
		
		String output = xOutput.append(starOutput).toString();
		return output;
	}

	public void setCode(String code) throws InvalidInputException{
		this.code = CodeColour.getListFromString(code);
	}
	
}
