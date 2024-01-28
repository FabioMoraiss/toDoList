package br.com.fabiomorais.challengetodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabiomorais.challengetodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
