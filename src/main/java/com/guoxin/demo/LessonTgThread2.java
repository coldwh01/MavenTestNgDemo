package com.guoxin.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LessonTgThread2 {
	
	private Thread current;
	
	@BeforeMethod
	public void testThread() {
		current = Thread.currentThread();
	}
	
	@Test
	public void t1() {
		System.out.println(current.getId()+"--run t1");
	}
	@Test
	public void t2() {
		System.out.println(current.getId()+"--run t2");
	}
	@Test
	public void t3() {
		System.out.println(current.getId()+"--run t3");
	}
	

}
