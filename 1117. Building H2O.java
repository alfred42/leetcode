class H2O {

    private CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            smeaphoreO.release();
            semaphoreH.release(2);
        }
    });

    private Semaphore semaphoreH;
    private Semaphore smeaphoreO;

    public H2O() {
        smeaphoreO = new Semaphore(1);
        semaphoreH = new Semaphore(2);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        semaphoreH.acquire();

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();

        try {
            barrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
		
        
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        smeaphoreO.acquire();

        // releaseOxygen.run() outputs "O". Do not change or remove this line.
	   releaseOxygen.run();

        try {
            barrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}