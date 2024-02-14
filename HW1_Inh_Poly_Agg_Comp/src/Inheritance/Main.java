package Inheritance;

import java.text.DecimalFormat;

class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Getter and setter for weekly salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters for wage and hours worked
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // Getters and setters for commission rate and gross sales
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    // Getter and setter for base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantiating each class and populating with provided information
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        CommissionEmployee nicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        BaseEmployee renwaChanel = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        CommissionEmployee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        // Printing out the information with proper alignment
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("First Name   Last Name    Social Security #    Weekly Salary   Wage    Hours Worked   Commission Rate   Gross Sales    Base Salary");
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                joeJones.getFirstName(), joeJones.getLastName(), joeJones.getSocialSecurityNumber(), "$" + df.format(joeJones.getWeeklySalary()), "-", "-", "-", "-", "-");
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                stephanieSmith.getFirstName(), stephanieSmith.getLastName(), stephanieSmith.getSocialSecurityNumber(), "-", "$" + df.format(stephanieSmith.getWage()), stephanieSmith.getHoursWorked(), "-", "-", "-");
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                maryQuinn.getFirstName(), maryQuinn.getLastName(), maryQuinn.getSocialSecurityNumber(), "-", "$" + df.format(maryQuinn.getWage()), maryQuinn.getHoursWorked(), "-", "-", "-");
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                nicoleDior.getFirstName(), nicoleDior.getLastName(), nicoleDior.getSocialSecurityNumber(), "-", "-", "-", (int) (nicoleDior.getCommissionRate() * 100) + "%", "$" + df.format(nicoleDior.getGrossSales()), "-");
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                renwaChanel.getFirstName(), renwaChanel.getLastName(), renwaChanel.getSocialSecurityNumber(), "$" + df.format(renwaChanel.getBaseSalary()), "-", "-", "-", "-", "-");
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                mikeDavenport.getFirstName(), mikeDavenport.getLastName(), mikeDavenport.getSocialSecurityNumber(), "-", "-", "-", "-", "-", "$" + df.format(mikeDavenport.getBaseSalary()));
        System.out.printf("%-12s%-13s%-21s%-16s%-8s%-14s%-18s%-14s%-14s\n",
                mahnazVaziri.getFirstName(), mahnazVaziri.getLastName(), mahnazVaziri.getSocialSecurityNumber(), "-", "-", "-", (int) (mahnazVaziri.getCommissionRate() * 100) + "%", "$" + df.format(mahnazVaziri.getGrossSales()), "-");
    }
}


