package com.methodreference;

public class InstanceMethodReference {

	public void m3()
	{
		System.out.println("Instance M3 method executed.");
	}
	
	public static void main(String[] args) {

		InstanceMethodReference imr=new InstanceMethodReference();
		Runnable run=imr::m3;
		Thread thread=new Thread(run);
		thread.run();
	}
}
