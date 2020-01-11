package comm;

public class ThreadPriority {

	public static void main(String[] args) {
		
		Thread t1=new SimpleThread("Boston");
		t1.setPriority(10);//Thread.MAX_PRIORITY can also use
		t1.start();
		Thread t2=new SimpleThread("New York");
		t2.setPriority(5);//Thread.NORM_PRIORITY
		t2.start();
		Thread t3=new SimpleThread("Sanghai");
		t3.setPriority(1);//Thread.MIN_PRIORITY
		t3.start();
		

	}

}
