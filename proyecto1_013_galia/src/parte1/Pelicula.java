package parte1;

/**
 * @author GALIA
 * @version 26 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Pelicula.Hereda de Almacén.
 */
public class Pelicula extends Almacen {

	/* Atributos privados */

	private Integer idPelicula;
	private int cantidad_de_copias;

	/**
	 * Constructor por defecto
	 */
	public Pelicula() {
	}

	/**
	 * Constructor con los atributos privados(sin los heredados) de un objeto de
	 * la clase Película
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

	/* Métodos de acceso a los atributos privados (setters & getters) */
	/**
	 * @return. Devuelve el id del objeto Película
	 */
	public Integer getIdPelicula() {
		return idPelicula;
	}

	/**
	 * @param idPelicula
	 *            . Recibe por parámetro el id del objeto Película
	 */
	public void setIdDocumento(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto Película en el
	 *          Almacén.
	 */
	public int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto Película
	 */
	public void setCantidad_de_copias(int cantidad_de_copias) {
		this.cantidad_de_copias = cantidad_de_copias;
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString() Devuelve información del objeto.
	 * Sobrescribe el método toString de la clase padre.
	 */
	@Override
	public String toString() {
		return super.toString() + "Identificador: " + this.idPelicula
				+ "\nCantidad de copias: " + this.cantidad_de_copias + "\n";
	}
}
