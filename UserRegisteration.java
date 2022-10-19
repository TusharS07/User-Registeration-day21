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
            System.out.println("""
                    1: Validate First Name.\s
                    2: Validate Last Name.\s
                    3: Validate Email_Id.\s
                    4: Validate Mobile Number.\s
                    5: Validate Password."""
            );
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    operations.validFirstName();
                    break;

                case 2:
                    operations.validLastName();
                    break;

                case 3:
                    operations.validEmail_Id();
                    break;

                case 4:
                    operations.validMobileFormat();
                    break;

                case 5:
                    operations.validPassword();
                    break;

                default:
                    System.out.println("Please Choose Valid Option ");
                    break;
            }
            System.out.println();
            System.out.println("If Continue Press '0' ");
            System.out.println("If Continue Press '1' ");
            ans = sc.nextInt();
        } while (ans == 0);
    }
}
