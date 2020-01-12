package comm.employeee;

	import java.util.InputMismatchException;
	import java.util.List;
	import java.util.Scanner;

	public class Main {
		private static Scanner scanner=new Scanner(System.in);
		
		private  Employee employee=null;
		
		
		{
			employee=new ();
		}
		public static void main(String[] args)
		{
			Main main=new Main();
			int choice=0;
			do {
			System.out.println("1. Sort employees by salary");
			System.out.println("2. Sort employees by age and date of joining");
			System.out.println("0. exit");
			System.out.print("Enter your choice: ");
			try {
				choice=scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.toString());
			}
			switch (choice) {
			case 1:
				System.out.println("provide task name: ");
				ToDo toDo=tester.service.createToDo(scanner.next(), scanner.next(), scanner.next());
				System.out.println("TODO Created sucessfully: "+toDo);
				break;
			case 2:
				List<ToDo> list=tester.service.getAllToDos();
				for(ToDo t:list){
					System.out.println(t);
				}
				break;
			case 3:
				System.out.print("provide todo Id: ");
				ToDo toDo1=tester.service.findById(scanner.next());
				if(toDo1!=null)
				{
					System.out.println(toDo1);
				}
				else {
					System.out.println("no such todo available");
				}
				break;
			case 4:
				
				System.out.print("provide todo Id: ");
				tester.service.deleteToDo(scanner.next());
				break;
			case 5:
				tester.service.removeAllToDo();
				System.out.println("batch remove sucessfull");
				break;
			case 6:
				tester.service.upadateToDo(scanner.next());
				System.out.println("Todo is updated.");
				break;
			case 0:
				System.out.println("bye");
				System.exit(0);
				break;

			default:
				System.out.println("invalid choice");
				break;
			}

}
