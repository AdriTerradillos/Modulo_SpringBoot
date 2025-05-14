package com.concesionario.demo.negocio;

import com.concesionario.modelo.entidades.Automovil;
import com.concesionario.modulo.persistencia.AutomovilDAO;

import java util.List;

import com.concesionario.demo.entidades.Automovil;
import com.concesionario.demo.persistencia.AutomovilDAO;


public class GestionAutomoviles {

    // genero los atributos de la clase
    private AutomovilDAO automovilDAO;

    
    // genero el ArrayList de la clase
    public GestionAutomoviles() {
        this.automovilDAO = new AutomovilDAO();
    }

    public void agregarAutomovil(Automovil automovil) {
        automovilDAO.guardar(automovil);
    }

    public Automovil getAutomovil(int id) {
        return automovilDAO.get(id);
    }

    public List<Automovil> getTodosAutomoviles() {
        return automovilDAO.getTodos();
    }

    public void actualizarAutomovil(Automovil automovil ) {
        automovilDAO.actualizar(automovil);
    }

    public void eliminarAutomovil(int id) {
        automovilDAO.eliminar(id);
    }



    }
    

