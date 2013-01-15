package com.guille.codebreaker.tests;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

import com.guille.codebreaker.CodeColour;
import com.guille.codebreaker.CodeGenerator;

public class CodeGeneratorTest {

	@Test
	public void testGenerateCode(){
		CodeGenerator cg = new CodeGenerator();
		cg.generateCode();
	    ArrayList<CodeColour> code = (ArrayList<CodeColour>) cg.getCode();
	    
	    for(CodeColour colour : code){
	    	Assert.assertTrue(CodeColour.getList().contains(colour));
	    }
	}
	
}
