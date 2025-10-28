🏥 ClínicaSpringBootMurillo
📋 Descripción del Proyecto

ClínicaSpringBootMurillo es una aplicación desarrollada en Java Spring Boot que gestiona la información de una clínica médica.
Permite administrar pacientes, médicos, historiales clínicos y tarjetas profesionales mediante un conjunto de endpoints RESTful.

El objetivo es ofrecer una arquitectura limpia, modular y fácil de mantener, siguiendo las buenas prácticas de desarrollo con Spring Boot, JPA/Hibernate y MySQL.

⚙️ Tecnologías Utilizadas
Tecnología	Descripción
☕ Java 17+	Lenguaje de programación principal
🌱 Spring Boot 3.x	Framework para desarrollo backend
🗄️ Spring Data JPA	Acceso a base de datos mediante ORM
🧰 Maven	Gestión de dependencias y build
🐬 MySQL	Base de datos relacional
🧾 Hibernate	ORM para el mapeo de entidades
🧪 Spring Boot Test / JUnit 5	Pruebas unitarias y de integración
📡 Spring Web	Creación de controladores REST
🔐 Spring Validation	Validaciones de entidades DTO
🧱 Estructura del Proyecto

ClinicaSpringBootMurillo/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/ClinicaSpringBootMurillo/
│   │   │   ├── controller/         # Controladores REST
│   │   │   ├── dto/                # Clases DTO (transferencia de datos)
│   │   │   ├── modelos/            # Entidades JPA
│   │   │   ├── repository/         # Repositorios JPA
│   │   │   ├── service/            # Lógica de negocio
│   │   │   ├── exceptions/         # Manejo de errores global
│   │   │   └── ClinicaSpringBootMurilloApplication.java
│   │   └── resources/
│   │       ├── application.properties  # Configuración de la BD y servidor
│   │       └── static / templates      # (Si se usa para front o HTML)
│   └── test/                           # Pruebas unitarias e integración
│
├── pom.xml                             # Configuración de Maven
└── README.md                           # Documentación del proyecto

🧩 Entidades Principales
👨‍⚕️ Medico

id

nombres

apellidos

especialidad

aniosExperiencia

tarjetaProfesional

👩‍🩺 Paciente

id

nombres

apellidos

email

telefono

fechaNacimiento

activo

saldoPendiente

📋 HistoriaClinica

id

descripcion

fecha

paciente (relación @ManyToOne)

🪪 TarjetaProfesional

id

numero

fechaExpedicion

entidadEmisora

medico (relación @OneToOne)

🌐 Endpoints Principales
🔹 PacienteController (/api/pacientes)
Método	Endpoint	Descripción
GET	/api/pacientes	Listar todos los pacientes
GET	/api/pacientes/{id}	Obtener un paciente por ID
POST	/api/pacientes	Crear un nuevo paciente
PUT	/api/pacientes/{id}	Actualizar un paciente
DELETE	/api/pacientes/{id}	Eliminar un paciente
🔹 MedicoController (/api/medicos)
Método	Endpoint	Descripción
GET	/api/medicos	Listar todos los médicos
GET	/api/medicos/{id}	Obtener médico por ID
POST	/api/medicos	Crear nuevo médico
PUT	/api/medicos/{id}	Actualizar médico
DELETE	/api/medicos/{id}	Eliminar médico

