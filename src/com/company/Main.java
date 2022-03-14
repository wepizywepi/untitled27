package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            System.out.println(bankAccount.getAmount());
            try {
                bankAccount.WithDraw(6000);
            } catch (LimitExaption exaption) {
                try {
                    bankAccount.WithDraw((int) bankAccount.getAmount());
                    System.out.println(bankAccount.getAmount());
                    break;
                } catch (LimitExaption e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}


