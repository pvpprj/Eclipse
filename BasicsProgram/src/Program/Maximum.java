package Program;

public class Maximum {
	
	public static void main(String[] args) {
		
		int a[]= {1,4,10,5,6,29};
		
		int max,i ,j;
		max=a[0];
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}		
		System.out.println("Max no : "+max);

	}}
