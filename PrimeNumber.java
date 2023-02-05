package com.LogicalPrograms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]) {
        int number;
        int prime = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = scanner.nextInt();

        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = 0;
            }
        }
        if (prime == 1 ) {
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }
}

