package CPS181.Week6.Assignment2;

// Why can't we put code inside here? 
// Because there's 2 different types of employees with different pay calculations.

interface Payable {
    double calculatePay();
}

//What will happen if a class doesn't implement this method?
