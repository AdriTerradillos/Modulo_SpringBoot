package es.curso.spring04;

public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String ciudad;
	private String cp;
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	public String toString() {
		return "Direccion [tipoVia= " + tipoVia + ", nombreVia= " + nombreVia + ", ciudad= " + ciudad + ", cp= " + cp + "]";
	}	
}
