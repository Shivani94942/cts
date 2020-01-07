package comm;

public class Tester {

	public static void main(String[] args) {
		/*
		 * Counter counter1 = new Counter("MyObject-1== "); System.out.printf("%s",
		 * counter1); Counter counter2 = new Counter("MyObject-2== ");
		 * System.out.printf("%s", counter2.toString()); Counter counter3 = new
		 * Counter("MyObject-3== "); System.out.printf("%s", counter3.toString());
		 * Counter counter4 = new Counter("MyObject-4== "); System.out.printf("%s",
		 * Counter.displayCount());
		 */
		//Counter c = new Counter();//gives 1000 as output
		Counter c = new Counter("qwerty");//gives 100 as output
		Counter.InnerCounter iCounter = c.new InnerCounter();
		iCounter.add(10, 20);
		c.displayMAX();

	}

}