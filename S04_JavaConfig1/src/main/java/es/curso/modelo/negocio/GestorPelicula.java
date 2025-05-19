package es.curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.modelo.entidad.Pelicula;
import es.curso.modelo.persistencia.DaoPelicula;

@Service
public class GestorPelicula {
	
	@Autowired
	private DaoPelicula daoPelicula;
	
	/**
	 * Método que insertará una película mediante el daoPelicula. La película
	 * no puede tener el título vacío para poder ser insertada
	 * @param p la película a insertar
	 * @return 0 en caso de que hayamos podido insertar la película, 1 en caso
	 * de que el título este vacío y 2 en caso de la lista no admita más películas
	 */
	public int insertar(Pelicula p) {
		if(p.getTitulo().equals("")) {
			return 1; // titulo esta vacío, insertado correctamente
		} else {
			boolean insertada = daoPelicula.insertar(p);
			if(insertada) {
				return 0; // titulo de película ya insertado, anteriormente (copia)
			} else {
				return 2; // título de película insertado correctamente, procede a guardar exitosamente
			}
		}
	}
	
	public List<Pelicula> listar(){
		return daoPelicula.getListaPeliculas();
	}

	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}


	public void setListaPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}	



	// Como esto es la parte lógica aquí añadimos un nuevo método que 
	// nos permitan contar cuantas películas hay
	public int contar() {
		return daoPelicula.getListaPeliculas().size();
	}
}


