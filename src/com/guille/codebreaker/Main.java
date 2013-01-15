package com.guille.codebreaker;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SecurityDoor sd = new SecurityDoor();
		String code = "";
		
		do {
			try {
				code = sd.readCode(System.in);
				System.out.println(code);
				if(code.equals("XXXX")){
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		
		System.out.println("CODE UNLOCKED!!");

	}

}
