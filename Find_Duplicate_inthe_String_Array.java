package SDET_Java_General_Programs;

import java.util.HashSet;

public class Find_Duplicate_inthe_String_Array {

	public static void main(String[] args) {

		
		
//		String a[]={"java","C++","C#","Phyton","C++"};
		
//		boolean flag = false;
	
//		for(int i=0;i<a.length;i++) {
		
//			for(int j=i+1;j<a.length;j++) {
			
//				if(a[i]==a[j]) {
//					System.out.println("Duplicate element found: "+a[i]);
//					flag=true;
//				}
//			}
//		}
	
//		if(flag==false) {
//			System.out.println("Duplicate element not found");
//		}
		
	
/*	int a[]= {10,20,45,29,30,20};
	
	boolean flag=false;
	for (int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				System.out.println("dupliate number found:"+a[i]);
				flag=true;
			}
		}
	}		
		if(flag==false) {
		System.out.println("duplicate not found");	
		}*/
	
		
	// Approch2 with HashSet
		
		String a[]={"java","C++","C#","Phyton","C++","java"};
		
		HashSet<String> lag=new HashSet<String>();
		
		boolean flag=false;
//		System.out.println(lag.add("Java"));
//		System.out.println(lag.add("python"));
//		System.out.println(lag.add("Java"));
	
		for(String l:a) {
			
			if(lag.add(l)==false) {
				System.out.println("duplicate element found: "+ l);
				flag=true;				
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not found: ");
		}
		
		
		
	}

}
