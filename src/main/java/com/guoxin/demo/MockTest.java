package com.guoxin.demo;


import static org.mockito.Mockito.mock;

import java.util.List;

import org.testng.annotations.Test;

public class MockTest {
	@Test
	public void myTest() {
//		通过方法创建mock对象
		List list =mock(List.class);
//		设置预期，当调用get(0)方法时返回设定的值
//		when(list.get(0)).thenReturn("1");
//		设置多次调用时的值
//		when(list.get(anyInt())).thenReturn("1", "2");
//		doReturn("1").doReturn("2").when(list).get(anyInt());
//		返回值为void，则设置为doNothing()
//		doNothing().when(list).get(anyInt());
//		String ret = (String)list.get(0);
//		Assert.assertEquals(ret, "1");		
//		ret = (String)list.get(1);
//		Assert.assertEquals(ret, "2");
//		验证操作，默认是验证调用了1次
//		verify(list).get(0); 
//		验证操作，验证 get(0) 调用了 2次
//		verify(list,times(2)).get(0);

//		对方法设定返回异常，调用mock某个方法时报异常
//		when(list.get(anyInt())).thenThrow(new RuntimeException());
//		对 void方法设定异常
//		doThrow(new RuntimeException()).when(list.get(anyInt()));
//		String ret = (String)list.get(0);
		
		/* 设置方法调用顺序 */
		/*  查询是否存在被调用，但未被 verify 验证的方法 */
		/* 参数捕获器 */
//		ArgumentCaptor 参数捕获器，捕捉到的参数为最后一次调用method时传入的参数
//		ArgumentCaptor<Integer> argumentCaptor = ArgumentCaptor.forClass(Integer.class);
//	    verify(list, times(2)).get(argumentCaptor.capture());
//	    System.out.println("argument:" + argumentCaptor.getValue());		
	
	}
	
	public static void main(String[] args) {
		Object[][] obj = new Object[][]{{1,2,3},{4,5,6}};
		System.out.println(obj[1][2]);
	}

}
