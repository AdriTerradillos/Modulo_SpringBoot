package com.concesionario.modelo.persistencia;

    import com.concesionario.modelo.entidades.Motocicleta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class MotocicletaDAO {
        private Map<Integer, Motocicleta> motocicletas;

        public MotocicletaDAO() {
            this.motocicletas = new HashMap<>();
        }

        public void guardar(Motocicleta motocicleta) {
            motocicletas.put(motocicleta.getId(), motocicleta);
        }

        public Motocicleta obtener(int id) {
            return motocicletas.get(id);
        }

        public List<Motocicleta> obtenerTodos() {
            return new ArrayList<>(motocicletas.values());
        }

        public void actualizar(Motocicleta motocicleta) {
            if (motocicletas.containsKey(motocicleta.getId())) {
                motocicletas.put(motocicleta.getId(), motocicleta);
            }
        }

        public void eliminar(int id) {
            motocicletas.remove(id);
        }
    }
    