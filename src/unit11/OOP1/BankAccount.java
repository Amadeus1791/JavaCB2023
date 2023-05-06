package unit11.OOP1;

public class BankAccount {
    // fields: Was bin ich?
    private double balance;
    private Person person;
    private String accountNumber;


    // constructors: Wie werde ich erzeugt?
    public BankAccount(Person person) {
        this.person = person;
    }

    public BankAccount(double balance, Person person) {
        this.balance = balance;
        this.person = person;
    }

    // methods: Was kann ich?
    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    void printBalance() {

    }

    // Getter for balance (user can ONLY read!!!)
    public double getBalance() {
        return balance;
    }

    private boolean checkBalance() {
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", person=" + person +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
