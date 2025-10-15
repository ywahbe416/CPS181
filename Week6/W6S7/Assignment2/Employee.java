package CPS181.Week6.Assignment2;


abstract class Employee implements Payable{
    String name;
    int id;

    Employee(String n, int i){
        name = n;
        id = i;
    }

    void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name);
    }

    abstract String getRole();
    
}

// What's the difference between abstract clcass and interface?
// An abstract class can have both abstract methods (without implementation) and concrete methods (with implementation
// An interface can only have method signatures (without implementation) and constants.


// why abstract?
// Because we want to enforce that all subclasses provide their own implementation of getRole().
// You can't instantiate Employee directly because it's abstract. 