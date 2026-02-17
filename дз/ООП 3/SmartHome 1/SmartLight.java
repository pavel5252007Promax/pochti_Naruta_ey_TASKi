public class SmartLight extends SmartDevice {
    private int brightness;
    private String color;
    private boolean isColorChanging;

    public SmartLight(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, int brightness, String color, boolean isColorChanging) {
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.brightness = brightness;
        this.color = color;
        this.isColorChanging = isColorChanging;
    }
    @Override
    public void getDeviceType(){
        System.out.println("Умная лампа");
    }

    @Override
    public void performAction(){
        if (getisPoweredOn()){
            System.out.println("Лампа выключает свет еу");
        }
        else{
            System.out.println("Лампа включает свет еу");
        }
    }

    public void  setBrightness(int level){
        if (level >= 0 && level <= 100){
            System.out.println("Cвет на яркости " + level);
            this.brightness = level;
        }
        else{
            System.out.println("Некорректный уровень яркости");
        }
    }

    public void setBrightness(int level, String color){
        if(isColorChanging){
            setBrightness(level);
            this.color = color;
            System.out.println("Установлен " + color + " цвет");
        }
        else {
            setBrightness(level);
        }
    }

    public void changeColor(String newColor){
        System.out.println("Цвет изменен на " + newColor);
        this.color = newColor;
    }

    public void dimLights(){
        System.out.println("Свет приглушен епта");
    }




}
