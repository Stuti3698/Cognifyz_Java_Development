package numberguess;

import java.util.Scanner;

public class palindromchecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to be checked: ");
		String str=sc.nextLine();
		String rev="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			rev=ch+rev;
		}
		if(str.equals(rev)) {
			System.out.println("The given string " +str+" is palindrome");
		}
		else {
			System.out.println("The given string " +str+" is not palindrome.");
		}
		
	}
}
