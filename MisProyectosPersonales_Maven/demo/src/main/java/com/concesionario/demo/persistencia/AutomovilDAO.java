package com.concesionario.demo.persistencia;

import java.applet.AudioClip;
import java.util.ArrayList;
import java.util.HashMap;

import com.concesionario.modelo.entidades.Automovil;

import java util.ArrayList;
import java util.HashMap;
import java util.List;
import java util.Map;

import com.concesionario.demo.entidades.Automovil;

public class AutomovilDAO {

    // genero un atributo de Arraylist dentro de la clase
    private Map<Integer, Automovil> automoviles;

    public AutomovilDAO() {
        this.automoviles = new HashMap<>();
    }

    public void guardar (Automovil automovil ) {
        automoviles.put (automovil.getId(), automovil);
    }

    public Automovil get (int id) {
        return automoviles.get(id);
    }

    public List<Automovil> getTodos() {
        return new ArrayList<>(automoviles.values());
    }

    public void actualizar (Automovil automovil ) {
        if (automoviles.containsKey(automovil.getId())) {
            automoviles.put (automovil.getId(), automovil);
        }

    }

    public void eliminar (int id) {
        automoviles.remove(id);
    }
    
}
