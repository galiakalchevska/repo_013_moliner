package parte1;

import java.util.*;

/**
 * @author GALIA
 * @version 26 de febrero 2015. Clase que define los objetos Almacén.Guarda
 *          objetos de tipo electrónico.problemas asociados a las relaciones
 *          entre objetos persistentes¿Preguntar a Javier, qué importancia
 *          tienen y qué son los objetos persistentes?¿Y que es Hibernate?
 */

public class Almacen {
	/*
	 * Atributos privados,no pueden ser modificados de fuera de la clase, tan
	 * solo lo harán a través de los métodos de acceso
	 */

	private Integer id = null;
	/*
	 * el porque de este atributo,id Integer,es sobre lo que te voy a preguntar,
	 * Javier,de las clases persistentes y los errores que conlleva
	 */

	/* Los arrays de objetos contenidos en la clase Almacén */

	private static ArrayList<Libro> libros;
	private static ArrayList<Pelicula> peliculas;
	private static ArrayList<Musica> musicas;
	private static ArrayList<Documento> documentos;
	private static ArrayList<Manual> manuales;

	/* Atributos protegidos,los que heredarán las clases hijas */

	protected String titulo = null;
	protected String autor = null;
	protected Formato formato = null;

	/* Constructores */

	/**
	 * Constructor por defecto. Vacío
	 */
	public Almacen() {
	}

	/**
	 * Constructor con tres parámetros
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
	 * Constructor con dos parámetros
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Almacen(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	/* Métodos para acceder a los valores de los atributos(setters y getters) */

	/**
	 * @return Retorna el id del objeto Almacén. Es que estuve leyendo unas
	 *         cosas sobre la herencia entre las clases con objetos persistentes
	 *         y los problemas que creaba eso en el tiempo de ejecución, pero no
	 *         me ha quedado nada claro, tendré que investigar más. El caso es
	 *         que de recalcaba que sería bueno disponer de un identificador
	 *         para que al sobreescribir el método equals() no nos diera
	 *         problema Hibernate(otra cosa que preguntar a Javier,¿qué es?)
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            Recibe por parámetro el id del objeto, de tipo Integer(o sea
	 *            de una clase envolvente, no el tipo primitivo int.) Eso es
	 *            importante luego para el tratamiento de los objetos, no lo sé
	 *            explicar muy bien, pero es por eso.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return Retorna el título de un objeto de la clase Almacén
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            .Establece el valor del atributo título(lo recibe por
	 *            parámetro)
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return Devuelve el autor de un objeto de tipo Almacén
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            Establece el autor del objeto Almacén
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return Retorna el formato de un objeto de la clase Almacén. El formato
	 *         es de tipo Formato(el enumerado que tenemos declarado fuera del
	 *         cuerpo de la clase)
	 */
	public Formato getFormato() {
		return formato;
	}

	/**
	 * @param formato
	 *            Establece el formato del susodicho objeto Almacén.
	 */
	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	/**
	 * @return Retorna el array de libros, eso si, solo la referencia en
	 *         memoria(eso creo), porque al usar ArrayList perdemos la
	 *         información del objeto que tenemos guardada allí. Para acceder a
	 *         los objetos guardados dentro del ArrayList necesitaríamos de un
	 *         parámetro al menos, que es el índice, o sea el lugar que ocupa
	 *         dicho objeto en el ArrayList.Aqui pasa que no puedes usar this
	 *         con los setters y getters de los objetos, hay que hacerlo así.
	 */
	public static ArrayList<Libro> getLibros() {
		return libros;
	}

	/**
	 * @param libros
	 *            . Recibe por parámetro el array de Libro.
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
	 * Void. Recibe por parámetro el ArrayList Película
	 * 
	 * @param peliculas
	 */
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		Almacen.peliculas = peliculas;
	}

	/**
	 * @return. Devuelve la referencia en memoria del ASrrayList Música
	 */
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	/**
	 * @param musicas
	 *            . Void. Recibe por parámetro el ArrayList Música
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
	 *            Recibe como parámetro el ArrayList de Documento
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
	 * Void. Recibe por parámetro el ArrayList Manual
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
	 * ¿Preguntar a Javier que son las clases persistentes y porque generan
	 * problemas con la sobrecarga de los métodos?¿Y que es Hbernate? Luego para
	 * hacer el método me he basado en lo que he leído durante un par de días,
	 * pero eso no quiere decir que me ha quedado claro. Básicamente, lo que he
	 * entendí era que para recorrer grandes colecciones de objetos (Colecciones
	 * no exactamente, serían arrays de objetos), el hashCode lo que hace es
	 * separar el conjunto de datos de objetos en bloques más pequeños, se usan
	 * los numeros primos (¿al azar?) para ganar velocidad tratando los datos.O
	 * sea, el método hashCode lo que hace es dividir el ArrayList en bloques
	 * basándose en un algoritmo usando un número primo.
	 * 
	 * http://ericlippert.com/2011/02/28/guidelines-and-rules-for-gethashcode/
	 * https://community.oracle.com/thread/2045690
	 */
	@Override
	public int hashCode() {
		/*
		 * el número primo que usa el método hashCode se declara como constante,
		 * es un método predefinido en Java
		 */
		final int primo = 31;
		int resultado = 1;
		/*
		 * lo que sigue es el método hashCode en si, lo he sobrescrito añadiendo
		 * los atributos que nos interesan para hacer la comparación
		 */
		resultado = primo * resultado
				+ ((autor == null) ? 0 : autor.hashCode());
		/*
		 * el operador ternario actúa como un if, la condición que se ha de
		 * satisfacer va a la izquierda de la interrogación, en caso de que se
		 * evalúe a true se ejecutaría la primera parte de sentencias,
		 * inmediatamente después , y en caso de que fuera false se ejecutarían
		 * las operaciones después de los dos puntos.
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
		 * El método equals se hereda de Object, no se puede usar en contexto
		 * estático(no se puede invocar desde el main como método en si) y sirve
		 * para comprobar si el objeto de clase Almacén que hemos pasado como
		 * parámetro al método es el mismo que otro que tenemos guardado en el
		 * ArrayList de la instancia de objeto que en este momento se desea
		 * comparar.
		 */

		/* si los dos objetos son los mismos(autoreferencia this) devuelve true */
		if (this == objetoAcomparar)
			return true;

		/*
		 * si el objeto pasado como parámetro esta sin inicializar, vacío,
		 * retorna false
		 */
		if (objetoAcomparar == null)
			return false;
		/*
		 * si el objeto pasado como parámetro es distinto de una instancia de
		 * otro objeto de la clase Almacén que deseamos compara, retorna false
		 */
		if (!(objetoAcomparar instanceof Almacen))
			return false;
		/*
		 * Aquí ya va la comparación en si una vez descartados los posibles
		 * casos de errores que pudiesen producir la diferencia de clases(lo tengo en una
		 * de las clases de prueba que hice, con un bloque try catch). No hay
		 * mucho que decir, el código es muy explícito.
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
	 * @see java.lang.Object#toString() Devuelve información del objeto.
	 * Sobrescribe el método toString de Object. Lo interesante que aparece es
	 * que al invocar toString(), como en el equals() hemos decidido comparar
	 * solo dos de los tres atributos privados que tiene la clase,el tercero,
	 * formato, no lleva la autoreferencia this.
	 */
	@Override
	public String toString() {

		return "Título: " + this.titulo + "\nAutor: " + this.autor
				+ "\nFormato: " + formato + "\n";
	}
}

