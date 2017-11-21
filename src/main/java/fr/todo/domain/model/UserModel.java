package fr.todo.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class UserModel {

    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String login;
    private String pwd;

    @OneToMany(mappedBy = "user")
    private List<TodoModel> todos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<TodoModel> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoModel> todos) {
        this.todos = todos;
    }

}
