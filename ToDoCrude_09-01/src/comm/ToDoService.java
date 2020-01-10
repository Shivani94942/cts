package comm;

import java.util.List;

public interface ToDoService {
	public ToDo createToDo(String toDoName,String author,String taskName);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();
	public void upadateToDo(String toDoId);
}