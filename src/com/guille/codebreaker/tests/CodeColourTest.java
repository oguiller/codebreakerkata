package com.guille.codebreaker.tests;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.guille.codebreaker.CodeColour;
import com.guille.codebreaker.exceptions.InvalidInputException;

public class CodeColourTest {
	
	@Test
	public void testGetList(){
		
		List<CodeColour> colours = CodeColour.getList();
		
		Assert.assertEquals(CodeColour.values().length, colours.size());
		Assert.assertEquals(CodeColour.values()[0],colours.get(0));
		Assert.assertEquals(CodeColour.values()[1],colours.get(1));
		Assert.assertEquals(CodeColour.values()[2],colours.get(2));
		Assert.assertEquals(CodeColour.values()[3],colours.get(3));
		Assert.assertEquals(CodeColour.values()[4],colours.get(4));
		Assert.assertEquals(CodeColour.values()[5],colours.get(5));
		
	}
	
	@Test
	public void testGetByOrdinal(){
		
		for(CodeColour colour: CodeColour.values()){
			Assert.assertEquals(colour,CodeColour.getByOrdinal(colour.ordinal()));
		}
	}
	
	@Test
	public void testGetByCharacter(){
		
		Assert.assertEquals(CodeColour.A, CodeColour.getByCharacter('a'));
		Assert.assertEquals(CodeColour.R, CodeColour.getByCharacter('R'));
		Assert.assertEquals(CodeColour.M, CodeColour.getByCharacter('M'));
		Assert.assertEquals(CodeColour.I, CodeColour.getByCharacter('i'));
		Assert.assertEquals(CodeColour.V, CodeColour.getByCharacter('v'));
		Assert.assertEquals(CodeColour.N, CodeColour.getByCharacter('n'));
	}
	
	@Test
	public void testGetListFromString() throws InvalidInputException{
		
		List<CodeColour> code = CodeColour.getListFromString("RANI");
		Assert.assertEquals(4,code.size());
		Assert.assertEquals(CodeColour.R, code.get(0));
		Assert.assertEquals(CodeColour.A, code.get(1));
		Assert.assertEquals(CodeColour.N, code.get(2));
		Assert.assertEquals(CodeColour.I, code.get(3));
		
	}
	
	

}
