# Book API
Book Api é um projeto simples criado para permitir que usuários criem, atualizem e excluam informações de livros. A Api permite a busca de livros por ID, nome e categoria. Esse projeto foi criado com o intuito de praticar e transformar em uma api futura para uso.

# Endpoints
A seguir estão os endpoints disponíveis nesta API:

### Books
- GET /books - Retorna todos os livros cadastrados na base de dados.
- GET /books/{id} - Retorna o livro específico com base no ID fornecido.
- GET /books?titulo={titulo} - Retorna os livros que contem no titulo, oque foi passado no parametro
- GET /books?categoria={categoria} - Retorna os livros que contem a categoria passada no parametro
- GET /books?titulo={titulo}&categoria={categoria} - Retorna os livros que contem no titulo oque foi passado no parametro e tem como categoria o que foi passado no parametro categoria
- POST /books - Cria um novo livro no banco de dados, utilizando as informações obrigatorias no body(titulo, sinopse, categoria, autor, dateDeLancamento e totalPaginas).
- PUT /books/{id} - Atualiza as informações de um livro específico com base no ID fornecido e as informações fornecidas no body(titulo, sinopse, categoria, autor, dateDeLancamento e totalPaginas).
- DELETE /books/{id} - Exclui um livro específico com base no ID fornecido.

# Como executar
Para executar o projeto, é necessário cloná-lo em sua máquina e configurar o arquivo application.yml com as informações do banco de dados que deseja utilizar. O projeto utiliza Spring e suas devidas dependências do JPA, Hibernate, Validation e do banco de dados.

Segue a estrutura do arquivo application.yml:

```yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/bookapi?useTimezone=true&serverTimezone=UTC&useLegacyDate
    username:
    password:
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: update
    properties:
      hibernate.format_sql: true 
```

# Como contribuir
Se você quiser contribuir para o projeto, basta dar um fork e fazer as suas atualizações.

# Licença
O projeto não possui uma licença definida, uma vez que foi criado apenas para fins de estudo.
