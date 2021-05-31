class ParkingSystem {
    int maxBig;
    int maxMedium;
    int maxSmall;
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        maxBig = big;
        maxMedium = medium;
        maxSmall = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            return ++big <= maxBig;
        } else if (carType == 2) {
            return ++medium <= maxMedium;
        } else if (carType == 3) {
            return ++small <= maxSmall;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */