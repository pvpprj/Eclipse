package Practice;

public class Miss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int s,total,m,n,missing;
		n=a.length;                                                                
		m=n+1;
		
		total=m*(m+1)/2;
		
		s=0;
		for(int i=0;i<n;i++)
		{
			s=s+a[i];
		}
		
		missing=total-s;
		
		System.out.println("Missing : "+missing);
		
	
	}

}
