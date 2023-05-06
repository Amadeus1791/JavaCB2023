package unit11.OOP1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Franz", "Maier", 19);
        Person p2 = new Person("Kathi", "Mueller", 15);
        Person p3 = new Person("Hans", "Schmidt");

        BankAccount bankAccountP1 = new BankAccount(p1);
        BankAccount bankAccountP2 = new BankAccount(3000, p2);
        BankAccount bankAccountP3 = new BankAccount(p3);

        bankAccountP1.printBalance();
        bankAccountP1.deposit(5000);
        bankAccountP1.printBalance();

        bankAccountP1.withdraw(1000);
        bankAccountP1.printBalance();

        System.out.println(bankAccountP1);
    }
}
