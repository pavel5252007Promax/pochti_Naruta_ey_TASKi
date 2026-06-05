public class MainFrac {
    public static void main(String[] args) {

        //1
        ItemStorage<Integer> item1 = new ItemStorage<>(100);
        item1.compareWith(100);
       //2
        ItemStorage<Integer> item2 = new ItemStorage<>(200);
        item2.compareWith(200);
        // 3
        Fraction drob1 = new Fraction(1, 2);
        Fraction drob2 = new Fraction(1, 2);
        ItemStorage<Fraction> item3 = new ItemStorage<>(drob2);
        item3.compareWith(drob1);
    }
}