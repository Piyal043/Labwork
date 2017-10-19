package com.myproject.labwork;

import java.util.Scanner;

public  class Twod implements Shape{
	public void dimension()
	{
		System.out.println("I am a 2d object");
	}
	public void area()
	{
		System.out.println("Enter two parameter");
		int a=0,b=0;
		Scanner scr=new Scanner(System.in);
		a=scr.nextInt();
		b=scr.nextInt();
		System.out.println("My area is"+a*b+"  meter square.");
	}
}
