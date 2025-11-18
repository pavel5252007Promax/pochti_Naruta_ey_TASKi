public class mainProduct {
    public static void main(String[] args){
        Product product = new Product();
        Product product1 = new Product("Николяйка", 52, "помогатор", true, 25);
        product1.displayInfo();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        product1.applyDiscount(12);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        product1.restock(5);
        product1.sell(10);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        product1.displayInfo();

    }
}
