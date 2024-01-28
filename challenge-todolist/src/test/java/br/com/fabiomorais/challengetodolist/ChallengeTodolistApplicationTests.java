package br.com.fabiomorais.challengetodolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.fabiomorais.challengetodolist.entity.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ChallengeTodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCreateTodoSucess() {
		var todo = new Todo("todo teste 1", "descricao teste 1", false, 1);

		webTestClient
		.post().uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.length()").isEqualTo(1)
		.jsonPath("$[0].name").isEqualTo(todo.getName())
		.jsonPath("$[0].description").isEqualTo(todo.getDescription())
		.jsonPath("$[0].finished").isEqualTo(todo.isFinished())
		.jsonPath("$[0].priority").isEqualTo(todo.getPriority());

	}
	@Test
	void testeCreateTodoFailure() {
		var todo = new Todo("todo teste 1", "descricao teste 1", false, 1);

		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isBadRequest();
		
	}

}
