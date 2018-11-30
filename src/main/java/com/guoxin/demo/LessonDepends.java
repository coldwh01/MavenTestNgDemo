package com.guoxin.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LessonDepends {
	@Test(groups="a",alwaysRun=true)
	public void test1() {
		System.out.println("--test1 is running");
	}
	@Test(groups="b")
	public void test2() {
		assertEquals(1, 2);
		System.out.println("--test2 is running");
	}
	@Test(groups="c")
	public void test3() {
		System.out.println("--test3 is running");
	}
	@Test(groups="d")
	public void test4() {
		System.out.println("--test4 is running");
	}

}
