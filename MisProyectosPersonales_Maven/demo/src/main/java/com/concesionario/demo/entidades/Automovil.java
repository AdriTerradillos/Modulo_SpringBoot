package com.concesionario.demo.entidades;

public class Automovil extends Vehiculo {

    // declaro los atributos a mi clase
    private int numeroPlazas;
    private String tipoCombustible;

    // declaro el método Automóvil haciendo llamamiento del mismo
    public Automovil(){}

    // constructor de la clase 
    public Automovil (int id, String marca, String modelo, int anio, double precio, int numeroPlazas, String tipoCombustible ) {
        super (id, marca, modelo, anio, precio);
        this.numeroPlazas = numeroPlazas;
        this.tipoCombustible = tipoCombustible;
    }


    // getters y setters

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    // ahora genero método @Override
    @Override
    public toString() {
    return "Automovil[" +
            "id= " + getId() + // Llama al getId() de la superclase
            ", marca= '" + getMarca() + '\'' +
            ", modelo= '" + getModelo() + '\'' +
            ", anio= " + getAnio() +
            ", precio= " + getPrecio() +
            ", vendido= " + isVendido() +
            ", numeroPlazas= " + numeroPlazas +
            ", tipoCombustible= '" + tipoCombustible +
            "]";
}
    
}
