package parte1;

/**
 * @author GALIA
 * @version 26 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Musica.Hereda de Almac�n.
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
	 * la clase M�sica
	 * 
	 * @param idMusica
	 * @param cantidad_de_copias
	 */
	public Musica(Integer idMusica, int cantidad_de_copias) {
		this.setIdMusica(idMusica);
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/**
	 * El �ltimo constructor est� compuesto de todos los atributos,heredados y
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

	/* M�todos de acceso a los atributos privados (setters & getters) */

	/**
	 * @return. Devuelve el id del objeto M�sica
	 */
	public Integer getIdMusica() {
		return idMusica;
	}

	/**
	 * @param idMusica
	 *            . Recibe por par�metro el id del objeto M�sica
	 */
	public void setIdMusica(Integer idMusica) {
		this.idMusica = idMusica;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto M�sica en el
	 *          Almac�n.
	 */
	public int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto M�sica
	 */
	public void setCantidad_de_copias(int cantidad_de_copias) {
		this.cantidad_de_copias = cantidad_de_copias;
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString() Devuelve informaci�n del objeto.
	 * Sobrescribe el m�todo toString de la clase padre.
	 */

	@Override
	public String toString() {
		return super.toString() + "Identificador: " + this.idMusica
				+ "\nCantidad de copias: " + this.cantidad_de_copias + "\n";
	}
}
