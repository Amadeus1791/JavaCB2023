package unit11.OOP1;

public class BankAccount {
    // fields: Was bin ich?
    private double balance;
    private Person person;
    private String accountNumber;
    private AccountNumberGenerator accountNumberGenerator =
            new AccountNumberGenerator("1234");


    // constructors: Wie werde ich erzeugt?
    public BankAccount(Person person) {
        this.person = person;
        this.accountNumber = generateAccountNumber();
    }

    public BankAccount(double balance, Person person) {
        this.balance = balance;
        this.person = person;
        this.accountNumber = generateAccountNumber();

    }

    // methods: Was kann ich?
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("You cannot deposit a negative amount");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You cannot withdraw more than you have on your account");
        } else {
            this.balance -= amount;
        }
    }

    void printBalance() {
        System.out.println("Your current balance is: " + this.balance);
    }

    // Getter for balance (user can ONLY read!!!)
    public double getBalance() {
        return balance;
    }

    private boolean checkBalance() {
        return false;
    }


    private String generateAccountNumber() {
        return accountNumberGenerator.generateNumber(10);
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
