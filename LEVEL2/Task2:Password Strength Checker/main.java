package numberguess;

import java.util.Scanner;

public class passwordstrengthchecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your desired password: ");
		String password=sc.nextLine();
		String strengthfeedback=checkPassword(password);
		System.out.println(strengthfeedback);
	}
	
	public static String checkPassword(String password) {
		int lengthcriteria=0;
		boolean hasupper=false;
		boolean haslower=false;
		boolean hasDigit=false;
		boolean hasSpecial=false;
		String specialChar="!@#$%^&*()_+{}[]|;:,.~`";
		
		if(password.length()>=lengthcriteria) {
			for(char c:password.toCharArray()) {
				if(Character.isUpperCase(c)) {
					hasupper=true;
				}
				else if(Character.isLowerCase(c)) {
					haslower=true;
				}
				else if(Character.isDigit(c)) {
					hasDigit=true;
				}
				else if(specialChar.contains(String.valueOf(c))) {
					hasSpecial=true;
				}
			}
			if(hasupper && haslower && hasDigit && hasSpecial) {
				return "It is a strong password";
			}
			else {
				return "It is a weak password.";
			}
		}
		else {
			return "Password length should be at least "+lengthcriteria+" characters!";
		}
	}
}
