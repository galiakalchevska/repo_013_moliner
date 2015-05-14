package parte3;

import parte1.Formato;

/**
 * @author GALIA
 * @version 26 de febrero 2015. Clase que define el comportamiento de los
 *          objetos Manual.Hereda de Almacén.
 */
public class Manual extends Almacen {

	/* Atributos privados */

	private static Integer idManual;
	private static int cantidad_de_copias;

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
		Manual.idManual = idManual;
		/*
		 * una cosa curiosa que acabo de observar, porque como estaba relajada
		 * copiando y pegando el código en todas las clases hijas y cambiando
		 * los id de los atributos,bueno,a lo que voy. O sea, se puede acceder a
		 * los atributos privados de ambas formas, la de arriba y de abajo.
		 */
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/**
	 * El último constructor está compuesto de todos los atributos,heredados y
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
		Manual.idManual = idManual;
		/* ¿Pero (preguntar a Javier) cuál es la diferencia? */
		this.setCantidad_de_copias(cantidad_de_copias);
	}

	/* Métodos de acceso a los atributos privados (setters & getters) */
	/**
	 * @return. Devuelve el id del objeto Manual
	 */
	public static Integer getIdManual() {
		return idManual;
	}

	/**
	 * @param idManual
	 *            . Recibe por parámetro el id del objeto Manual
	 */
	public void setIdManual(Integer idManual) {
		Manual.idManual = idManual;
	}

	/**
	 * @return. Devuelve la cantidad de copias de un objeto Manual en el
	 *          Almacén.
	 */
	public static int getCantidad_de_copias() {
		return cantidad_de_copias;
	}

	/**
	 * @param cantidad_de_copias
	 *            Establece la cantidad de copias de un objeto Manual
	 */
	public void setCantidad_de_copias(int cantidad_de_copias) {
		Manual.cantidad_de_copias = cantidad_de_copias;
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString() Devuelve información del objeto.
	 * Sobrescribe el método toString de la clase padre.
	 */
	@Override
	public String toString() {
		return super.toString() + "Identificador: " + Manual.idManual
				+ "\nCantidad de copias: " + Manual.cantidad_de_copias;
	}
}
