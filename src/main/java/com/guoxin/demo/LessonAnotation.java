package com.guoxin.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LessonAnotation {
	
	@BeforeSuite
	public  void suiteBefore() {
		System.out.println("--suiteBefore is running");
	}
	@AfterSuite
	public  void suiteAfter() {
		System.out.println("--suiteAfter is running");
	}
	
	
	@BeforeTest
	public  void beforeTest() {
		System.out.println("--beforeTest is running");
	}
	@AfterTest
	public  void afterTest() {
		System.out.println("--afterTest is running");
	}
	
	
	@BeforeClass
	public  void beforeClass() {
		System.out.println("--beforeClass is running");
	}
	@AfterClass
	public  void afterClass() {
		System.out.println("--afterClass is running");
	}
	
	
	@BeforeMethod
	public  void beforeMethod() {
		System.out.println("--beforeMethod is running");
	}
	@AfterMethod
	public  void afterMethod() {
		System.out.println("--afterMethod is running"+"\n");
	}
	
	
	@BeforeGroups
	public  void beforeGroups() {
		System.out.println("--beforeGroups is running");
	}
	@AfterGroups
	public  void afterGroups() {
		System.out.println("--afterGroups is running"+"\n");
	}
	
	
	
	@Test(groups="unTest")
	public void testCase1() {
		System.out.println("testCase1 is running");
	}
	@Test(groups="unTest")
	public void testCase2() {
		System.out.println("testCase2 is running");
	}
	@Test
	public void testCase3() {
		System.out.println("testCase3 is running");
	}

}
