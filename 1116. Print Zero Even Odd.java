class ZeroEvenOdd {
    private int n;
    private volatile int current;
    private volatile boolean printZero = true;;
    
    public ZeroEvenOdd(int n) {
        this.n = n;
        this.current = 1;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            while (!printZero) {
                wait();

                if (current > n) {
                    return;
                }
            }

            printNumber.accept(0);
            printZero = false;
            notifyAll();
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            while (printZero == true || current % 2 != 0) {
                wait();

                if (current > n) {
                    return;
                }
            }

            printNumber.accept(current);
            printZero = true;
            current++;
            notifyAll();

            if (current > n) {
                return;
            }
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            while (printZero == true || current % 2 != 1) {
                wait();

                if (current > n) {
                    return;
                }
            }

            printNumber.accept(current);
            printZero = true;
            current++;
            notifyAll();
            
            if (current > n) {
                return;
            }
        }
    }
}