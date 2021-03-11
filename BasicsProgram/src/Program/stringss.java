package Program;

public class stringss {
	
	public static void main(String[] args) {
		
		String s="Hello";
		String s1="HelloWorld";
		System.out.println("Length of String : "+s.length());   //length of string
		System.out.println("Charecter at index 2 : "+s.charAt(2));  // character at index of 2
		System.out.println("Index of o :"+s.indexOf('o'));  //  Index of char
	String s2=s1.substring(5,9);  //Substring
		System.out.println(s2);
		String s3=s1.substring(5);
		System.out.println(s3);
		
		System.out.println("last index of l : "+s.lastIndexOf('l'));
		
		
		
	}

}
