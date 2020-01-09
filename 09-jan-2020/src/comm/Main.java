package comm;

public class Main {
    
    static int count = 0;
    
    public static void main(String[] args) {
        while (true) {
            try {
              
                if (count++ == 0)
                    throw new MyException("Exception Occured..");//executes once
               
            } catch (MyException e) {
                System.out.println(e);
            } finally {//always works 
                System.out.println("In finally clause");//executes twice
                if (count == 2)
                    break; // out of "while"
            }
        }
    }
} 