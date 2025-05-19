package es.curso.modelo.entidades;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// generamos las etiquetas de la clase Piano
@Component(value="piano")
@Scope("prototype")

public class Piano<fechaDeLanzamiento> {

    // generamos los atributos de la clase piano (características que asignamos y buscamos en clase piano)
    private int id;
    private String marca;
    private String modelo;
    // dentro de los atributos de clase Piano, incluímos un List que más adelante desglosaremos
    private List<Teclado> teclas;
    private static double precio;
    private String pais;
    private Date fechaDeLanzamiento;
    private String color;
    

  
// genero un constructor vacío
public Piano() {
}



// genero los getters y setters de clase piano


public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getMarca() {
    return marca;
}


public void setMarca(String marca) {
    this.marca = marca;
}


public String getModelo() {
    return modelo;
}


public void setModelo(String modelo) {
    this.modelo = modelo;
}


public List<Teclado> getTeclas() {
    return teclas;
}


public void setTeclas(List<Teclado> teclas) {
    this.teclas = teclas;
}


public static double getPrecio() {
    return precio;
}


public void setPrecio(double precio) {
    this.precio = precio;
}


public String getPais() {
    return pais;
}


public void setPais(String pais) {
    this.pais = pais;
}


public Date getFechaDeLanzamiento() {
    return fechaDeLanzamiento;
}


public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
    this.fechaDeLanzamiento = fechaDeLanzamiento;
}


public String getColor() {
    return color;
}


public void setColor(String color) {
    this.color = color;
}



@Override
public String toString() {
    return "Piano [id= " + id + 
    ", marca= " + marca + 
    ", modelo= " + modelo + 
    ", teclas= " + teclas + 
    ", precio= " + precio +
     ", pais= " + pais + 
     ", fechaDeLanzamiento= " + fechaDeLanzamiento +
      ", color= " + color + "]";
}

// genero el método toString()





}
