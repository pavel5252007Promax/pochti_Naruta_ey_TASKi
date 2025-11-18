public class mainCar{
    public static void main(String[] args){
        Car car1 = new Car();
        car1.displayInfo();
        System.out.println("/////////////////////////////////");
        car1.drive(555555);
        car1.repaint("блубери");
        car1.updatePrice(7777);
        car1.stopEngine();
        car1.displayInfo();
    }
}
