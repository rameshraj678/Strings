package SDET_Java_General_Programs;

public class Remove_Junk_or_Special_Characters_in_String {

	public static void main(String[] args) {
		
		
		// Remove Junk or Special Characters
		
		String  ra="America is@$^$%^^%^the country";
		
		ra=ra.replaceAll("[^a-zA-Z0-9]", "");	
		System.out.println(ra);

	}

}
