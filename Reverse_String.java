package Strings;

public class Reverse_String {

	public static void main(String[] args) {
	
	// Reverse String for Single word:
		
	/*	String name = "Rameshraj";
		
		String reverse="";
		
		for(int i=name.length();i>=0;i--) {
			
			reverse=reverse+name.charAt(i);
						
		}
				System.out.println(name);
				System.out.println(reverse);	*/
				
				
			
// Reverse Multipul Words in a String 	Approach 1
		
	/*	String sen="Java is the Big Sylabus";
		
		String [] words=sen.split(" ");
		
		String reverseString="";
		
		for (String  w:words) {
			
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseword=reverseword+w.charAt(i);	
			}
			
			reverseString=reverseString+reverseword+" ";			
		}
		System.out.println(reverseString);	*/
		
		
// Reverse Multipul Words in a String 	Approach 2
		
	/*	String s="I am a business man";
		
		String [] words=s.split(" ");
		
		String reverseString="";
		
		for(String w:words) {
		
			String reversewords="";
			
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversewords=reversewords+sb.toString();
			reverseString =reverseString+reversewords+" ";
		}
			System.out.println(reverseString);*/
	
	
	//demo
			
			String r= "ramesh";
			StringBuilder sb=new StringBuilder(r);
			String reverse=sb.reverse().toString();
			System.out.println(reverse);
			
	
	
	}

}
