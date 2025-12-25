package com.test.lib2;

public class Source2 {
	private String ENVIRONMENT="PRODUZIONE";
	private int num = 2000;
	
	public void printEnvironment() {
		System.out.println("Get second number from "+ENVIRONMENT+" environment");
	}

	public int getEnvironmentNumber() {
		return num;
	}

}
