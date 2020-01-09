package comm;

import java.util.List;

public class ToDoServiceImpl implements ToDoService {
	private ToDoDao dao=null;
	{
		dao=new ToDoDaoImpl();
	}

	@Override
	public ToDo createToDo(String toDoName,String author,String taskName) {
		// TODO Auto-generated method stub
		return dao.createToDo(toDoName,author,taskName);
	}

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return dao.getAllToDos();
	}

	@Override
	public ToDo findById(String toDoId) {
		// TODO Auto-generated method stub
		return dao.findById(toDoId);
	}

}