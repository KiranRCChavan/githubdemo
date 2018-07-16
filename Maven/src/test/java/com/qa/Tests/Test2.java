package com.qa.Tests;

import org.testng.annotations.Test;

import com.qa.main.mainClass;

public class Test2 {

	@Test
	public void test4()
	{
		
		System.out.println(" I am Test four ");
		
	}
	
	@Test
	public void test5()
	{
		
		System.out.println(" I am Test five ");
		
	}

	
	@Test
	public void test6()
	{
		
		System.out.println(" I am Test six ");
		System.out.println("Iam Test six and calling main main class");
		mainClass.mainclass();
		
	}
	
	
}
