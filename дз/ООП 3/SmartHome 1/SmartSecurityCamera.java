public class SmartSecurityCamera extends SmartDevice{
    private boolean isRecording;
    private boolean motionDetection;
    private String videoQuality;

    public SmartSecurityCamera(String deviceId, String deviceName, String location, boolean isPoweredOn, double powerConsumption, boolean isRecording, boolean motionDetection, String videoQuality){
        super(deviceId, deviceName,  location,  isPoweredOn, powerConsumption);
        this.isRecording = isRecording;
        this.motionDetection = motionDetection;
        this.videoQuality = videoQuality;
    }

    @Override
    public void getDeviceType(){
        System.out.println("Умная камера");
    }

    @Override
    public void performAction(){
        if (isRecording){
            this.isRecording = false;
            System.out.println("Запись остановлена");
        }
        else{
            this.isRecording = true;
            System.out.println("Запись началась");
        }
    }

    public void startRecording(){
        this.isRecording = true;
        System.out.println("Запись начата");
    }

    public void startRecording(boolean motionDetection){
        startRecording();
        this.motionDetection = true;
        System.out.println("Внимание обнаружение людей включено");
    }

    public void detectMotion(){
        if (motionDetection){
            System.out.println("Что мне подсказывает что я вижу ушлепка");
        }
        else{
            System.out.println("Никого не вижу");
        }
    }
    public void getLiveFeed(){
        System.out.println("Даю доступ к стриму, что за брэээт");
    }



}
