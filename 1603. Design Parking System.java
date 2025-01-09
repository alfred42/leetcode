class ParkingSystem {
    private int[] availableSlots;

    public ParkingSystem(int big, int medium, int small) {
        this.availableSlots = new int[3];

        this.availableSlots[0] = big;
        this.availableSlots[1] = medium;
        this.availableSlots[2] = small;
    }
    
    public boolean addCar(int carType) {
        if (this.availableSlots[carType - 1] > 0) {
            this.availableSlots[carType - 1]--;
            return true;
        } else {
            return false;
        }
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */