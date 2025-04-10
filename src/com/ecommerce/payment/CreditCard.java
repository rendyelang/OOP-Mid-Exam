package com.ecommerce.payment;

public class CreditCard extends PaymentMethod implements Payable {

    public CreditCard(String accountName, String accountId) {
        super(accountName, accountId);
    }

    @Override
    public void validateAccount() {
        // Logic to validate bank account details
        System.out.println("Verifying Credit Card account: " + accountName + " - " + accountId);
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process Credit Card payment
        System.out.println("Processing payment via Credit Card...");
        validateAccount();
        System.out.println("Payment of Rp. " + amount + " was successful");
    }
}