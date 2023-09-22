package javanew;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        
        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, n);
            number /= 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

	}

}
