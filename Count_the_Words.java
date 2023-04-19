package Strings;

import java.util.Scanner;

public class Count_the_Words {

	
	public static void main(String[] args) {
		
		// Count the words in the String
		
		/*System.out.println("Enter the String");
		
		Scanner sc = new Scanner(System.in);					//Using scanner class
		String s=sc.nextLine();
		
		int count=1;
		
		for (int i=0;i<s.length()-1;i++) {
		
			if((s.charAt(i) ==' ')  && (s.charAt(i+1)!=' ')){
				
				count++;
			}
		}
		
		System.out.println("Number of words given sentance:" +" "+count);*/

		String sen="Selinium is a Testing Tool";
	
		int count=1;
		
		for(int i=0;i<sen.length()-1;i++) {
			
			if((sen.charAt(i)==' ') && (sen.charAt(i+1)!=' ')){
				count++;
			
			}
		}
		
		System.out.println("Number of the words: "+ count);		
		
		}
		
	}
