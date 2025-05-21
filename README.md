# 🌱 Módulo Spring Boot — Repaso Personal


---

## 📁 Estructura del Repositorio

- `S01_SpringFundamentos/`: Fundamentos de Spring
- `S02_SpringCapas/`: Arquitectura por capas
- `S03_SpringAnotaciones/`: Uso de anotaciones en Spring
- `S04_JavaConfig1/`: Configuración Java-based (parte 1)
- `S05_JavaConfig2/`: Configuración Java-based (parte 2)
- `S06_JdbcTemplate/`: Acceso a datos con JdbcTemplate
- `MisProyectosPersonales_Maven/demo/`: Proyecto personal de ejemplo

---

## 🌼 Fundamentos de Spring (`S01_SpringFundamentos/`)

### 🔹 Conceptos Clave

- **Inversión de Control (IoC)**: Delegar la creación y gestión de objetos al contenedor de Spring.
- **Inyección de Dependencias (DI)**: Proveer las dependencias de un objeto en tiempo de ejecución.
- **Beans**: Objetos gestionados por el contenedor de Spring.

 📌 Ejemplo de Código

```java

@Component
public class SaludoService {
    public String saludar() {
        return "¡Hola desde Spring!";
    }
}

```

---

## 🧱 Arquitectura por Capas (`S02_SpringCapas/`)

### 🔹Conceptos Clave 

   -Controlador **(Controller)**: Maneja las solicitudes HTTP y las respuestas.

   -Servicio **(Service)**: Contiene la lógica de negocio.

  -Repositorio **(Repository)**: Interactúa con la base de datos.

📌 Ejemplo de Código

```java

 @RestController
 @RequestMapping("/api")
public class SaludoController {

    @Autowired
    private SaludoService saludoService;

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return saludoService.saludar();
    }
}

```

---

## 📝 Anotaciones en Spring (`S03_SpringAnotaciones/`)  

--### Principales Anotaciones

  - ** @Component**: Marca una clase como un componente de Spring.

   -**@Service**: Especialización de @Component para la capa de servicio.

  - **@Repository**: Especialización de @Component para la capa de acceso a datos.

  - **@Autowired**: Inyecta automáticamente las dependencias.

📌 Ejemplo de Código

```java

@Service
public class SaludoServiceImpl implements SaludoService {
    @Override
    public String saludar() {
        return "¡Hola desde el servicio!";
    }
}

```

---

## ⚙️ Configuración Java-based (`S04_JavaConfig1/` y `S05_JavaConfig2/`)
### 🔹Conceptos Clave

   **Configuración basada en Java**: Definir beans y configuraciones usando clases Java en lugar de archivos XML.

  - Anotaciones:

  - **@Configuration**: Indica que la clase contiene definiciones de beans.
  
  - **@Bean**: Define un bean que será gestionado por el contenedor de Spring.

📌 Ejemplo de Código

```java

@Configuration
public class AppConfig {

    @Bean
    public SaludoService saludoService() {
        return new SaludoServiceImpl();
    }
}

```

---

## 🗄️ Acceso a Datos con JdbcTemplate (`S06_JdbcTemplate/`)
### 🔹 Conceptos Clave

    JdbcTemplate: Clase de Spring que simplifica el uso de JDBC para interactuar con bases de datos.

    Operaciones comunes: Consultas, inserciones, actualizaciones y eliminaciones.

📌 Ejemplo de Código

```java

@Repository
public class UsuarioRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Usuario> obtenerTodos() {
        String sql = "SELECT * FROM usuarios";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Usuario.class));
    }
}


```

---

## 🧪 Proyecto Personal de Ejemplo (`MisProyectosPersonales_Maven/demo/`)
###  Descripción

- Este proyecto es una aplicación sencilla que integra los conceptos aprendidos en los módulos anteriores. Incluye una estructura por capas, uso de anotaciones, configuración Java-based y acceso a datos con JdbcTemplate.
📌 Ejecución del Proyecto

```java

# Navegar al directorio del proyecto
cd MisProyectosPersonales_Maven/demo

```

```java

# Compilar y ejecutar la aplicación
mvn spring-boot:run

```

--- 


### 📚 Recursos Recomendados

** Para profundizar en estos temas, te recomiendo los siguientes recursos**:

   - Tutorial de Spring Boot en Español:
    FreeCodeCamp

  -  Guía oficial de Spring Boot:
    Home

   - Curso en video sobre Spring Boot:
    YouTube
