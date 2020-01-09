package comm;

import java.util.List;

public interface ToDoDao {

	public ToDo createToDo(String todoId,String author,String taskNAme);
	public List<ToDo> getAllToDos();
	public ToDo findById(String todoname);
	public void deleteToDo(String todoId);
}
