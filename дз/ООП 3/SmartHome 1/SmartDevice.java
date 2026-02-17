public class SmartDevice {
    private String deviceId;
    private String deviceName;
    private String location;
    private boolean isPoweredOn;
    private double powerConsumption;
    private static int totalDevices = 0;
    private static final int MAX_POWER_CONSUMPTION = 5000;

    public int getTotalDevices(int totalDevices) {
        return this.totalDevices;
    }

    public SmartDevice() {
        this("123", "SVINIA", "SARAI", true, 55);
    }

    public SmartDevice(String deviceId, String deviceName, String location) {
        this(deviceId, deviceName, location, true, 56);
    }

    public SmartDevice(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.location = location;
        this.powerConsumption = powerConsumption;
        this.isPoweredOn = isPoweredOn;
    }

    public void getDeviceType() {
        System.out.println("Устройство зовется: ");

    }

    public void performAction() {
        System.out.println("Устройство выполняет свое действие ");
    }

    public void turnOn(boolean isPoweredOn) {
        this.isPoweredOn = true;
        System.out.println("Устройство включено");
    }

    public void turnOff(boolean isPoweredOn) {
        this.isPoweredOn = false;
        System.out.println("Устройство выключено");
    }

    public String getStatus() {
        String res = "Айди устройства - " + deviceId + "\n" + "Имя устройства - " + deviceName + "\n" +
                "Местоположение - " + location + "\n" + "Включено ли - " + isPoweredOn + "\n" + "Количество потребляемой энергии - " + powerConsumption;
        return res;
    }

    public boolean setPowerConsumption(double powerConsumption) {
        if (powerConsumption >= 0 || powerConsumption <= MAX_POWER_CONSUMPTION) {
            this.powerConsumption = powerConsumption;
            return true;
        }
        return false;
    }

    public boolean setDeviceId(String deviceId) {
        if (deviceId != null && deviceId.length() != 0){
            this.deviceId = deviceId;
            return true;
        }
        return false;
    }

    public void setPoweredOn(boolean poweredOn) {
        isPoweredOn = poweredOn;
    }

    public boolean getisPoweredOn() {
        return isPoweredOn;
    }
    public void setPowerConsumption(){
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
}
