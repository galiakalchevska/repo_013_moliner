package parte3;

import java.util.*;
import parte1.Formato;

/**
 * @author GALIA. Clase que contiene el mÃ©todo main.
 * @version 20 de febrero 2015. No logro que me de informaciÃ³n de todos los
 *          objetos, solo imprime el toString() para el primero. Preguntar a
 *          Javier.
 */
public class Main {
	public static void main(String[] args) {

		ArrayList<Almacen> almacen = new ArrayList<Almacen>(3);

		/* Primer objeto, película */

		Pelicula p1;
		p1 = new Pelicula("Humphrey Bogart", "Ingrid Bergman ");
		almacen.add(p1);
		System.out.println("el objeto p1 es: " + p1.getClass());
		int posicion = almacen.indexOf(p1);
		System.out.println("La posición que ocupa es: " + posicion + "\n");

		/* Porque da errores? */
		/*
		 * for (Object objeto : almacén) { System.out.println("Objeto " +
		 * objeto); }
		 */

		/* Segundo objeto, libro */

		Libro l1;
		l1 = new Libro("Tu pupila azul", "Gustavo Adolfo Béquer");
		almacen.add(l1);
		System.out.println("el objeto l1 es: " + l1.getClass());
		posicion = almacen.indexOf(l1);
		System.out.println("La posiciÃ³n que ocupa es: " + posicion + "\n");

		/* Tercer objeto */

		Manual m1;
		m1 = new Manual("Pentesting con Kali", "Chema Alonso", Formato.WAV,
				1000, 1);
		almacen.add(m1);

		System.out.println("el objeto m1 es: " + m1.getClass());

		posicion = almacen.indexOf(m1);
		System.out.println("La posiciÃ³n que ocupa es: " + posicion);

		String info = "Identificador: " + Manual.getIdManual()
				+ "\nCantidad de copias: " + Manual.getCantidad_de_copias()
				+ "\n";
		System.out.println(info + "\n");

		boolean añadir = Almacen.add(almacen);
		System.out.println(añadir);

		Almacen.setAlmacen(almacen);
		System.out.println(Almacen.getAlmacen());

		int objetos_en_el_almacen = Almacen.size();
		Almacen.setObjetos_en_el_almacen(objetos_en_el_almacen);
		System.out.println(Almacen.getObjetos_en_el_almacen());

		System.out.println(Almacen.devolverStock(objetos_en_el_almacen));
		boolean res = Almacen.estarLleno(almacen);
		System.out.println(res);
	}
}
