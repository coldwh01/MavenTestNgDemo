package com.guoxin.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@Test(dataProvider="testData2", dataProviderClass=HelpDataProvider.class,enabled=false)
	public void verifyData1(String n1,Integer n2) {
		System.out.println(n1+":"+n2);
	}
	
	@Test(dataProvider="testData", dataProviderClass=HelpDataProvider.class)
	public void test3(String n1,Integer n2) {
		System.out.println(n1+":"+n2);
	}
	
	@Test(dataProvider="testData", dataProviderClass=HelpDataProvider.class)
	public void test4(String n1,Integer n2) {
		System.out.println(n1+":"+n2);
	}
	@Test(dataProvider="testData", dataProviderClass=HelpDataProvider.class)
	public void test5(String n1,Integer n2) {
		System.out.println(n1+":"+n2);
	}
}
