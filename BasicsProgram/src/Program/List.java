 package Program;

import java.util.Iterator;
import java.util.LinkedList;

public class List {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i,j ,k;
		LinkedList<String>  l = new LinkedList<String>();
		
		l.add("Raj");
		l.add("Raj");
		l.add("Raj1");
		l.add("Raj2");		
		l.add("Raj3");
		l.add("Raj3");
		
		System.out.println(l);
		
		System.out.println("For Loop");
		
		for(i=0;i<l.size();i++)
		{
		 System.out.print(l.get(i)+" ");	
		}
		System.out.println();
		
		System.out.println("For each Loop");
		for(Object o:l)
			System.out.print(o+" ");
		
		Iterator i1=l.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		
		
	}
}
