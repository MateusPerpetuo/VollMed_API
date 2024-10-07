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


![VOLLMED_API-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/2220f4d4-85ca-465d-ae12-ee0306d6b137)

[🔗 Assista ao vídeo completo da API funcionando no Linkedin](https://www.linkedin.com/posts/mateusperpetuo_springboot-java-apirest-activity-7249080670214352897-97WJ?utm_source=share&utm_medium=member_desktop)

## HTTP Requests

- User Login

  ![image](https://github.com/user-attachments/assets/2d2cae6b-eebb-4d60-b36d-3aec6e57849b)

- Qualquer requisição sem um token válido (Any request without a valid token)

  ![image](https://github.com/user-attachments/assets/4ea0785d-45a3-4ff8-8fa7-aa70e94f3d22)


## CRUD funciando igual para Medico e Paciente (CRUD Doctor and Patientes)


- Cadastrar Novo Médico (CREATE new Doctor)

  ![image](https://github.com/user-attachments/assets/004d5603-293b-4a38-ba38-454c6f46bce6)

- Atualizar cadastro de Médico (UPDATE Doctor)

  ![image](https://github.com/user-attachments/assets/3642c1a9-ba9f-4739-813f-54dac6486275)


- Excluir Médico (DELETE Doctor)

  ![image](https://github.com/user-attachments/assets/4cc06526-25da-4701-b1bd-5f31f355843c)

  DELETE não deleta o cadastro no Banco de Dados para não dar problema no relacionamento com a tabela de Consultas, mas muda o cadastro para Inativo.
  
  (DELETE does not remove the record from the database to avoid issues with the relationship to the Appointments table, instead, it changes the record status to Inactive)

  ![image](https://github.com/user-attachments/assets/292c45d2-412c-44d9-a17c-2dc22499c0b1)
  

- Exibir um lista com todos os Paciente/Medicos cadastrados e ativos (GET a list of all registered and active Patients same to Doctors)

  ![image](https://github.com/user-attachments/assets/53b370ff-6087-4aa6-8df4-2dcc9d057e51)

- Datalhes de um Paciente especifico por ID (Details of a specific Patient by ID)

  ![image](https://github.com/user-attachments/assets/28226491-7558-454e-a437-66eb98166611)



## Consultas (Appointments)

Para as consultas existem uma séries de regras de negócios que está sendo verificada no back-end, e sempre que o JSON passado na requisção não for devidamente validado, vai ser retornado uma mensagem de erro e o que está errado.

For the appointments, there are a series of business rules being verified in the back-end, and whenever the JSON passed in the request is not properly validated, an error message will be returned, specifying what is wrong.

### Agendamentos (Scheduling appointments)

- Agendamento de consulta concluido corretamente (Appointment scheduling completed successfully)

  ![image](https://github.com/user-attachments/assets/e0d54bdb-f768-4a65-a3e5-c8699b5600e6)

#### Agendamentos com erros  (Scheduling errors)

- Agendar em um dia que já passou (Scheduling on a date that has already passed)

  ![image](https://github.com/user-attachments/assets/93e2881a-542e-443e-b6af-7b8df82df5c4)

- Agendamentos de última hora (Last-minute appointments)

  ![image](https://github.com/user-attachments/assets/89dd555a-392a-4264-86a1-14d2dd429130)

- Agendamentos fora do horário de funcionamento (appointments outside of business hours)

  ![image](https://github.com/user-attachments/assets/34a6a5d1-09eb-42b3-b251-9153791a703f)

### Cancelamento de Consultas (Appointment Cancellation)

- Consulta cancelada com sucesso (Appointment canceled successfully)

![image](https://github.com/user-attachments/assets/fe2e4e18-ab78-4b33-b8f0-3a988fd650dc)



## Banco de dados (Data Base)

- Usuários (Users)

  ![image](https://github.com/user-attachments/assets/a088220d-eb99-4b2b-8bda-ef83c1484033)

- Médicos (Doctors)

  ![image](https://github.com/user-attachments/assets/f0d0e43c-397a-4aea-8c53-c52905c78083)


- Pacientes (Patients)

  ![image](https://github.com/user-attachments/assets/ab829eb4-4313-433f-aa0b-313dc4f930d4)

- Consultas (Appointments) 

  ![image](https://github.com/user-attachments/assets/de3e6b94-47f4-46f8-a656-d9260513c503)
