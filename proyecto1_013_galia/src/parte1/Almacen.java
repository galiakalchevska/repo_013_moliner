package parte1;

import java.util.*;

/**
 * @author GALIA
 * @version 26 de febrero 2015. Clase que define los objetos Almac�n.Guarda
 *          objetos de tipo electr�nico.problemas asociados a las relaciones
 *          entre objetos persistentes�Preguntar a Javier, qu� importancia
 *          tienen y qu� son los objetos persistentes?�Y que es Hibernate?
 */

public class Almacen {
	/*
	 * Atributos privados,no pueden ser modificados de fuera de la clase, tan
	 * solo lo har�n a trav�s de los m�todos de acceso
	 */

	private Integer id = null;
	/*
	 * el porque de este atributo,id Integer,es sobre lo que te voy a preguntar,
	 * Javier,de las clases persistentes y los errores que conlleva
	 */

	/* Los arrays de objetos contenidos en la clase Almac�n */

	private static ArrayList<Libro> libros;
	private static ArrayList<Pelicula> peliculas;
	private static ArrayList<Musica> musicas;
	private static ArrayList<Documento> documentos;
	private static ArrayList<Manual> manuales;

	/* Atributos protegidos,los que heredar�n las clases hijas */

	protected String titulo = null;
	protected String autor = null;
	protected Formato formato = null;

	/* Constructores */

	/**
	 * Constructor por defecto. Vac�o
	 */
	public Almacen() {
	}

