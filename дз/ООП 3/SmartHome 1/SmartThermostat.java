public class SmartThermostat extends SmartDevice{
    private double currentTemperature;
    private double targetTemperature;
    private String mode;
    public SmartThermostat(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, double currentTemperature, double targetTemperature, String mode){
        super(deviceId, deviceName, location, isPoweredOn, powerConsumption);
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
        this.mode = mode;
    }
    @Override
    public void getDeviceType(){
        System.out.println("Умный термостат");
    }

    @Override
    public void performAction(){
        if (currentTemperature <= targetTemperature){
            this.mode = "обогрев";
        }
        else{
            this.mode = "охдаждение";
        }
    }
    public void setTemperature(double temp){
        this.currentTemperature = temp;
        System.out.println("Температура установлена на " + temp);
    }

    public void setTemperature(double temp, String mode){
        setTemperature(temp);
        if ("обогрев".equals(mode) || "охлаждение".equals(mode)){
            this.mode = mode;
            System.out.println("Режим изменен на " + mode);
        }
        else{
            System.out.println("Неверный режим");
        }
    }

    public void getEnergyReport(double getPowerConsumption){
        System.out.println("Энергии было потрачено ровно - " + getPowerConsumption);
    }

    public void scheduleTemperature(double temp, int hour){
        System.out.println("К " + hour + "часу" + "температура будет " + temp);
    }



}
