package com.myproject.labwork;

public class Doo {
	public void dosomething(Shape s)
	{
		if(s instanceof Square)
		{
			Square c=(Square)s;
		    c.show();
		    c.show2();
			c.dimension();
			c.area();			
		}
		if(s instanceof Rectangular)
		{
			Rectangular c=(Rectangular)s;
		    c.show();
		    c.show2();
			c.dimension();
			c.area();			
		}
		if(s instanceof Sphere)
		{
			Sphere c=(Sphere)s;
		    c.show();
			c.dimension();
			c.area();			
		}
		if(s instanceof Cube)
		{
			Cube c=(Cube)s;
		    c.show();
			c.dimension();
			c.area();			
		}
	}
}
