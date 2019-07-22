package com.TestNG.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	
	int b=5;
	int a=20;
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("Set Up");
	}
	
@Parameters({"name"})	
	@Test(priority=1)
	public void add(String name)
	{
		Assert.assertEquals(name, "Gunjan");
		Assert.assertEquals(a+b, 25);
		System.out.println("adding numbers");
		
	}
	@Test(priority=2)
	public void subtract()
	{
		Assert.assertEquals(a-b, 15);
		System.out.println("subtract numbers");
	}
	@Test(priority=3)
	public void multiply()
	{
		Assert.assertEquals(a*b, 100);
		System.out.println("multiply numbers");
	}
	@Test
	public void divide() throws InterruptedException 
	{
		Thread.sleep(2000);
		Assert.assertEquals(a/b, 4);
	}


}
