package com.guoxin.demo;

public class TestException extends Exception {
	private static final long serialVersionUID = 1L;
	 // 提供无参数的构造方法
	  public TestException() { 
		  System.out.println("我是一个自定义的异常");
	  } 

}
