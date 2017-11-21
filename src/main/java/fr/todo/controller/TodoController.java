package fr.todo.controller;

import fr.todo.domain.model.TodoModel;
import fr.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration


public class TodoController {

    @Autowired
    private TodoService todoService;

     /*
     @RequestMapping("/")
    @ResponseBody

    //TD 2 3
        String todo() {
        return todoService.getTodo();
    }*/

    /*
    //TD4
    @RequestMapping(value = "/todo/{msg}", method = RequestMethod.GET)
    //On renvoie un TodoModel
    public TodoModel getTodo(@PathVariable String msg) {
        return todoService.todo(msg);
    }


   @RequestMapping(value ="/todo/{msg}", method = RequestMethod.POST)
    public TodoModel addTodo(@RequestBody TodoModel todoModel){
        todoModel.setText("added" + todoModel.getText());
        return todoModel;
    }

    @RequestMapping(value = "/todo/{id}", method = RequestMethod.DELETE)
    //On renvoie un TodoModel
    public Map <String, String>  deleteTodo(@PathVariable String id) {
        Map <String, String> result = new HashMap<String, String>();
        result.put( "code", "200");
        return result;
    }

    @RequestMapping(value ="/todo/{msg}", method = RequestMethod.PUT)
    public TodoModel updateTodo(@RequestBody TodoModel todoModel){
        todoModel.setText("modified" + todoModel.getText());
        return todoModel;
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    //On renvoie un TodoModel
    public List<TodoModel> listTodos(TodoModel todoModel) {
        List<TodoModel> todos = new ArrayList<TodoModel>();
        todos.add(todoService.todo( "todo1"));
        todos.add(todoService.todo( "todo2"));
        todos.add(todoService.todo( "todo3"));
        return todos;
    }*/

    @RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
    //On renvoit un TodoModel
    public TodoModel getTodo(@PathVariable String id) {
        return todoService.getTodo(id);
    }

    @RequestMapping(value = "/todo/{id}", method = RequestMethod.DELETE)
    //On renvoit un TodoModel
    public void deleteTodo(@PathVariable String id) {
       todoService.deleteTodo(id);
    }

    @RequestMapping(value ="/todo/{userId}", method = RequestMethod.POST)
    public TodoModel addTodoOnUser(@RequestBody TodoModel todoModel, @PathVariable String userId){
        return todoService.addTodoOnUser(todoModel,userId);
    }

    @RequestMapping(value ="/todo", method = RequestMethod.POST)
    public TodoModel addTodo(@RequestBody TodoModel todoModel){
        return todoService.addTodo(todoModel);
    }

    @RequestMapping(value ="/todo", method = RequestMethod.PUT)
    public TodoModel updateTodo(@RequestBody TodoModel todoModel){
        return todoService.updateTodo(todoModel);
    }

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    //On renvoie un TodoModel
    public Iterable<TodoModel> listTodos(TodoModel todoModel) {
        return todoService.getList();
    }

    @RequestMapping(value ="/counttrue", method = RequestMethod.GET)
    public Long countTrue(){
        return todoService.countByNbTimeTodo(Boolean.TRUE);
    }
}