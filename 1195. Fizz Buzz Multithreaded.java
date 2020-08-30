class FizzBuzz {
    private int n;
    private volatile int current;

    public FizzBuzz(int n) {
        this.n = n;
        this.current = 1;
    }

    // printFizz.run() outputs "fizz".
    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while(true) {
            while (current % 15 == 0 || current % 3 != 0) {
                if (current > n) return;
                wait();
            }

            if (current > n) return;
            
            printFizz.run();
            current++;
            notifyAll();
        }
    }

    // printBuzz.run() outputs "buzz".
    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while(true) {
            while (current % 15 == 0 || current % 5 != 0) {
                if (current > n) return;
                wait();
            }

            if (current > n) return;

            printBuzz.run();
            current++;
            notifyAll();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(true) {
            while (current % 15 != 0) {
                if (current > n) return;
                wait();
            }

            if (current > n) return;

            printFizzBuzz.run();
            current++;
            notifyAll();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while(true) {
            while (current % 3 == 0 || current % 5 == 0 || current % 15 == 0) {
                if (current > n) return;
                wait();
            }

            if (current > n) return;

            printNumber.accept(current++);
            notifyAll();
        }
    }
}