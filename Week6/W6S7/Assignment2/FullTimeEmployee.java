package CPS181.Week6.Assignment2;

// How do we reuse name/id from employee?
// By using the super keyword to call the constructor of the superclass (Employee) and initializing name and id there.
// What if we don't implement calculatePay() here?
// We will get a compile-time error because FullTimeEmployee must implement all methods from the Payable interface.

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String n, int i, double s) {
        super(n, i);
        salary = s;
    }

    String getRole() { 
        return "Full-Time"; 
    }

    public double calculatePay() { 
        return salary; 
    }
}

