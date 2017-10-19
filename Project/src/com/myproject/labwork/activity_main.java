package com.myproject.labwork;

public class activity_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Square(); 
        Doo d=new Doo();
        d.dosomething(s);
        Veriadic a=new Veriadic();
        a.print(1,2,3,4);
        //a.make(s);
	}

}
