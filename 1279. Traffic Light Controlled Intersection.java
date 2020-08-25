class TrafficLight {

    private volatile boolean road1Green = true;

    public TrafficLight() {
        
    }
    
    public synchronized void carArrived(
        int carId,           // ID of the car
        int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
        int direction,       // Direction of the car
        Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
        Runnable crossCar    // Use crossCar.run() to make car cross the intersection 
    ) {
        if ((roadId == 1 && road1Green == false) || (roadId == 2 && road1Green == true)) {
            turnGreen.run();
            road1Green = !road1Green;
        }

        crossCar.run();
    }
}