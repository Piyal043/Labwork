package com.myproject.labwork;

public class Veriadic {
	public void print(int... args )
	{
		for(int arg : args) {
			System.out.print(arg+" ");
		}
	}
}
