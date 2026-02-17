public class MainStorage {
    public static void main(String[] args){
    ItemStorage<Integer> item1 = new ItemStorage<Integer>(100);
    item1.compareWith(100);
    // все норм тк  сравниваються значения
    System.out.println("/////////////////////////////////////////////////////////////");
    ItemStorage<Integer> item2  = new ItemStorage<Integer>(200);
    item2.compareWith(200);
    // фолс так как сравнивает ссылки
    System.out.println("////////////////////////////////////////////////////////////////////");
    RationalFraction r1 = new RationalFraction(1, 2);
    RationalFraction r2 = new RationalFraction(1, 2);
    ItemStorage<RationalFraction> item3 = new ItemStorage<RationalFraction>(r1);
    item3.compareWith(r2);
    // вообще ниче не понял какое еще переопределение нафик
    }
}
