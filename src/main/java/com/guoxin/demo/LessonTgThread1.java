package com.guoxin.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LessonTgThread1 {
	
	private Thread current;
	
	@BeforeMethod
	public void testThread() {
		current = Thread.currentThread();
	}
	
	@Test(threadPoolSize=5,invocationCount=20)
	public void test1() {
		System.out.println(current.getId()+"--run test1");
	}
	@Test
	public void test2() {
		System.out.println(current.getId()+"--run test2");
	}
	@Test
	public void test3() {
		System.out.println(current.getId()+"--run test3");
	}
	

}
