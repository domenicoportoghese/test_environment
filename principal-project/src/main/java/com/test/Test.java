package com.test;

import com.test.lib1.Source1;
import com.test.lib2.Source2;

public class Test {
	private static String ENVIRONMENT="PRODUZIONE";

	public static void main(String[] args) {
		Source1 source1 = new Source1();
		Source2 source2 = new Source2();
		
		System.out.println("Statistiche sull'ambiente di "+ENVIRONMENT);
		
		source1.printEnvironment();
		int num1 = source1.getEnvironmentNumber();

		source2.printEnvironment();
		int num2 = source2.getEnvironmentNumber();
		
		int sum = num1+num2;
		System.out.println(sum);
	}

}
