package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();

        System.out.println("Enter the Salaries of the employees: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Employee " + (i + 1) + " salary: ");
            salaries.add(scanner.nextDouble());

        }
        double total = 0;
        for (double salary : salaries) {
            total += salary;
        }
        double averageSalary = total / salaries.size();

        String category;

        if (averageSalary < 30000) {
            category = "Low Salary";
        } else if (averageSalary >= 30000 && averageSalary <= 70000) {
            category = "Moderate Salary";
        } else {
            category = "High Salary";
        }
        System.out.println(category);




    }
}
