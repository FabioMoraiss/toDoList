# To do List

>Resolvendo desafio backend da [SimplifyTecnologia](https://github.com/simplify-tec/desafio-junior-backend-simplify). API construida para armazenar pendências, e suas prioridades. API construida em Java com Spring boot, arquitetura de 3 camadas


**camada: Cotroller**
- resposável pelos endpoints disponibilizados da API, e a configuração deles(post, get, put, delete e params)

**camada: Service**
- responsável tratar das regras de negócio

**Camada: Repository**
- responsável por conectar e realizar querys no banco de dados

# Tecnologias utilizadas
1. java
2. Spring JPA
3. Spring WEB
3. Maven
4. Banco de dados: Postgres principal e H2 como testes

# Práticas adotadas
- SOLID
- API REST
- Injeção de dependências
- Arquiterua de 3 camadas
- tetes unitários

# API endpoints
>use acese http://localhost:8080/swagger-ui/index.html após fazer a build do projeto, para ter acesso a documentação web
- Criar todo

```
http POST :8080/todos

[
  {
  "name": "string",
  "description": "string",
  "finished": true,
  "priority": 0
  }
]
```

- Buscar todas as todos
```
http GET :8080/todos

[]
```

- Atualizar Todo
```
http PUT :8080/todos

[
  {
  "id": 0,
  "name": "string",
  "description": "string",
  "finished": true,
  "priority": 0
  }
]
```

- Deletar contato
```
http DELETE :8080/todos

[]
```

