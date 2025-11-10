public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;

    public Product() {
        this("Kolka", 12, "Antistress", true, 3);
    }

    public Product(String name, double price, String category) {
        this(name, price, category, false, 3);
    }

    public Product(String name, double price, String category, boolean inStock, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Зовут его: " + name);
        System.out.println("А стоит он жалких: " + price + " дублей");
        System.out.println("Категория: " + category);
        System.out.println("Осталось всего лишь: " + quantity);
        if (inStock) {
            System.out.println("Есть в наличии");
        } else {
            System.out.println("АХАХ а в наличии то больше нет лузерепте");
        }
    }

    public void applyDiscount(double percent) {
        System.out.println("СКИДКА ПРИМЕНЕНА");
        price -= percent;
    }

    public void restock(int amount) {
        System.out.println("Наличие пополнилось");
        quantity += amount;
    }

    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("СТОЛЬКО НЕТ В НАЧЛИИ АЛООО");
        }
    }
}
