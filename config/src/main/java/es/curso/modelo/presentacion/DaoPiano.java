package es.curso.modelo.presentacion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.curso.modelo.entidades.Piano;
// importo la ruta Piano en el import de aqui arriba


// generamos las etiquetas en la clase DaoPiano
@Component(value="daoPiano")
//@Scope('singelton') -> no es necesario, es por defecto

public class DaoPiano {

    // genero los atributos de la clase DaoPiano (sus características)
    // entre sus atributos, genero un List -> listaPiano
    private List<Piano> listaPianos;
    private int numeroMaxPianos;


    // generamos un constructor para inicializar la lista y el número máximo de pianos

    public DaoPiano(List<Piano> listaPianos, int numeroMaxPianos) {
        this.listaPianos = new ArrayList<>();
        this.numeroMaxPianos = 21;   // vamos a permitir un tope de 21 pianos
    }
    
 

    // Insertar un piano a la lista
    // aquí vamos a comprobar si el piano no tiene marca, si marca no tiene ninguna referencia de piano (OR) y el piano no tiene teclado (o está vacío) ... 
    public boolean insertar(Piano p) {
        if(p.getMarca() == null || p.getMarca().isEmpty() || p.getTeclas() == null) {
            return false;     // si compruebo lo anterior y es así, devuélveme false
        } else if (listaPianos.size() >= numeroMaxPianos) {   // en otro caso, voy a comprobar si el tamaño de la lista de Pianos es mayor que el númeroMaxPianos
            return false;      // si esto se cumple, devuélveme false
        }
        p.setId(generarNuevoId());  // asignaremos un nuevo Id al piano antes de insertarlo
        listaPianos.add(p);   // en último caso, ahora si quiero que me insertes los elementos dentro de la colección listaPianos a la lista
        return true;
    }

    // mostrar un piano por su Id en la lista
    public Piano buscar(int id) {
        for (Piano piano : listaPianos) {
            if (piano.getId() == id) {
                return piano;
            }
        }
        return null;  //Si no encuentra el piano, devuelve null
    }



    // mostrar todos os pianos de la colección listaPianos
    public List<Piano> listar() {
        return listaPianos;
    }
    
    // Elimina un piano por su Id
    public boolean eliminar (int id) {
        Piano pianoEliminar = buscar(id);
        if (pianoEliminar != null) {
            return listaPianos.remove(pianoEliminar);
        }
        return false;   // Si no se encuentra el piano, no se puede eliminar de la colección listaPianos
    }


    // Método privado para generar un nuevo Id único
    public List<Piano> buscarPorMarca(String marca) {
         List<Piano> pianosEncontrados = new ArrayList<>();
         for (Piano piano : listaPianos) {
            if (piano.getMarca().equalsIgnoreCase(marca)) {
                pianosEncontrados.add(piano);
            }
         }
         return pianosEncontrados;
    }

    public List<Piano> buscarPorPrecio (double precioMin, double precioMax) {
        List<Piano> pianosEncontrados = new ArrayList<>();
        for (Piano piano : listaPianos) {
            if (Piano.getPrecio() >= precioMin && piano.getPrecio() <= precioMax) {
                pianosEncontrados.add(piano);
            }
        }
        return pianosEncontrados;
    }

    public List<Piano> buscarPorPais(String pais) {
        List<Piano> pianosEncontrados = new ArrayList<>();
        for (Piano piano : listaPianos)  {
            if (piano.getPais().equalsIgnoreCase(pais)) {
                pianosEncontrados.add(piano);
            }
        }    
        return pianosEncontrados;
    }

    
    private int generarNuevoId() {
        int nuevoId = 1;
        if (!listaPianos.isEmpty()) {
            nuevoId = listaPianos.get(listaPianos.size() - 1).getId() + 1;
        }
        return nuevoId;
    }

    // getter y setter para numeroMaxPianos (puede ser útil en otras partes)
    public int getNumeroMaxPianos() {
        return numeroMaxPianos;
    }

    public void setNumeroMaximoPianos(int numeroMaxPianos) {
        this.numeroMaxPianos = numeroMaxPianos;
    }

}

