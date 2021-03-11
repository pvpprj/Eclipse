package Program;

public class srr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abcAbCaBc";
		int c[] = new int[256]; 
		int len = str.length(); 

		for (int i = 0; i < len; i++) 
			c[str.charAt(i)]++; 

		char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) 
        { 
	      array[i] = str.charAt(i); 
	      int t = 0; 
	   
	        for (int j = 0; j <= i; j++) 
	        { 
		      if (str.charAt(i) == array[j])  
				t++;                 
		   } 
        
        if (t == 1)  
  	      System.out.println("Repeat of char " + str.charAt(i)+"=" + c[str.charAt(i)]);             
  	} 
		
	}
}
