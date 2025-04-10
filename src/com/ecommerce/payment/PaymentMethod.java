package com.ecommerce.payment;

public abstract class PaymentMethod {
    protected String accountName;
    protected String accountId;

    public PaymentMethod(String accountName, String accountId) {
        this.accountName = accountName;
        this.accountId = accountId;
    }

    public abstract void validateAccount();
}
