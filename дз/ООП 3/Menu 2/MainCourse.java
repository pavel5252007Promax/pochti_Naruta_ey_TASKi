public class MainCourse extends MenuItem{
    private String mainIngredient;
    private String sideDish;
    private int calories;

    public MainCourse(String itemId, String name, double price, int cookingTime, boolean isAvailable, String mainIngredient, String sideDish, int calories){
        super(itemId,  name,  price, cookingTime, isAvailable);
        this.mainIngredient = mainIngredient;
        this.sideDish = sideDish;
        this.calories = calories;
    }

    @Override
    public void getItemType(){
        System.out.println("Основное блюдо");
    }

    @Override
    public void prepare(){
        System.out.println("Готовит основное блюдо");
    }

    public void updatePrice(double newPrice){
        this.setPrice(newPrice);
        System.out.println("Цена изменена на " + newPrice);
    }

    public void updatePrice(double newPrice, String reason){
        this.setPrice(newPrice);
        System.out.println("Цена изменена на " + newPrice + "по причинне: " + reason);
    }

    public void changeSideDish(String newSideDish){
        this.sideDish = newSideDish;
        System.out.println("Гарнир изменен на " + newSideDish);
    }

    public void getCookingInstructions(){
        System.out.println("Купи доширак, залей кипятком\n" +
                "И не страдай ни о ком!\n" +
                "Быть может, лапша не столь питательна, но\n" +
                "Зарплата придёт обязательно!");
    }


}
