package comm;

import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;

public class MyList {
	
	
	private LinkedList<String>  list=new LinkedList<String>();
	 
	
	
	public void getSortedList()
	{
		list.add("Sang");
		list.add("Sing");
		list.add("Boston");
		list.add("America");
		System.out.println("dfrg"+list);
		Collections.sort(list);
		System.out.println("wqer"+list);
	
		
	}
	
	public static void main(String[] args)
	{
		MyList myList=new MyList();
		myList.getSortedList();
	}

}