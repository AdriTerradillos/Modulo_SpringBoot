package es.curso.modelo.negocio;
// tambien lo podríamos llamar FabricaPiano


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.modelo.entidades.Piano;
import es.curso.modelo.presentacion.DaoPiano;


// agrego las siguientes etiquetas a la clase GestorPiano
@Service
public class GestorPiano {

    // agregamos la etiqueta AutoWired
    @Autowired
    private DaoPiano daoPiano;

    public boolean agregar(Piano piano) {  // aquí podríamos agregar lógica de negocio adicional antes e insertar
        return daoPiano.insertar(piano);
    }

    public Piano get(int id) {
        return daoPiano.buscar(id);
    }

    public List<Piano> listarPianos() {
        return daoPiano.listar();
    }

    public boolean borrar(int id) { // aquí podríamos agregar lógica de negocio adicional antes de eliminar
        return daoPiano.eliminar(id);
    }

    public List<Piano> buscarPianosPorMarcas(String marca) {
        // aquí podríamo agregar la lógica de negocio antes de la búsqueda si fuera necesario
        return daoPiano.buscarPorMarca(marca);
    }

    public List<Piano> buscarPianosPorPrecio (double precoMin, double precioMax) {
        // aquí podríamo agregar la lógica de negocio antes de la búsqueda si fuera necesario
        return daoPiano.buscarPorPrecio(precoMin, precioMax);
    }

    public List<Piano> buscarPianosPorPais(String pais) {
        // aquí podríamo agregar la lógica de negocio antes de la búsqueda si fuera necesario
        return daoPiano.buscarPorPais(pais);
    }
    
}
