package bohan;

public class CameraInfo {
    private int city;
    private int maxSpeed;
    private CarInfo[] cars;  
    
    public CameraInfo(int city, int maxSpeed, CarInfo[] cars) {
        this.city = city;
        this.maxSpeed = maxSpeed;
        this.cars = cars;
    }
    
    public int getCity() {
        return city;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean allGood() {
        for (CarInfo car : cars) {
            if (car.illegal(maxSpeed)) {
                return false; 
            }
        }
        return true; 
    }
}