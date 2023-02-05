package com.LogicalPrograms;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int remainder;
        while( number != 0 ) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number   = number/10;
        }
        System.out.println("reverse number is: " +reverse);
    }
}
