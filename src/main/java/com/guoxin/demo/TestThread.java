package com.guoxin.demo;

public class TestThread  {
	
	/*
	private String name;
	public LessionThread(String name) {
		super();
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=1;i<10;i++)
		System.out.println("-->"+i);
	}
	
	public static void main(String[] args) {
		LessionThread l1= new LessionThread("线程a");
		LessionThread l2= new LessionThread("线程b");
		l1.start();
		l2.start();
	}
	*/
	

	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<10;i++)
					System.out.println("-->"+i);
			}
		});
		t1.start();
	}

}
