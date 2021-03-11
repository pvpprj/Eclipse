package Program;

public class Pattern {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int i,j,k,n;
		n=5;
			
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
				for(k=0;k<2*i-1;k++)
				{
					System.out.print("*");
				}
				
				System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
