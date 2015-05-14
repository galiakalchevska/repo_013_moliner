package parte3;

import java.util.*;

import parte1.Formato;

/**
 * @author GALIA
 * @version 20 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Pelicula.Hereda de Almac�n.
 */
public class Pelicula extends Almacen {

	/* Atributos privados */

	private Integer idPelicula = null;
	private int cantidad_de_copias;
	private String actor_principal;
	private String actriz_principal;

	/**
	 * Constructor con los dos atributos privados de la clase
	 * 
	 * @param actor_principal
	 * @param actriz_principal
	 */
	public Pelicula(String actor_principal, String actriz_principal) {
		this.actor_principal = actor_principal;
		this.actriz_principal = actriz_principal;
		
		 /* hacemos una llamada al void comprobar para asegurarnos que al menos
		 * uno de los atributos no sea nulo,en caso contrario he definido un
		 * mensaje de excepci�n*/
		 
		comprobar(actor_principal, actriz_principal);
	}

	/*Otra manera de definir el constructor,sin usar m�todo para comprobar, o sea directamente*/
	
	/*public Pelicula (String actor_principal, String actriz_principal){
		if(actor_principal == null && actriz_principal  == null){
			throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
		}
		this.actor_principal = actor_principal;
		this.actriz_principal = actriz_principal;
	}*/
	
	/**
	 * Constructor con los atributos privados(sin los heredados) de un objeto de
	 * la clase Pel�cula
	 * 
	 * @param idPelicula
	 * @param cantidad_de_copias
	 */
	public Pelicula(Integer idPelicula, int cantidad_de_copias) {
		this.idPelicula = idPelicula;
		this.cantidad_de_copias = cantidad_de_copias;
	}

	/**
	 * El segundo constructor
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param idPelicula
	 * @param cantidad_de_copias
	 */
	public Pelicula(String titulo, String autor, Formato formato,
			Integer idPelicula, int cantidad_de_copias) {
		super(titulo, autor, formato);
		this.idPelicula = idPelicula;
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/**
	 * Void. Comprueba si al menos uno de los atributos recibidos como par�metro
	 * al construir el objeto no sea nulo.
	 * 
	 * @param actor_principal
	 * @param actriz_principal
	 */
	public void comprobar(String actor_principal, String actriz_principal) {
		this.actor_principal = actor_principal;
		this.actriz_principal = actriz_principal;
		if (this.actor_principal == null) {
			this.actriz_principal = Objects
					.requireNonNull(actriz_principal,
							"Tiene que haber un nombre obligatorio para uno de los protagonistas: ");
		} else {
			if (this.actriz_principal == null) {
				this.actor_principal = Objects
						.requireNonNull(actor_principal,
								"Tiene que haber un nombre obligatorio para uno de los protagonistas: ");
			}
		}
	}

	/* M�todos de acceso a los atributos privados (setters & getters) */
	/**
	 * @return. Devuelve el id del objeto Pel�cula
	 */
	public Integer getIdPelicula() {
		return idPelicula;
	}

	/**
	 * @param idPelicula
	 *            . Recibe por par�metro el id del objeto Pel�cula
	 */
	public void setIdDocumento(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto Pel�cula en el
	 *          Almac�n.
	 */
	public int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto Pel�cula
	 */
	public void setCantidad_de_copias(int cantidad_de_copias) {
		this.cantidad_de_copias = cantidad_de_copias;
	}

	/**
	 * @return actor_principal
	 */
	public String getActor_principal() {
		return actor_principal;
	}

	/**
	 * @param actor_principal
	 */
	public void setActor_principal(String actor_principal) {
		this.actor_principal = actor_principal;
	}

	/**
	 * @return actriz_principal
	 */
	public String getActriz_principal() {
		return actriz_principal;
	}

	/**
	 * @param actriz_principal
	 */
	public void setActriz_principal(String actriz_principal) {
		this.actriz_principal = actriz_principal;
	}
	
	@Override
	public String toString() {
		String informacion = "Protagonizada por: ";
		if(actor_principal != null ){
			informacion += actor_principal; 
			if(actriz_principal != null){
				informacion += " y " + actriz_principal;
			}
		}else{
			assert actriz_principal != null;
			informacion += actriz_principal;
		}
		return super.toString()+informacion;		
	}
}
