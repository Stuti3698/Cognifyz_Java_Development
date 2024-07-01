package numberguess;

import java.util.Scanner;

public class tempconverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fahrenheit to Celsius(1) or Celsius to Fahrenheit(2)");
		int choice=sc.nextInt();
		if(choice==1) {
			//Calculation of temperature from Fahrenheit to Celsius
			System.out.println("Enter Fahrenheit value: ");
			double value=sc.nextDouble();
			double valuefinal=(value-32)*5/9;
			System.out.println("Celsius is: ");
			System.out.println(Math.round(valuefinal*10.0)/10.0);
			
		}
		else if(choice==2) {
			//Calculation of temperature from Celsius to Fahrenheit
			System.out.println("Enter celsius value: ");
			double value2=sc.nextDouble();
			double finalres=value2*1.8+32;
			System.out.println("Fahrenheit is: ");
			System.out.println(Math.round(finalres*10.0)/10.0);
		}
		else {
			System.out.println("Not a valid choice");
			
		}
	}
}
