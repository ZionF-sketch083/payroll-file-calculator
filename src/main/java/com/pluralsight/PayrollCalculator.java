package com.pluralsight;

public class PayrollCalculator {
    public static void main(String[] args) {
        String employee = "10|Dana Wyatt|52.5|12.50";

        String[] parts = employee.split("\\|");
        System.out.println("Employee: "+ parts.length);
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
        int id = Integer.parseInt(parts[0]);
        int hours = Integer.parseInt(parts[2]);
        int rate = Integer.parseInt(parts[3]);


    }
}
