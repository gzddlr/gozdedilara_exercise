package com.gozdedilarayilmaz;

public class SalesPerson extends employee {
    private double comissionPercentage;

    public SalesPerson(String name, double salary, int age, double comissionPercentage) {
        super(name, salary, age);
        this.comissionPercentage = comissionPercentage;
    }

    public double getComissionPercentage() {
        return comissionPercentage;
    }

    public void raiseComission() {
        if (this.comissionPercentage < .30) {
            this.comissionPercentage =
                    this.comissionPercentage * 1.2;
        }
    }
}
