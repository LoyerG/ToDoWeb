package fr.todo.service;

import fr.todo.domain.UserRepository;
import fr.todo.domain.model.TodoModel;
import fr.todo.domain.TodoRepository;
import fr.todo.domain.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    /*
    //TD2
    public String getTodo(){
        return "Exemple TD2";
    }*/

    /*
    //TD3
    //@Value permet d'aller chercher dans les fichiers de propriété
    @Value("${message.txt}")
    private String msg;

    public String getTodo(){
        return msg;
    }*/

    /*
    //TD Properties
    @Autowired
    private Database database;
    public String todo(){
        return database.getUsername();
    }*/

    @Value("${message.txt}")
    private String msg;

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;

    public TodoModel todo(String param){
        TodoModel todoModel = new TodoModel();
        todoModel.setText("todo :  " + param );
        return todoModel;
    }

    public TodoModel addTodo(TodoModel todoModel){
        return todoRepository.save(todoModel);
    }
    public TodoModel addTodoOnUser(TodoModel todoModel, String userId){

        UserModel userModel = userRepository.findOne(userId);

        todoModel.setUser(userModel);
        return todoRepository.save(todoModel);
    }

    public TodoModel updateTodo(TodoModel todoModel){
        return todoRepository.save(todoModel);
    }

    public TodoModel getTodo(String id){
        return todoRepository.findOne(id);
    }

    public void deleteTodo(String id){
        todoRepository.delete(id);
    }

    public Iterable<TodoModel> getList(){
        return todoRepository.findAll();

    }

    public long countByNbTimeTodo(Boolean todo)
    {
        return todoRepository.countByTodo(todo);
    }


}