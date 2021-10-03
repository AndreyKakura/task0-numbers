package com.kakura.task0.customnumber;

public class CustomNumber {
    private double number;

    public CustomNumber() {
    }

    public CustomNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return this.number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(this.number);
    }

}
