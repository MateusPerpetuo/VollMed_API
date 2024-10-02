# 🚀 Projeto de API Rest para a Clínica Voll Med com Spring Boot 3


## 💻 Sobre o projeto

Voll.med é uma clínica médica fictícia que precisa de um aplicativo para gestão de consultas. O aplicativo deve possuir funcionalidades que permitam o cadastro de médicos e de pacientes, e também o agendamento e cancelamento de consultas.

Este repositório é representa a API que gerencia o cadastro de médicos, pacientes e consultas, com funcionalidades de CRUD, autenticação com JWT, validações, 
paginação, persistência de dados salvando as informações em um banco de dados e tratamento centralizado de erros. O projeto inclui documentação com SpringDoc e Swagger, além de testes automatizados e simulação de deploy.

Foi uma experiência bem desafiadora que me apresentou práticas de desenvolvimento e segurança de uma API Rest.


## ⚙️ Funcionalidades

- [x] CRUD de médicos
- [x] CRUD de pacientes
- [x] Agendamento de consultas
- [x] Cancelamento de consultas
- [x] Autenticação e autorização com Spring Security e JWT
- [x] Tratamento centralizado de erros
- [x] Documentação da API com SpringDoc e Swagger



## 🚀💼 Aprendizados e Desafios

Durante o curso, aprendi sobre boas práticas de desenvolvimento, segurança de APIs e o uso avançado de Spring Boot. Enfrentei desafios como a 
complexidade do Spring Security e a necessidade de um entendimento mais profundo do protocolo HTTP.


A configuração do Spring Security para autenticação e autorização com JWT foi de longe um dos maiores desafios, exigindo um entendimento profundo de
como gerenciar a segurança de forma eficaz. Trabalhar com tokens JWT envolveu criar, validar e gerenciar o estado de autenticação, o que foi complexo, 
mas fundamental para proteger a API.

Mais uma vez pude ver na prática a importância de um código bem estruturado e de boas práticas de desenvolvimento, como a padronização de retornos e o tratamento 
centralizado de erros fazendo uso dos conceitos SOLID. 
Utilizar SpringDoc e Swagger para documentar a API facilitou a comunicação das funcionalidades e a simulação de requisições. Além disso, a criação de testes 
automatizados ajudou a garantir a robustez e a qualidade da aplicação.

Cada desafio enfrentado trouxe um aprendizado importante e contribuiu para a a compreenção do desenvolvimento de APIs seguras e eficientes.


## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Maven](https://maven.apache.org)**
- **[MySQL](https://www.mysql.com)**
- **[Hibernate](https://hibernate.org)**
- **[Flyway](https://flywaydb.org)**
- **[Lombok](https://projectlombok.org)**

# 🖼 Imagens



### HTTP Requests

- User Login

  ![image](https://github.com/user-attachments/assets/2d2cae6b-eebb-4d60-b36d-3aec6e57849b)

- Qualquer requisição sem um token válido (Any request without a valid token)

  ![image](https://github.com/user-attachments/assets/4ea0785d-45a3-4ff8-8fa7-aa70e94f3d22)


#### CRUD funciando igual para Medico e Paciente (CRUD Doctor and Patientes)

- Cadastrar Novo Médico (CREATE new Doctor)

  ![image](https://github.com/user-attachments/assets/004d5603-293b-4a38-ba38-454c6f46bce6)

- Atualizar cadastro de Médico (UPDATE Doctor)

  ![image](https://github.com/user-attachments/assets/3642c1a9-ba9f-4739-813f-54dac6486275)


- Excluir Médico (DELETE Doctor


### Banco de dados (Data Base)

- Usuários (Users)

  ![image](https://github.com/user-attachments/assets/a088220d-eb99-4b2b-8bda-ef83c1484033)

- Médicos (Doctors)

  ![image](https://github.com/user-attachments/assets/f0d0e43c-397a-4aea-8c53-c52905c78083)


- Pacientes (Patients)

  ![image](https://github.com/user-attachments/assets/ab829eb4-4313-433f-aa0b-313dc4f930d4)

- Consultas (Appointments) 

  ![image](https://github.com/user-attachments/assets/de3e6b94-47f4-46f8-a656-d9260513c503)