	/**
	 * Constructor con tres par�metros
	 * 
	 * @param titulo
	 * @param autor
	 * @param formato
	 */
	public Almacen(String titulo, String autor, Formato formato) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
	}

	/**
	 * Constructor con dos par�metros
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Almacen(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	/* M�todos para acceder a los valores de los atributos(setters y getters) */

	/**
	 * @return Retorna el id del objeto Almac�n. Es que estuve leyendo unas
	 *         cosas sobre la herencia entre las clases con objetos persistentes
	 *         y los problemas que creaba eso en el tiempo de ejecuci�n, pero no
	 *         me ha quedado nada claro, tendr� que investigar m�s. El caso es
	 *         que de recalcaba que ser�a bueno disponer de un identificador
	 *         para que al sobreescribir el m�todo equals() no nos diera
	 *         problema Hibernate(otra cosa que preguntar a Javier,�qu� es?)
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            Recibe por par�metro el id del objeto, de tipo Integer(o sea
	 *            de una clase envolvente, no el tipo primitivo int.) Eso es
	 *            importante luego para el tratamiento de los objetos, no lo s�
	 *            explicar muy bien, pero es por eso.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return Retorna el t�tulo de un objeto de la clase Almac�n
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            .Establece el valor del atributo t�tulo(lo recibe por
	 *            par�metro)
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return Devuelve el autor de un objeto de tipo Almac�n
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            Establece el autor del objeto Almac�n
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return Retorna el formato de un objeto de la clase Almac�n. El formato
	 *         es de tipo Formato(el enumerado que tenemos declarado fuera del
	 *         cuerpo de la clase)
	 */
	public Formato getFormato() {
		return formato;
	}

	/**
	 * @param formato
	 *            Establece el formato del susodicho objeto Almac�n.
	 */
	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	/**
	 * @return Retorna el array de libros, eso si, solo la referencia en
	 *         memoria(eso creo), porque al usar ArrayList perdemos la
	 *         informaci�n del objeto que tenemos guardada all�. Para acceder a
	 *         los objetos guardados dentro del ArrayList necesitar�amos de un
	 *         par�metro al menos, que es el �ndice, o sea el lugar que ocupa
	 *         dicho objeto en el ArrayList.Aqui pasa que no puedes usar this
	 *         con los setters y getters de los objetos, hay que hacerlo as�.
	 */
	public static ArrayList<Libro> getLibros() {
		return libros;
	}

	/**
	 * @param libros
	 *            . Recibe por par�metro el array de Libro.
	 */
	public void setLibros(ArrayList<Libro> libros) {
		Almacen.libros = libros;
	}

	/**
	 * @return. Devuelve la referencia en memoria del ArrayList, no retorna los
	 *          atributos de los objetos que lo componen.
	 */
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	/**
	 * Void. Recibe por par�metro el ArrayList Pel�cula
	 * 
	 * @param peliculas
	 */
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		Almacen.peliculas = peliculas;
	}

	/**
	 * @return. Devuelve la referencia en memoria del ASrrayList M�sica
	 */
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	/**
	 * @param musicas
	 *            . Void. Recibe por par�metro el ArrayList M�sica
	 */
	public void setMusicas(ArrayList<Musica> musicas) {
		Almacen.musicas = musicas;
	}

	/**
	 * @return Devuelve la referencia en memoria del ArrayList Documento
	 */
	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}

	/**
	 * @param documentos
	 *            Recibe como par�metro el ArrayList de Documento
	 */
	public void setDocumentos(ArrayList<Documento> documentos) {
		Almacen.documentos = documentos;
	}

	/**
	 * @return Retorna la referencia en memoria del ArrayList Manual
	 */
	public ArrayList<Manual> getManuales() {
		return manuales;
	}

	/**
	 * Void. Recibe por par�metro el ArrayList Manual
	 * 
	 * @param manuales
	 */
	public void setManuales(ArrayList<Manual> manuales) {
		Almacen.manuales = manuales;
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	/*
	 * �Preguntar a Javier que son las clases persistentes y porque generan
	 * problemas con la sobrecarga de los m�todos?�Y que es Hbernate? Luego para
	 * hacer el m�todo me he basado en lo que he le�do durante un par de d�as,
	 * pero eso no quiere decir que me ha quedado claro. B�sicamente, lo que he
	 * entend� era que para recorrer grandes colecciones de objetos (Colecciones
	 * no exactamente, ser�an arrays de objetos), el hashCode lo que hace es
	 * separar el conjunto de datos de objetos en bloques m�s peque�os, se usan
	 * los numeros primos (�al azar?) para ganar velocidad tratando los datos.O
	 * sea, el m�todo hashCode lo que hace es dividir el ArrayList en bloques
	 * bas�ndose en un algoritmo usando un n�mero primo.
	 * 
	 * http://ericlippert.com/2011/02/28/guidelines-and-rules-for-gethashcode/
	 * https://community.oracle.com/thread/2045690
	 */
	@Override
	public int hashCode() {
		/*
		 * el n�mero primo que usa el m�todo hashCode se declara como constante,
		 * es un m�todo predefinido en Java
		 */
		final int primo = 31;
		int resultado = 1;
		/*
		 * lo que sigue es el m�todo hashCode en si, lo he sobrescrito a�adiendo
		 * los atributos que nos interesan para hacer la comparaci�n
		 */
		resultado = primo * resultado
				+ ((autor == null) ? 0 : autor.hashCode());
		/*
		 * el operador ternario act�a como un if, la condici�n que se ha de
		 * satisfacer va a la izquierda de la interrogaci�n, en caso de que se
		 * eval�e a true se ejecutar�a la primera parte de sentencias,
		 * inmediatamente despu�s , y en caso de que fuera false se ejecutar�an
		 * las operaciones despu�s de los dos puntos.
		 */
		resultado = primo * resultado
				+ ((titulo == null) ? 0 : titulo.hashCode());
		return resultado;
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object objetoAcomparar) {
		/*
		 * El m�todo equals se hereda de Object, no se puede usar en contexto
		 * est�tico(no se puede invocar desde el main como m�todo en si) y sirve
		 * para comprobar si el objeto de clase Almac�n que hemos pasado como
		 * par�metro al m�todo es el mismo que otro que tenemos guardado en el
		 * ArrayList de la instancia de objeto que en este momento se desea
		 * comparar.
		 */

		/* si los dos objetos son los mismos(autoreferencia this) devuelve true */
		if (this == objetoAcomparar)
			return true;

		/*
		 * si el objeto pasado como par�metro esta sin inicializar, vac�o,
		 * retorna false
		 */
		if (objetoAcomparar == null)
			return false;
		/*
		 * si el objeto pasado como par�metro es distinto de una instancia de
		 * otro objeto de la clase Almac�n que deseamos compara, retorna false
		 */
		if (!(objetoAcomparar instanceof Almacen))
			return false;
		/*
		 * Aqu� ya va la comparaci�n en si una vez descartados los posibles
		 * casos de errores que pudiesen producir la diferencia de clases(lo tengo en una
		 * de las clases de prueba que hice, con un bloque try catch). No hay
		 * mucho que decir, el c�digo es muy expl�cito.
		 */
		Almacen objeto = (Almacen) objetoAcomparar;
		if (autor == null) {
			if (objeto.autor != null)
				return false;
		} else if (!autor.equals(objeto.autor))
			return false;
		if (titulo == null) {
			if (objeto.titulo != null)
				return false;
		} else if (!titulo.equals(objeto.titulo))
			return false;
		return true;
	}

	/*
	 * (sin Javadoc)
	 * 
	 * @see java.lang.Object#toString() Devuelve informaci�n del objeto.
	 * Sobrescribe el m�todo toString de Object. Lo interesante que aparece es
	 * que al invocar toString(), como en el equals() hemos decidido comparar
	 * solo dos de los tres atributos privados que tiene la clase,el tercero,
	 * formato, no lleva la autoreferencia this.
	 */
	@Override
	public String toString() {

		return "T�tulo: " + this.titulo + "\nAutor: " + this.autor
				+ "\nFormato: " + formato + "\n";
	}
}

