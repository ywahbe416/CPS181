package CPS181.Week6.Assignment2;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String n, int i, double rate, int hours) {
        super(n, i);
        hourlyRate = rate;
        hoursWorked = hours;
    }

    String getRole() { 
        return "Part-Time"; 
    }

    public double calculatePay() { 
        return hourlyRate * hoursWorked; 
    }
    
}
