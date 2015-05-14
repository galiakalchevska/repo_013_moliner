package parte3;

import java.util.*;
import parte1.Documento;
import parte1.Formato;
import parte1.Musica;

/**
 * @author GALIA Clase Almacén. Parte 3
 *
 */
public class Almacen {

	private Integer id = null;
	private static ArrayList<Libro> libros;
	private static ArrayList<Pelicula> peliculas;
	private static ArrayList<Musica> musicas;
	private static ArrayList<Documento> documentos;
	private static ArrayList<Manual> manuales;
	private static ArrayList<Almacen> almacen;
	private static int objetos_en_el_almacen;

	protected String titulo = null;
	protected String autor = null;
	protected Formato formato = null;

	public Almacen() {
	}

	public Almacen(String titulo, String autor, Formato formato) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
	}

	public Almacen(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public Almacen(int cantidad_maxima) {
		new ArrayList<Almacen>(cantidad_maxima);
	}

	/**
	 * Método boolean para comprobar si está lleno el ArrayList. No se si
	 * funciona,pero no sé porque. Supongo que a parte de hacer algo mal, se
	 * debe a que los ArrayList son dinámicos,pero no lo afirmo. Preguntar a
	 * Javier.
	 * 
	 * @param m
	 * @return Devuelve(teóricamente true si el Almacén está lleno y false en
	 *         caso contrario)
	 */
	public static boolean add(ArrayList<Almacen> m) {
		if (estarLleno(m)) {
			return false;
		} else {
			/*
			 * al tratarse de objetos ArrayList en si,el método add() no nos
			 * sirve,por eso hay que usar addAll().
			 */
			almacen.addAll(m);
			return true;
		}
	}

	/**
	 * @return Los objetos que hay en el almacén
	 */
	public static int size() {
		return objetos_en_el_almacen;
	}

	/**
	 * @param m
	 *            Recibe el ArrayList de objetos que hay en Almacén
	 * @return Retorna true/false dependiendo si está lleno el ArrayList.
	 */
	public static boolean estarLleno(ArrayList<Almacen> m) {
		if (objetos_en_el_almacen == Almacen.size()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param m
	 *            Recibe el ArrayList de objetos que hay en Almacén
	 * @return Retorna la posición que ocupa cada objeto dentro del ArrayList.
	 */
	public static ArrayList<Almacen> indexOf(ArrayList<Almacen> m) {
		return m;
	}

	/* Pruebas.Funcionan.Y sobran,probablemente */

	/**
	 * @return objetos_en_el_almacen
	 */
	public static int getObjetos_en_el_almacen() {
		objetos_en_el_almacen = almacen.size();
		return objetos_en_el_almacen;
	}

	/**
	 * @param objetos_en_el_almacen
	 */
	public static void setObjetos_en_el_almacen(int objetos_en_el_almacen) {
		Almacen.objetos_en_el_almacen = objetos_en_el_almacen;
	}

	/**
	 * @param objetos_en_el_almacen
	 * @return objetos_en_el_almacen
	 */
	public static int devolverStock(int objetos_en_el_almacen) {
		for (Iterator<Almacen> iterator = almacen.iterator(); iterator
				.hasNext();) {
			iterator.next();
			objetos_en_el_almacen = objetos_en_el_almacen + almacen.size();
		}
		return objetos_en_el_almacen;
	}

	/* el resto de los métodos,igual que en la parte 1. No los voy a comentar */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public static ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		Almacen.libros = libros;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		Almacen.peliculas = peliculas;
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<Musica> musicas) {
		Almacen.musicas = musicas;
	}

	public ArrayList<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(ArrayList<Documento> documentos) {
		Almacen.documentos = documentos;
	}

	public ArrayList<Manual> getManuales() {
		return manuales;
	}

	public void setManuales(ArrayList<Manual> manuales) {
		Almacen.manuales = manuales;
	}

	public static ArrayList<Almacen> getAlmacen() {
		return almacen;
	}

	public static void setAlmacen(ArrayList<Almacen> almacen) {
		Almacen.almacen = almacen;
	}

	@Override
	public int hashCode() {

		final int primo = 31;
		int resultado = 1;
		resultado = primo * resultado
				+ ((autor == null) ? 0 : autor.hashCode());
		resultado = primo * resultado
				+ ((titulo == null) ? 0 : titulo.hashCode());
		return resultado;
	}

	@Override
	public boolean equals(Object objetoAcomparar) {
		/* si los dos objetos son los mismos(autoreferencia this) devuelve true */
		if (this == objetoAcomparar)
			return true;
		if (objetoAcomparar == null)
			return false;
		if (!(objetoAcomparar instanceof Almacen))
			return false;
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

	@Override
	public String toString() {
		return "Objetos en el almacen: \n" + Almacen.getObjetos_en_el_almacen()
				+ "\n";
	}
}
