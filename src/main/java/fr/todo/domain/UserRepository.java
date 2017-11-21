package fr.todo.domain;

import fr.todo.domain.model.TodoModel;
import fr.todo.domain.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, String> {


}
