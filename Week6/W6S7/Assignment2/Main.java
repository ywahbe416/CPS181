package CPS181.Week6.Assignment2;

public class Main{
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 1, 30000);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", 2, 20, 40);

        fte.displayDetails();
        System.out.println("Role: " + fte.getRole() + " Pay: $" + fte.calculatePay());

        pte.displayDetails();
        System.out.println("Role: " + pte.getRole() + " Pay: $" + pte.calculatePay());

    }
}