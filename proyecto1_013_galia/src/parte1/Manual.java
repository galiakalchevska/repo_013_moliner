package parte1;

/**
 * @author GALIA
 * @version 20 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Manual.Hereda de Almac�n.
 */
public class Manual extends Almacen {

	/* Atributos privados */

	private Integer idManual;
	private int cantidad_de_copias;

	/**
	 * Constructor por defecto
	 */

	public Manual() {

	}

	/**
	 * Constructor con los atributos privados(sin los heredados) de un objeto de
	 * la clase Manual
	 * 
	 * @param idManual
	 * @param cantidad_de_copias
	 */

	public Manual(Integer idManual, int cantidad_de_copias) {
		this.idManual = idManual;
		/*
		 * una cosa curiosa que acabo de observar, porque como estaba relajada
		 * copiando y pegando el c�digo en todas las clases hijas y cambiando
		 * los id de los atributos,bueno,a lo que voy. � O sea, se puede acceder
		 * a los atributos privados de ambas formas, la de arriba y de abajo?
		 */
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/**
	 * El �ltimo constructor est� compuesto de todos los atributos,heredados y
	 * propios
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param idManual
	 * @param cantidad_de_copias
	 */
	public Manual(String titulo, String autor, Formato formato,
			Integer idManual, int cantidad_de_copias) {
		super(titulo, autor, formato);
		this.idManual = idManual;
		/* �Pero (preguntar a Javier) cu�l es la diferencia? */
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/* M�todos de acceso a los atributos privados (setters & getters) */
	/**
	 * @return. Devuelve el id del objeto Manual
	 */
	public Integer getIdManual() {
		return idManual;
	}

	/**
	 * @param idManual
	 *            . Recibe por par�metro el id del objeto Manual
	 */
	public void setIdManual(Integer idManual) {
		this.idManual = idManual;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto Manual en el
	 *          Almac�n.
	 */
	public int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto Manual
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
		return super.toString() + "Identificador: " + this.idManual
				+ "\nCantidad de copias: " + this.cantidad_de_copias + "\n";
	}
}
