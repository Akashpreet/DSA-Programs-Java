public class EvenOddRunnable implements Runnable {
    private int max;
    private int remainder;

    public EvenOddRunnable(int max, int remainder) {
        this.max = max;
        this.remainder = remainder;
    }

    public void run() {
        for (int i = 1; i <= max; i++) {
            if (i % 2 == remainder) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}