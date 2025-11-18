public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;

    public MobilePhone() {
        this("brand", "model", 12, 77, true);
    }

    public MobilePhone(String brand, String model, int storageGB) {
        this(brand, model, storageGB, 77, true);
    }

    public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
    }

    public void displayInfo() {
        System.out.println(this.brand + "\n" + this.model + "\n" + this.storageGB + "\n" + this.batteryLevel + "\n" + this.isPoweredOn);
    }

    public void powerOn() {
        isPoweredOn = true;
    }

    public void powerOff() {
        isPoweredOn = false;
    }

    public void chargeBattery(int percent) {
        batteryLevel += percent;
    }

    public void useBattery(int percent) {
        batteryLevel -= percent;
    }

}
