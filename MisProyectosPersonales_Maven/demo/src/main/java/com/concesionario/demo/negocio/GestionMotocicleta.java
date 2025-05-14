package com.concesionario.demo.negocio;

import com.concesionario.modelo.entidades.Motocicleta;
import com.concesionario.modelo.persistencia.MotocicletaDAO;

import java util.List;

import com.concesionario.demo.entidades.Motocicleta;
import com.concesionario.demo.persistencia.MotocicletaDAO;

public class GestionMotocicleta {

    // genero los atributos de la clase
    private MotocicletaDAO motocicletaDAO;

    // genero el constructor de la clase
    public GestionMotocicletas () {
        this.motocicletaDAO = new MotocicletaDAO();
    }
    
    public void agregarMoticicleta (Motocicleta motocicleta) {
        motocicletaDAO.guardar(motocicleta);
    }

    // genero el getter de clase motocicleta

    public MotocicletaDAO getMotocicletaDAO(int id) {
        return motocicletaDAO.get(id);
    }

    public List<Motocicleta> (Motocicleta motocicleta ) {
       return  motocicletaDAO.getTodos();
    }

    public void actualizarMotocicleta (Motocicleta motocicleta ) {
        motocicletaDAO.actualizar(motocicleta);
    }

    public void eliminarMotocicleta (int id) {
        motocicletaDAO.eliminar(id);

    }
}
