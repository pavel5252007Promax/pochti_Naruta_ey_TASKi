public class Appetizer extends MenuItem {
    private String servingTemperature;
    private boolean isVegetarian;
    private int spiceLevel;

    public Appetizer(String itemId, String name, double price, int cookingTime, boolean isAvailable, String servingTemperature, boolean isVegetarian, int spiceLevel){
        super(itemId,  name,  price,  cookingTime,  isAvailable);
        this.servingTemperature = servingTemperature;
        this.isVegetarian = isVegetarian;
        this.spiceLevel = spiceLevel;
    }
    @Override
    public void getItemType() {
        System.out.println("Закуска");
    }

    @Override
    public void prepare() {
        System.out.println("приготовил закуску");
    }

    public String displayInfo() {
        String res = "Айди блюда - " + this.getItemId() + "\n" + "Название - " + this.getName() + "\n" +
                "цена - " + this.getPrice();
        return res;
    }

    public String displayInfo(boolean showDetails) {
        if (showDetails) {
            return displayInfo();
        } else {
            String res = "Айди блюда - " + this.getItemId() + "\n" + "Название - " + this.getName() + "\n" +
                    "цена - " + this.getPrice() + "\n" + "время приготовление - " + this.getCookingTime() + "\n" +
                    "могу заказать - " + this.getisAvailable() + "уровень отсроты - " + spiceLevel + "\n" +
                    "вегетарианское ли - " + isVegetarian + "\n" + "темпа подачи - " + servingTemperature;
            return res;
        }
    }

    public void changeSpiceLevel(int level){
        this.spiceLevel = level;
        System.out.println("уровень отсроты измене на " + level);
    }

    public void getNutritionInfo(){
        System.out.println("Бро нах тебе эти сухари не сдались какая питательность то еу, один гастрит");

    }
}
