package Program;

public class Pass {

	public static void main(String[] args) {

		int i, j, k, n,m,b,sum;
		
		int no=33;
		
		for(i=2;i<=no;i++)
		{
		 if(no%i==0)
		 {
			 break;
		 }
		}
		
		if(no==i)
			System.out.println("Prime");
		else
			System.out.println("not Prime");
		
		
		
	}}