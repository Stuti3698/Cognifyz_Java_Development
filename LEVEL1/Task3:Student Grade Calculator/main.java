package numberguess;

import java.util.Scanner;

public class studentgradecalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of grades of a student: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter grade "+i);
			int m=sc.nextInt();
			sum+=m;
		}
		int avg=sum/n;
		System.out.println("The average grade of student is: "+avg);
	}
}
