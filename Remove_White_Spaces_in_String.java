package SDET_Java_General_Programs;

public class Remove_White_Spaces_in_String {

	public static void main(String[] args) {

		String str="Java    programs     are  very    tuff for non IT   Students";
		System.out.println("before remvie spacess:"+ str);
		
		str=str.replaceAll("\\s", "");
		
		System.out.println("After removed spacess :"+str);
		
	}

}
