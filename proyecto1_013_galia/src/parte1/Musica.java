package parte1;

/**
 * @author GALIA
 * @version 26 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Musica.Hereda de Almacén.
 */
public class Musica extends Almacen {

	/* Atributos privados */

	private Integer idMusica;
	private int cantidad_de_copias;

	/* Constructores */

	/**
	 * Constructor por defecto
	 */
	public Musica() {
	}

	/**
	 * Constructor con los atributos privados(sin los heredados) de un objeto de
	 * la clase Música
	 * 
	 * @param idMusica
	 * @param cantidad_de_copias
	 */
	public Musica(Integer idMusica, int cantidad_de_copias) {
		this.setIdMusica(idMusica);
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/**
	 * El último constructor está compuesto de todos los atributos,heredados y
	 * propios
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param idMusica
	 * @param cantidad_de_copias
	 */
	public Musica(String titulo, String autor, Formato formato,
			Integer idMusica, int cantidad_de_copias) {
		super(titulo, autor, formato);
		this.setIdMusica(idMusica);
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/* Métodos de acceso a los atributos privados (setters & getters) */

	/**
	 * @return. Devuelve el id del objeto Música
	 */
	public Integer getIdMusica() {
		return idMusica;
	}

	/**
	 * @param idMusica
	 *            . Recibe por parámetro el id del objeto Música
	 */
	public void setIdMusica(Integer idMusica) {
		this.idMusica = idMusica;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto Música en el
	 *          Almacén.
	 */
	public int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto Música
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
		return super.toString() + "Identificador: " + this.idMusica
				+ "\nCantidad de copias: " + this.cantidad_de_copias + "\n";
	}
}
