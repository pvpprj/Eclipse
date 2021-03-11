package Program;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,n,i;
		n=10;
		
		a=1;b=1;
		
		for(i=1;i<=n-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}	
	}
}
