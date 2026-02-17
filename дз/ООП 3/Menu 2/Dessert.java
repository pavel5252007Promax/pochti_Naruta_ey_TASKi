public class Dessert extends MenuItem{
    private int sweetnessLevel;
    private boolean containsNuts;
    private boolean isGlutenFree;

    @Override
    public void getItemType(){
        System.out.println("Десерт");
    }

    @Override
    public void prepare(){
        System.out.println("Готовит десерт");
    }

    public void prepare(boolean withExtraDecoration){
        prepare();
        System.out.println("Блюдо будет украшено " + withExtraDecoration);
    }

    public void addTopping(String topping){
        System.out.println("Будет добавлен " + topping);
    }

    public void checkAllergies(){
        System.out.println("От всех аллергенов Павел вас вылечил");
    }
}
