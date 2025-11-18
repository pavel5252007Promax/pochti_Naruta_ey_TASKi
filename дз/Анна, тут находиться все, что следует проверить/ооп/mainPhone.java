public class mainPhone {
    public static void main(String[] args){
        MobilePhone phone = new MobilePhone();
        MobilePhone phone1 = new MobilePhone("ШУША", "ТРИ ТЫСЯЧИ", 16, 50, true );
        phone1.powerOff();
        phone1.useBattery(5);
        phone1.chargeBattery(10);
        phone1.displayInfo();
    }
}