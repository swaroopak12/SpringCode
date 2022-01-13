package com.mycode;// Java program to illustrate Cloneable interface
import java.lang.Cloneable;

// By implementing Cloneable interface
// we make sure that instances of class A
// can be cloned.
class A1 implements Cloneable
{
	int i;
	String s;
	Integer iq;
	Integer y;
    // A class constructor
	public A1(int i,String s,int iq)
	{
		this.i = i;
		this.s = s;
	    y = 100;
		this.iq = iq;			
	}
/*	public A(int i,String s, int iq)
	{
		this.i = i;
		this.s = s;
		this.iq =iq;			
	}*/
	public int setValueForIq(int iq)
	{
		int d= iq;
		//System.out.println(d);
		return d;
	}
    	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	protected A1 clone()
	throws CloneNotSupportedException
	{
		
		A1 intobj =(A1)super.clone();
		intobj.setValueForIq(10);
		return intobj;
	}
}

public class CloneIface
{
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
				
		A1 a = new A1(20, "GeeksForGeeks",10);
		//A newA = new A (20,"Geeks",10);
		
		// cloning 'a' and holding
		// new cloned object reference in b

		// down-casting as clone() return type is Object
		A1 b = (A1)a.clone();	
		//A third = (A)newA.clone();
		//b.setValueForIq(10);
		System.out.println("Default value for i in A1: "+ a.i);
		System.out.println("Default value for s in A1: " + a.s);
		System.out.println("Default value for iq in A1: " + a.iq);
		System.out.println("Default value for y in A1: " + a.y);
		System.out.println("2nd clone i: "+ b.i);
		System.out.println("2nd clone s: " + b.s);
		System.out.println("2nd clone iq: " + b.iq);
		System.out.println("2nd clone y: " + b.y);
		//System.out.println("third clone i: "+ third.i);	
		//System.out.println("third clone s: "+ third.s);	
		//System.out.println("third clone iq: "+ third.iq);		
	}
	
}
