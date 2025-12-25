package com.test.lib1;

public class Source1 {
	private String ENVIRONMENT="PRODUZIONE";
	private int num = 1000;
	
	public void printEnvironment() {
		System.out.println("Get first number from "+ENVIRONMENT+" environment");
	}

	public int getEnvironmentNumber() {
		return num;
	}
}
