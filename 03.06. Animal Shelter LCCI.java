class AnimalShelf {
    Deque<Integer> dogQueue;
    Deque<Integer> catQueue;
    Deque<Integer> animalQueue;
    Map<Integer, Integer> animalMap;

    public AnimalShelf() {
        this.dogQueue = new LinkedList<>();
        this.catQueue = new LinkedList<>();
        this.animalQueue = new LinkedList<>();
        this.animalMap = new HashMap<>();
    }
    
    public void enqueue(int[] animal) {
        animalQueue.offer(animal[0]);

        if (animal[1] == 0) {
            catQueue.offer(animal[0]);
        } else {
            dogQueue.offer(animal[0]);
        }

        animalMap.put(animal[0], animal[1]);
    }
    
    public int[] dequeueAny() {
        while (true) {
            if (animalQueue.isEmpty()) return new int[] {-1, -1};

            int id = animalQueue.poll();

            if (!animalMap.containsKey(id)) continue;

            int[] result = new int[] {id, animalMap.get(id)};
            animalMap.remove(id);

            return result;
        }

    }
    
    public int[] dequeueDog() {
        while (true) {
            if (dogQueue.isEmpty()) return new int[] {-1, -1};

            int id = dogQueue.poll();

            if (!animalMap.containsKey(id)) continue;

            int[] result = new int[] {id, animalMap.get(id)};
            animalMap.remove(id);

            return result;
        }

    }
    
    public int[] dequeueCat() {
        while (true) {
            if (catQueue.isEmpty()) return new int[] {-1, -1};

            int id = catQueue.poll();

            if (!animalMap.containsKey(id)) continue;

            int[] result = new int[] {id, animalMap.get(id)};
            animalMap.remove(id);

            return result;
        }
    }
}

/**
 * Your AnimalShelf object will be instantiated and called as such:
 * AnimalShelf obj = new AnimalShelf();
 * obj.enqueue(animal);
 * int[] param_2 = obj.dequeueAny();
 * int[] param_3 = obj.dequeueDog();
 * int[] param_4 = obj.dequeueCat();
 */