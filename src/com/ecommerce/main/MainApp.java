package com.ecommerce.main;
import java.util.Scanner;

import com.ecommerce.payment.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the E-Commerce Payment System!");
        System.out.print("Enter your payment method (bank/ewallet/credit): ");
        String paymentType = scanner.nextLine().toLowerCase();

        if (!paymentType.equals("bank") && !paymentType.equals("ewallet") && !paymentType.equals("credit")) {
            System.out.println("Invalid payment method selected.");
            System.out.println("Please select either 'bank', 'ewallet', or 'credit'.");
            scanner.close();
            return;
        }
        System.out.print("Enter your account name: ");
        String accountName = scanner.nextLine();

        System.out.print("Enter your account ID: ");
        String accountId = scanner.nextLine();

        System.out.print("Enter the amount to pay: Rp. ");
        double amount = scanner.nextDouble();

        Payable payment;


        switch (paymentType) {
            case "bank":
                payment = new BankTransfer(accountName, accountId);
                break;
            case "ewallet":
                payment = new EWallet(accountName, accountId);
                break;
            case "credit":
                payment = new CreditCard(accountName, accountId);
                break;
            default:
                System.out.println("Invalid payment method selected.");
                scanner.close();
                return;
        }

        System.out.println();
        payment.processPayment(amount);
        scanner.close();
        System.out.println("Thank you for using our payment system!");
    }
}
