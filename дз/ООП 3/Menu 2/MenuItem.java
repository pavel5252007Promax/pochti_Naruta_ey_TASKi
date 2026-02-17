public class MenuItem {
    private String itemId;
    private String name;
    private double price;
    private int cookingTime;
    private boolean isAvailable;
    private static int totalMenuItems = 0;
    private static final int MAX_COOKING_TIME = 120;

    public static int getTotalMenuItems() {
        return totalMenuItems;
    }

    public MenuItem() {
        this("123", "SVINIA", 12, 60, true);
    }

    public MenuItem(String itemId, String name, double price) {
        this(itemId, name, price, 52, true);
    }

    public MenuItem(String itemId, String name, double price, int cookingTime, boolean isAvailable) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.cookingTime = cookingTime;
        this.isAvailable = isAvailable;
    }

    public void getItemType() {
        System.out.println("Тип блюда: ");
    }

    public void prepare() {
        System.out.println("АШАЛЕТЬ");
    }

    public String displayInfo(){
        String res = "Айди блюда - " + this.itemId + "\n" + "Название - " + this.name + "\n"+
                "цена - " + this.price + "\n" + "время приготовление - " + this.cookingTime + "\n"+
                "могу заказать - " + this.isAvailable;
        return res;
    }

    public void updatePrice(double newPrice){
        this.price = newPrice;
        System.out.println("цена обновлена");
    }

    public boolean setPrice(double price){
        if( price < 0){
            return false;
        }
        this.price = price;
        return true;
    }

    public boolean setcookingTime(int cookingTime){
        if (cookingTime >= 1 && cookingTime <= MAX_COOKING_TIME){
            this.cookingTime = cookingTime;
            return true;
        }
        return false;
    }

    public boolean setitemId(String itemId){
        if (itemId != null && itemId.length() != 0){
            this.itemId = itemId;
            return true;
        }
        return false;
    }

    public String getItemId(){
        return itemId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getCookingTime(){
        return cookingTime;
    }
    public boolean getisAvailable(){
        return isAvailable;
    }




}
