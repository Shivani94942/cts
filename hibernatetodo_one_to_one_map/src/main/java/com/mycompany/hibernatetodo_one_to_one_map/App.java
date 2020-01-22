package com.mycompany.hibernatetodo_one_to_one_map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernatetodo_one_to_one_map.entity.Task;
import com.mycompany.hibernatetodo_one_to_one_map.entity.Todo;

public class App 
{
	public static void main(String[] args) {
		try {
			
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(Todo.class)
					.addAnnotatedClass(Task.class).buildSessionFactory();
			Session session=factory.openSession();
			Todo todo=new Todo("john", "12-05-2013");
			todo.setTask(new Task("designing", "williams"));
			session.getTransaction().begin();
			session.save(todo);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
