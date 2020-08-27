class DiningPhilosophers {
    private final ReentrantLock[] locks;

    private Semaphore semaphore = new Semaphore(4);

    public DiningPhilosophers() {
        locks = new ReentrantLock[5];

        for (int i = 0; i < 5; i++) {
            locks[i] = new ReentrantLock();
        }
        
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int leftFork = philosopher;
        int rightFork = (philosopher + 1) % 5;

        semaphore.acquire();

        locks[leftFork].lock();
        locks[rightFork].lock();

        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        putRightFork.run();

        locks[leftFork].unlock();
        locks[rightFork].unlock();

        semaphore.release();
    }
}