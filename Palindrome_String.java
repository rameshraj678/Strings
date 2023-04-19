package SDET_Java_General_Programs;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Letters:");
		
		String str=sc.next(); 		//giving value like MADAM
		
		String org_str=str;			// this line code used to display, palindrome yes or no 
		
		int lent=str.length();
		
		String pali="";
		
		for(int i=lent-1;i>=0;i--) {
			
			pali=pali+str.charAt(i);
		}
		
		if(org_str.equals(pali)){
			
			System.out.println(pali+" "+"Palindrome");
			
		}
		
		else {
			System.out.println(pali+" "+"Not palindrome");
		}
	}

}
