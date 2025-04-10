package com.ecommerce.payment;

public class EWallet extends PaymentMethod implements Payable {

    public EWallet(String accountName, String accountId) {
        super(accountName, accountId);
    }

    @Override
    public void validateAccount() {
        // Logic to validate bank account details
        System.out.println("Verifying E-Wallet account: " + accountName + " - " + accountId);
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process E-Wallet payment
        System.out.println("Processing payment via E-Wallet...");
        validateAccount();
        System.out.println("Payment of Rp. " + amount + " was successful");
    }
}
