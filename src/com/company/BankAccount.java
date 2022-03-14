package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }
    protected void WithDraw (int sum) throws  LimitExaption
    {
        if (amount<sum){
            throw new LimitExaption("jib.", amount);
        }
        else {
            amount -= sum;
        }
    }
}
