package com.guille.codebreaker.tests;

import java.io.ByteArrayInputStream;

import junit.framework.Assert;

import org.junit.Test;

import com.guille.codebreaker.SecurityDoor;
import com.guille.codebreaker.exceptions.InvalidInputException;

public class SecurityDoorTest {

	@Test(expected=InvalidInputException.class)
	public void testReadInputCodeWrongSize() throws Exception{
		SecurityDoor sd = new SecurityDoor();
		ByteArrayInputStream in = new ByteArrayInputStream("RVI".getBytes());
		sd.readCode(in);
	}
	
	@Test
	public void testReadInputCode() throws Exception{
		SecurityDoor sd = new SecurityDoor();
		sd.setCode("AAAI");
		ByteArrayInputStream in = new ByteArrayInputStream("AAAA".getBytes());
		Assert.assertEquals(sd.readCode(in), "XXX*");
	}
	
	@Test
	public void testReadInputCodeYNYI() throws Exception{
		SecurityDoor sd = new SecurityDoor();
		sd.setCode("RANI");
		ByteArrayInputStream in = new ByteArrayInputStream("MNMI".getBytes());
		Assert.assertEquals("X*",sd.readCode(in));
	}
	
	@Test
	public void testReadInputCodeRMVI() throws Exception{
		SecurityDoor sd = new SecurityDoor();
		sd.setCode("RANI");
		ByteArrayInputStream in = new ByteArrayInputStream("RMVI".getBytes());
		Assert.assertEquals(sd.readCode(in), "XX");
	}
	
	@Test
	public void testReadInputCodeRRVN() throws Exception{
		SecurityDoor sd = new SecurityDoor();
		sd.setCode("NRRI");
		ByteArrayInputStream in = new ByteArrayInputStream("RRVN".getBytes());
		Assert.assertEquals(sd.readCode(in), "X**");
	}

}
