package com.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int number= scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }


}
