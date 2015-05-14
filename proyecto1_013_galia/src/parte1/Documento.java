package parte1;

/**
 * @author GALIA
 * @version 20 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Documento.Hereda de Almacén.
 */
public class Documento extends Almacen {

	/* Atributos privados */

	private Integer idDocumento;
	private int cantidad_de_copias;

	/**
	 * Constructor por defecto
	 */
	public Documento() {
	}

	/**
	 * Constructor con los atributos privados(sin los heredados) de un objeto de
	 * la clase Documento
	 * 
	 * @param idDocumento
	 * @param cantidad_de_copias
	 */
	public Documento(Integer idDocumento, int cantidad_de_copias) {
		this.setIdDocumento(idDocumento);
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/**
	 * El último constructor está compuesto de todos los atributos,heredados y
	 * propios
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param idDocumento
	 * @param cantidad_de_copias
	 */
	public Documento(String titulo, String autor, Formato formato,
			Integer idDocumento, int cantidad_de_copias) {
		super(titulo, autor, formato);
		this.idDocumento = idDocumento;
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/* Métodos de acceso a los atributos privados (setters & getters) */
	/**
	 * @return. Devuelve el id del objeto Documento
	 */
	public Integer getIdDocumento() {
		return idDocumento;
	}

	/**
	 * @param idDocumento
	 *            . Recibe por parámetro el id del objeto Documento
	 */
	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto Documento en el
	 *          Almacén.
	 */
	public int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto Documento
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
		return super.toString() + "Identificador: " + this.idDocumento
				+ "\nCantidad de copias: " + this.cantidad_de_copias + "\n";
	}
}
