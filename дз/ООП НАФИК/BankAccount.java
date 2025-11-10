public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;

    public BankAccount(){
        this("accountNumber", "ownerName", 0.2, "currency", true);
    }
    public BankAccount(String accountNumber, String ownerName){
        this(accountNumber, ownerName, 0.2, "double RR", true);
    }
    public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
    }
    public void displayInfo() {
        System.out.println("Номер акка: " + this.accountNumber);
        System.out.println("Юз : " + this.ownerName);
        System.out.println("Денег: " + this.balance);
        System.out.println("А волюто то у нас нах: " + this.currency);
        if (this.isActive){
            System.out.println("АКТИВ");
        }
        else{
            System.out.println("ПАССИВ");
        }
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Денеги забраны нах");
        }
        else{
            System.out.println("А кеша то нехвает нищиёбка");
        }
    }
    public void activateAccount(){
        isActive = true;
    }
    public void deactivateAccount(){
        isActive = false;
    }

}
