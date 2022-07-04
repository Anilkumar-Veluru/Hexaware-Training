import java.util.ArrayList;
import java.util.Iterator;

import java.util.*;

class A
{

}
public class Demo4
{
	public static void main(String[]args)
	{
	//ArrayList al=new Arraylist();
	LinkedList al=new LinkedList();
	    al.add(100);
		al.add("Thanesh");
		al.add(true);
		al.add('A');
		al.add(10.6);
		al.addFirst(99999);
		
		
		Iterator il=al.iterator();
		while(il.hasNext())
		{
		System.out.println(il.next());
		}
	}
}