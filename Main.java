package bohan;

public class Main {
    public static int legalCities(CameraInfo[] cameras) {
        int count = 0;

        for (int i = 0; i < cameras.length; i++) {
            CameraInfo camera = cameras[i];
            if (camera == null) {
            boolean allCamerasGoodForCity = true;
            for (int j = i; j < cameras.length; j++) {
                if (cameras[j] != null && cameras[j].getCity() == camera.getCity()) {
                    if (!cameras[j].allGood()) {
                        allCamerasGoodForCity = false;
                        break;
                    }
                }
            }
            if (allCamerasGoodForCity) {
                count++;
                for (int j = i + 1; j < cameras.length; j++) {
                    if (cameras[j] != null && cameras[j].getCity() == camera.getCity()) {
                        cameras[j] = null; 
                    }
                }
            }
        }
        }

        return count;
    }

    public static void main(String[] args) {
        CarInfo[] cars1 = new CarInfo[2];
        cars1[0] = new CarInfo("c10", true, 90);
        cars1[1] = new CarInfo("c11", false, 120);

        CarInfo[] cars2 = new CarInfo[2];
        cars2[0] = new CarInfo("c20", false, 45);
        cars2[1] = new CarInfo("c21", false, 50);

        CameraInfo[] cameras = new CameraInfo[2];
        cameras[0] = new CameraInfo(12, 110, cars1);
        cameras[1] = new CameraInfo(12, 50, cars2);

        System.out.println("Number of cities with all legal cars: " + legalCities(cameras));
    }
}