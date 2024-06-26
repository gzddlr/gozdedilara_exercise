package com.gozdedilarayilmaz;


public class main {
    public static void main(String[] args) {
        engineer employeeOne = new engineer("Dilara YILMAZ", 58000, 26);
        SalesPerson employeeTwo = new SalesPerson("Melodi YILMAZ", 5800, 23, .55);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getComissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getComissionPercentage());
    }

}
