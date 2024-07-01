package numberguess;
import java.util.Random;
import java.util.Scanner;
public class randompasswordgenerator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String specialChar="<>,.?/}]{[+-_)(*&^%$#@!=~`";
		String combination=upper+lower+specialChar;
		System.out.println("Enter number of letters to be included in password: ");
		int len=sc.nextInt();
		char[] password=new char[len];
		Random r=new Random();
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println("Generated password is: "+new String(password));
	}
}
