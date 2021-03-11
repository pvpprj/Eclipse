package Program;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<String>();
		h.add("a");
		h.add("a");
		h.add("a1");
		h.add("a2");
		h.add("a3");
		
		for(Object o: h)
			System.out.print(o+" ");
		System.out.println();
		
		Iterator i1=h.iterator();
		while(i1.hasNext())
			System.out.print(i1.next()+" ");
	
	}
}