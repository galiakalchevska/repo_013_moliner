package parte3;

import parte1.Formato;


/**
 * @author GALIA
 * @version 20 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Libro.Hereda de Almacén.
 */
public class Libro extends Almacen {

	/* Atributos privados */

	private Integer idLibro;
	private int cantidad_de_copias;

	/**
	 * Constructor por defecto
	 */
	public Libro() {
	}

	/**
	 * Constructor con los atributos privados(sin los heredados) de un objeto de
	 * la clase Libro
	 * 
	 * @param idLibro
	 * @param cantidad_de_copias
	 */
	public Libro(Integer idLibro, int cantidad_de_copias) {
		this.idLibro = idLibro;
		this.cantidad_de_copias = cantidad_de_copias;
	}

	/**
	 * Constructor por defecto, llama al método super() de la clase padre, con
	 * los atributos allí definidos.Atributos heredados.
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Libro(String titulo, String autor) {
		super(titulo, autor);
	}

	/**
	 * Constructor por defecto, llama al método super() de la clase padre, con
	 * los atributos allí definidos.Atributos heredados.
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 */
	public Libro(String titulo, String autor, Formato formato) {
		super(titulo, autor, formato);
	}

	/**
	 * El último constructor está compuesto de todos los atributos,heredados y
	 * propios
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param idLibro
	 * @param cantidad_de_copias
	 */
	public Libro(String titulo, String autor, Formato formato, Integer idLibro,
			int cantidad_de_copias) {
		super(titulo, autor, formato);
		this.idLibro = idLibro;
		this.cantidad_de_copias = cantidad_de_copias;
	}

	/* Métodos de acceso a los atributos privados (setters & getters) */

	/**
	 * @return. Devuelve el id del libro
	 */
	public  Integer getIdLibro() {
		return idLibro;
	}

	/**
	 * @param idLibro
	 *            . Recibe por parámetro el id del Libro
	 */
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un libro en el Almacén.
	 */
	public  int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias del libro
	 */
	public void setCantidad_de_copias(int cantidad_de_copias) {
		this.cantidad_de_copias = cantidad_de_copias;
	}
	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString() Devuelve información del objeto.
	 * Sobrescribe el método toString de la clase padre. La autoreferencia this ya te la he explicado en numerosas ocasiones, la omito.
	 */
	@Override
	public String toString() {
		return super.toString()+"Identificador: " +this.idLibro+
				"\nCantidad de copias: "+this.cantidad_de_copias+"\n";
	}
}

