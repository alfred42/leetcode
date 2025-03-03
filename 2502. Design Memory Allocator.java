class Allocator {
    private int[] memory;

    public Allocator(int n) {
        memory = new int[n];
    }
    
    public int allocate(int size, int mID) {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] != 0) {
                continue;
            } else {
                boolean available = true;

                for (int j = 0; j < size; j++) {
                    if (i + j == memory.length || memory[i + j] != 0) {
                        available = false;
                        break;
                    }
                }

                if (available) {
                    for (int j = 0; j < size && i + j < memory.length; j++) {
                        memory[i + j] = mID;
                    }

                    return i;
                }
            }
        }

        return -1;
    }
    
    public int freeMemory(int mID) {
        int count = 0;

        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == mID) {
                count++;
                memory[i] = 0;
            }
        }

        return count;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */