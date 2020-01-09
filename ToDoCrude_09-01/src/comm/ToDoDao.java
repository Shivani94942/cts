package comm;

import java.util.List;

public interface ToDoDao {

	public ToDo createToDo(String todoName,String author,String taskNAme);
	public List<ToDo> getAllToDos();
	public ToDo findById(String todoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();
	
}
