package Program;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="rar";
		int n=a.length();                                                                
		int i,j;
		
		for(i=0;i<n/2;i++)
		{
			if(a.charAt(i)!=a.charAt(n-i-1))
				break;
		}
		if(i==n/2) 
			System.out.println("Palin");
		else
			System.out.println("not Palin");
			}}
