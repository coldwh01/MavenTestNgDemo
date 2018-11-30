package com.guoxin.demo;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class HelpDataProvider {
	
	@DataProvider(name="testData1")
	public static Object[][] test1() {
		return new Object[][]{{"Cedric",new Integer(36)},{"Anne",new Integer(37)}};
	}
	
	@DataProvider(name="testData2")
	public static Object[][] test2() {
		return new Object[][]{{"wanghao",new Integer(36)},{"duanli",new Integer(37)}};
	}
	
	@DataProvider(name="testData")
	public static Object[][] test(Method m) {
		return getData(m.getName());
	}

	private static Object[][] getData(String name) {
		// TODO Auto-generated method stub
		if("test3".equals(name)) {
			return new Object[][]{{"wanghao",new Integer(36)}};
		}
		if("test4".equals(name)) {
			return new Object[][]{{"duanli",new Integer(36)}};
		}
		if("test5".equals(name)) {
			return new Object[][]{new Object[]{new Integer(36)}};
		}
		return null;
	}


}
