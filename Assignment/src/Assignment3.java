import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the principal:  ");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the time(in years): ");
		double time = sc.nextDouble();

		System.out.print("Enter number of times interest is compounded: ");
		int number = sc.nextInt();
		double simpleInterest = (principal * time * rate) / 100;
		double compoundInterest = principal * (Math.pow((1 + rate / 100), (time * number))) - principal;

		// System.out.println("Principal: " + principal);
		System.out.println("Interest Rate: " + rate);
		System.out.println("Time Duration: " + time);
		System.out.println("Time Duration: " + number);
		System.out.println("Simple Interest: " + simpleInterest);
		System.out.println("Compound Interest: " + compoundInterest);
	}

}
