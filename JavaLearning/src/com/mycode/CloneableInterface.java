package com.mycode;// Java program to illustrate Cloneable interface
import java.lang.Cloneable;

// By implementing Cloneable interface
// we make sure that instances of class A
// can be cloned.
class A implements Cloneable
{
	int i;
	String s;
	Integer iq;
    // A class constructor
	public A(int i,String s)
	{
		this.i = i;
		this.s = s;
		iq =100;			
	}
	public A(int i,String s, int iq)
	{
		this.i = i;
		this.s = s;
		this.iq =iq;			
	}
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
	protected A clone()
	throws CloneNotSupportedException
	{
		
		A intobj =(A)super.clone();
		intobj.setValueForIq(10);
		return intobj;
	}
}

public class CloneableInterface
{
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		A a = new A(20, "GeeksForGeeks");
		A newA = new A (20,"Geeks",10);
		
		// cloning 'a' and holding
		// new cloned object reference in b

		// down-casting as clone() return type is Object
		A b = (A)a.clone();	
		A third = (A)newA.clone();
		//b.setValueForIq(10);
		System.out.println(b.i);
		System.out.println(b.s);
		System.out.println(third.iq);		
	}
	
}
