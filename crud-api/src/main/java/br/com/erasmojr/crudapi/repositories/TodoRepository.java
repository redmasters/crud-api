package br.com.erasmojr.crudapi.repositories;

import br.com.erasmojr.crudapi.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
