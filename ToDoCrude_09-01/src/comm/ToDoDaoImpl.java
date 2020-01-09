package comm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ToDoDaoImpl implements ToDoDao {
	private List<ToDo> toDoList=null;
	private ToDo toDo;
	{
		toDoList=new ArrayList<ToDo>();
	}

	public ToDo createToDo(String toDoName,String author,String taskName) {
		String str[]=UUID.randomUUID().toString().split("-");
		String str1[]=UUID.randomUUID().toString().split("-");
		toDo=new ToDo((str[0]+str[1]).toLowerCase(),toDoName,(str1[0]+str1[1]).toLowerCase(),author,taskName);
		toDoList.add(toDo);
		return toDo;
		
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return toDoList;
	}

	@Override
	public ToDo findById(String toDoId) {
		// TODO Auto-generated method stub
		
		Iterator<ToDo> iterator=toDoList.iterator();
		
		while(iterator.hasNext())
		{
			toDo=iterator.next();
			if(toDo.getTodoId().equals(toDoId))
			{
				
				System.out.println(toDo.getTodoId());
				break;
			}
		}
		return toDo;
	}

	@Override
	public void deleteToDo(String toDoId) {
		if(toDoList.isEmpty())
		{
			System.out.println("todo list is empty.");
			
		}
		toDo=findById(toDoId);
		if(toDo==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			toDoList.remove(toDo);
			System.out.println("remoded sucessfully with id: "+toDoId);
		}
		
	}

	@Override
	public void removeAllToDo() {
		toDoList.removeAll(toDoList);
		
	}
	}	