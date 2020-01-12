package comm;

public class Producer extends Thread {

    private CubbyHole cubbyhole;
    private int number;

    public Producer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cubbyhole.put(number, i);
            System.out.println("Consumer [cubbyhole=" + cubbyhole + ", number=" + number + "]");
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }

	
}