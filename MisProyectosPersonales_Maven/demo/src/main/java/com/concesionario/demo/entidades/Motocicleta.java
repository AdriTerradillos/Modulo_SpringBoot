package com.concesionario.demo.entidades;

public class Motocicleta {

    // declaro los atributos de la clase
    private String tipoManillar;
    private int cilindrada;


    // genero el constructor de la clase
    public Motocicleta(int id, String marca, Strng modelo, int anio, double precio, String tipoManillar, int cilindrada ) {
        super (id, marca, modelo, anio, precio );
        this.cilindrada = cilindrada;
        this.tipoManillar = tipoManillar;
    }


    // getters y setters

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    // genero ahora el método toSttring()
    @Override
    public String toString() {
        return "Motocicleta [" +
                "id= " + getId() +  // Llama al getId() de la superclase
                ", marca= " + getMarca() +
                ", modelo= " + getModelo() +
                ", anio= " + getAnio() + 
                ", precio= " + getPrecio() + 
                ",vendido= " + isVendido() +
                ", tipoManillar= " + tipoManillar + 
                ", cilindrada= " + cilindrada +
                "]"; 
    }


}
