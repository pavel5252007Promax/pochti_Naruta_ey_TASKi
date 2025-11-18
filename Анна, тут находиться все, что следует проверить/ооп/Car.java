public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private double mileage;

    public Car() {
        this("Машка", "даблар", 1998, "pink", 3000, true, 1234);
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, "пинк", 5225, true, 125);
    }

    public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Цвет: " + color);
        System.out.println("Цена: " + price);
        System.out.println("Пробег: " + mileage);
        if (isRunning) {
            System.out.println("Заведена");
        } else {
            System.out.println("Не заведена походу");
        }
    }

    public void startEngine() {
        isRunning = true;
    }

    public void stopEngine() {
        isRunning = false;
    }

    public void drive(double distance) {
        mileage += distance;
    }

    public void repaint(String newColor) {
        color = newColor;
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

}
