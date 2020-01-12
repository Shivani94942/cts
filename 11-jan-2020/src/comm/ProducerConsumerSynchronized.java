package comm;

import java.util.Enumeration;
import java.util.Stack;

public class ProducerConsumerSynchronized {

    public static void main(String[] args) {
        
        CubbyHole c = new CubbyHole();
        
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        Producer p2 = new Producer(c,2);
        Consumer c2 = new Consumer(c,2);
        
        p1.start();
        c1.start();
        p2.start();
        c2.start();
        
        Stack<CubbyHole> stack=new  Stack<CubbyHole>();
        stack.push(c);
        
        Enumeration<CubbyHole> e=stack.elements();
        while(e.hasMoreElements()) {
        	CubbyHole ch=e.nextElement();
        	System.out.println(ch);
        }
    }
}