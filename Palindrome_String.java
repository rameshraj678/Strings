package SDET_Java_General_Programs;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

	/*	Scanner sc= new Scanner (System.in);
		
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
		}*/
	
//Approach 2 using by middile concept 
		
		String str = "racecar";
		String upp=str.toUpperCase();
        
//		System.out.println(upp);		// check the change lowercase to uppercase 
	
		boolean isPalindrome = true;

        for (int i = 0; i < upp.length() / 2; i++) {
            if (upp.charAt(i) != upp.charAt(upp.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(upp + " is a palindrome.");
        } else {
            System.out.println(upp + " is not a palindrome.");
        }
		
		
		
	}

}
