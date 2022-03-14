package com.company;

public class LimitExaption extends Exception{
    private double remainin;

    public LimitExaption(String message, double remainin) {
        super(message);
        this.remainin = remainin;
    }
    public double getRemainin() {
        return remainin;
    }
    protected void GetRemaininAmout(){
    }
}
