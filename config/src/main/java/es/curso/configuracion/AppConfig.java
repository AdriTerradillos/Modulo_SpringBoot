package es.curso.configuracion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Importamos las etiquetas siguientes a la clase AppConfig
@Configuration
@ComponentScan(basePackageClasses = "es.curso.modelo")

public class AppConfig {
    
}
