package Strings;

public class Count_Occurrences_of_a_Character_in_a_String {

	public static void main(String[] args) {
		
		//particular charcter how many times come aganin 
		
		String str="Java programs and opps concepts";
		
		int totalcount=str.length();
		int after_remove_letter=str.replaceAll("J", "").length();
		
		int count=totalcount-after_remove_letter;
		
		System.out.println("Number of Occurrences of a:"+count);
		
	}

}
