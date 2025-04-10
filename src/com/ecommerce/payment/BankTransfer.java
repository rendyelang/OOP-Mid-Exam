package com.ecommerce.payment;

public class BankTransfer extends PaymentMethod implements Payable {

    public BankTransfer(String accountName, String accountId) {
        super(accountName, accountId);
    }

    @Override
    public void validateAccount() {
        // Logic to validate bank account details
        System.out.println("Verifying Bank account: " + accountName + " - " + accountId);
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process bank transfer payment
        System.out.println("Processing payment via Bank Transfer...");
        validateAccount();
        System.out.println("Payment of Rp. " + amount + " was successful");
    }
}
