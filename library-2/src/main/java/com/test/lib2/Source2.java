package com.test.lib2;

public class Source2 {
	private String ENVIRONMENT="DEVELOP";
	private int num = 20;
	
	public void printEnvironment() {
		System.out.println("Get second number from "+ENVIRONMENT+" environment");
	}

	public int getEnvironmentNumber() {
		return num;
	}

}
