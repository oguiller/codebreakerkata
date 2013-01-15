package com.guille.codebreaker;

import java.util.ArrayList;
import java.util.List;

import com.guille.codebreaker.exceptions.InvalidInputException;

public enum CodeColour {
	
	R ("Rojo"),A ("Azul"),M ("Amarillo") ,V ("Verde"),N ("Naranja"),I ("Violeta");
	
	private final String name;
	
	CodeColour(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static List<CodeColour> getList(){
		
		List<CodeColour> colours = new ArrayList<CodeColour>();
		
		for(CodeColour colour: CodeColour.values()){
			colours.add(colour);
		}
		
		return colours;
	}
	
	public static CodeColour getByOrdinal(int index){
		
		return values()[index];
	}
	
	public static CodeColour getByCharacter(char character){
		
		if(Character.toUpperCase(character) == CodeColour.R.toString().charAt(0)){
			return R;
		} else if(Character.toUpperCase(character) == CodeColour.A.toString().charAt(0)){
			return A;
		} else if(Character.toUpperCase(character) == CodeColour.M.toString().charAt(0)){
			return M;
		} else if(Character.toUpperCase(character) == CodeColour.V.toString().charAt(0)){
			return V;
		} else if(Character.toUpperCase(character) == CodeColour.N.toString().charAt(0)){
			return N;
		} else {
			return I;
		}
	}
	
	public static List<CodeColour> getListFromString(String code) throws InvalidInputException {
		
		List<CodeColour> codeList = new ArrayList<CodeColour>();
		
		for(int i =0; i < code.length(); i++){
			codeList.add(CodeColour.getByCharacter(code.charAt(i)));
		}
		
		return codeList;
	}
	
}
