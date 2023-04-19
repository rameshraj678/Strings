package Strings;

import java.lang.reflect.Array;

public class Duplicate_Element_inthe_String {

	public static void main(String[] args) {

		String str="Selinium is the on of the Best Testing Tool";
		
		int count;
		
		char strn[] = str.toCharArray(); // convert to array 
		
		System.out.println("duplicate character in the given array:");
		
		for(int i=0;i<strn.length;i++) {
		
			count=1;
			
			for(int j=i+1;j<strn.length;j++) {
				
				if(strn[i]==strn[j] && strn[i]!=' '){
					count++;
					strn[j]=0;
				}		
			}	
				if(count>1 && strn[i]!='0') {
				System.out.print(strn[i]);
			 }
				
		}
		
	}

}
