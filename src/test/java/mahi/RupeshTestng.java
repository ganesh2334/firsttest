package mahi;

import org.testng.annotations.Test;

public class RupeshTestng {
	@Test (priority=1)
	public void configur()
	{
		System.out.println("hi from 1");
	}

	@Test (priority=2)
	public void Rupi1()
	{
		System.out.println("hi from 2");
	}
	
	@Test (priority=3)
	public void Rupi2()
	{
		System.out.println("hi from 3");
	}
}
