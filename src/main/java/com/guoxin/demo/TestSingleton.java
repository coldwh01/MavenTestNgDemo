package com.guoxin.demo;

public class TestSingleton {
	
	private static TestSingleton uniqueInstance;
	private TestSingleton() {}
	public static synchronized TestSingleton getInstance() {
		if(null==uniqueInstance) {
			uniqueInstance = new TestSingleton();
			System.out.println("Singleton.getInstance is called");
		}
		return uniqueInstance;
	}
}
