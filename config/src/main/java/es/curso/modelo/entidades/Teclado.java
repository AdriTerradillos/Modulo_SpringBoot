package es.curso.modelo.entidades;

// las dependencias de las que aviso justo abajo
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// cuidado don las dependencias en el pom.xml (deben estar ahí al momento de iniciar el proyecto, sino, toca importarlas al pom.xml)
// agregamos despues del toString /terminado abajo) , las etiquetas siguientes
@Component(value="teclado")
@Scope("prototype")

public class Teclado {

    // genero los atributos de la clase Teclado
    private int id;
    private int teclas;


    // genero constructor de clase Tecla
    public Teclado() {
        this.id = 1;  // damos el valor 1 a la id
    }
    

    // genero getters y setters
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public int getTeclado() {
            return teclas;
        }
    
        public void setTeclas(int teclas) {
            this.teclas = teclas;
        }
  
    

    
    // toString()
    
    @Override
    public String toString() {
        return "Teclado [id= " + id + 
        ", teclado = " + teclas + 
        "]";
    }

    
}
