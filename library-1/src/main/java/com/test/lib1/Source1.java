package com.test.lib1;

public class Source1 {
	private String ENVIRONMENT="VALIDAZIONE";
	private int num = 100;
	
	public void printEnvironment() {
		System.out.println("Get first number from "+ENVIRONMENT+" environment");
	}

	public int getEnvironmentNumber() {
		return num;
	}
}
