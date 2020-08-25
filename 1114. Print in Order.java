class Foo {
    private volatile int count; 

    public Foo() {
        count = 0;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        count++;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (count != 1) {
            wait();
        }
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        count++;
        
        printSecond.run();
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {

        while (count != 2) {
            wait();
        }
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}