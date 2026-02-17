public class SmartHome {

    private String homeName;
    private SmartDevice[] devices;
    private int deviceCount;

    public SmartHome(String homeName) {
        this.homeName = homeName;
        this.devices = new SmartDevice[10];
        this.deviceCount = 0;
    }

    public String getHomeName() {
        return homeName;
    }
    public SmartDevice[] getDevices() {
        return devices;
    }
    public int getDeviceCount() {
        return deviceCount;
    }

    public void addDevice(SmartDevice device) {
        if (deviceCount < devices.length) {
            devices[deviceCount] = device;
            deviceCount++;
            System.out.println("Устройство " + device.getDeviceName() + " добалено в дом '" + homeName + "' ");
        } else {
            System.out.println("Достигнуто максимальное кол-во устройств в доме!");
        }
    }
    public void removeDevice(String deviceId) {
        boolean flag = false;
        for (int i = 0; i < deviceCount; i++) {
            String id_device = devices[i].getDeviceId();
            if (id_device.equals(deviceId)) {
                String name_device = devices[i].getDeviceName();
                devices[i] = null;
                for (int j = i; j < deviceCount - 1; j++) {
                    devices[j] = devices[j+1];
                }
                deviceCount --;
                System.out.println("Устройство " + name_device + " удалено из дома '" + homeName + "'");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Устройство с ID " + deviceId + " не найдено!");
        }
    }
    public void calculateTotalPowerConsumption() {
        double total_power = 0.0;
        for (int i = 0; i < deviceCount; i++) {
            total_power += devices[i].getPowerConsumption();
        }
        System.out.println("Общее потребление энергии (в Вт): " + total_power);
    }

    public void getDeviceStatus(String deviceId) {
        for (int i = 0; i < deviceCount; i++) {
            String id_device = devices[i].getDeviceId();
            if (id_device.equals(deviceId)) {
                String name_device = devices[i].getDeviceName();
                System.out.println(devices[i].getStatus());
                return;
            }
        }
        System.out.println("Устройство с ID " + deviceId + " не найдено!");
    }
}

