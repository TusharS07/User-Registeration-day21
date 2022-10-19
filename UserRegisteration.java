package com.bridgelabz.userRegisteration;

import java.util.Scanner;

public class UserRegisteration {


    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");
        System.out.println("----------------------------------------");
        UserRegisterationOprations operations = new UserRegisterationOprations();
        Scanner sc = new Scanner(System.in);
        int choice;
        int ans;
        do {
            System.out.println("Enter Your Choice: ");
            System.out.println("1: Validate name. \n0: Exit.");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    operations.validFirstName();
                    break;

                default:
                    System.out.println("Please Choose Valid Option ");
                    break;
            }
            System.out.println("If Continue Press 1");
            ans = sc.nextInt();
        } while (ans == 1);
    }
}
