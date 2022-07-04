import java.util.ArrayList;
import java.util.Iterator;

import java.util.*;
public class Demo6
{
	public static void main(String[]args)
	{
	//ArrayList al=new Arraylist();
	//LinkedList al=new LinkedList();
	Vector al=new Vector();
	    al.add(100);
		al.add("Thanesh");
		al.add(550);
		al.add('A');
		al.add(10.6);
		al.addFirst(999);
	System.out.println("==============Iterator=============");
	
	Iterator x=al.iterator();
	while(x.hasNext())
	{
		System.out.println(x.next());
	}
System.out.println("==============List Iterator=============");
	ListIterator li=al.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("============== Reverse=============");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	
	System.out.println("==============Emuneration=============");
	Emuneration e=al.elements();
	while(li.hasMoreElements())
	{
		System.out.println(li.nextElement());
	}
}
}