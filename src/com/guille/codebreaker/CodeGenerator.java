package com.guille.codebreaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeGenerator {

	private final int CODE_SIZE = 4;
	private List<CodeColour> code = new ArrayList<CodeColour>();
	
	public void generateCode() {
		
		code = new ArrayList<CodeColour>();
		Random random = new Random();
		
		for(int i = 0; i < CODE_SIZE; i++){
			int index = random.nextInt(CodeColour.values().length - 1);
			code.add(CodeColour.getByOrdinal(index));
		}
	}
	
	public List<CodeColour> getCode() {
		return code;
	}
	
}
