package Strings;

import java.util.Scanner;

public class Revarse_Number_And_String {

	public static void main(String[] args) {
	
//Reverse Number using Algarithom
	
/*		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number: ");	
		int num= sc.nextInt();  //1234
		
		int rev=0;
		while (num !=0) {
			
			rev=rev*10 +num%10;
			num=num/10;			
		}
		System.out.println("reverse Number is:"+ rev);
		
// Reverse number using String Buffer class
		

		
//Revarse String 	
		
		String a="ABCD";
		String rev ="";
		
		int len=a.length();		
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+a.charAt(i);		
		
		}
		
		System.out.println(rev);
	
		
//Revarse String  2nd approch using Array
		
/*		String a="ABCD";
		String rev="";
		
		char r []=a.toCharArray();
		int length=a.length();
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+r[i];
		}	*/
		
// Reverse String user Buffer Class
		String a="DCBA";
			
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());
		
		
}
}
