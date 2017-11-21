package fr.todo.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="TODO")
public class TodoModel {

    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String text;
    private Boolean todo = Boolean.FALSE;

    @ManyToOne
    @JoinColumn (name = "userid")
    @JsonIgnore
    private UserModel user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public Boolean getTodo() {
        return todo;
    }

    public void setTodo(Boolean todo) {
        this.todo = todo;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }


}
