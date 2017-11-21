package fr.todo.domain;

import fr.todo.domain.model.TodoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todo", path ="todo")
public interface TodoRepository extends PagingAndSortingRepository<TodoModel, String> {

    long countByTodo(Boolean todo);




}
