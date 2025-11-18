public class mainBank {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        BankAccount bank1 = new BankAccount("08052007", "Рублик стасик", 5.2, "РублиРублиВмоейКрови", true);
        bank1.displayInfo();
        bank1.activateAccount();
        System.out.println("/////////////////////////////////");
        bank1.deposit(1.2);
        bank1.displayInfo();
        bank1.deactivateAccount();
        System.out.println("/////////////////////////////////");
        bank1.withdraw(6.6);
        System.out.println("/////////////////////////////////");
        bank1.displayInfo();

    }
}
