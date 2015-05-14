package parte1;

import java.util.*;

/**
 * @author GALIA. Clase que contiene el método main. Realiza diferentes pruebas
 *         para comprobar el funcionamiento del programa en si.
 * @version 26 de febrero 2015
 */
public class Main {
	public static void main(String[] args) {

		/*
		 * la variable información contendrá el resultado de invocar el método
		 * toString() de la clase padre,Almacén
		 */
		String informacion;

		/* creamos un objeto Libro */
		Libro l1;
		l1 = new Libro();
		informacion = l1.toString();

		/* Imprimimos el resultado */

		System.out
		.println("\tLibro 1.\nConstructor vacio.Imprime 3 veces null,que son los tres atributos que tiene\n"
				+ informacion);

		/* El segundo Libro */
		Libro l2;
		l2 = new Libro();
		l2.setTitulo("Alguien voló sobre el nido del cuco");
		l2.setAutor("Ken Kesey");
		// l2 = new Libro(l2.getTitulo(), l2.getAutor());--funciona
		informacion = l2.toString();

		System.out.println("\tLibro 2.\nConstructor con dos parámetros.\n"
				+ informacion);

		/* El tercer Libro. */
		Libro l3;
		l3 = new Libro("Crónica de una muerte anunciada",
				"Gabriel García Márquez", Formato.AVI, 1234, 100);
		informacion = l3.toString();
		System.out
		.println("\tLibro 3.\nConstructor con todos los parámetros.\n"
				+ informacion);
		/*
		 * El siguiente trozo de código fue necesario antes de hablar contigo,
		 * Javier, sobre como sobreescribir el método toString (hay que hacerlo
		 * en la propia clase, no desde el main,porque no se puede usar en un
		 * contexto estático).No lo borro para recordar.
		 */

		/*
		 * + "Identificador: " + Libro.getIdLibro() + "\nCantidad de copias: " +
		 * Libro.getCantidad_de_copias() + "\n")
		 */

		/* El cuarto Libro.El primero, que estaba vacío lo igualo al cuarto */

		Libro l4 = new Libro("Factotum", "Charles Bukowski", Formato.MP3);
		l1 = l4;

		/* Declaramos un ArrayList de objetos Libro */
		ArrayList<Libro> libros = new ArrayList<Libro>();
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		libros.add(l4);

		System.out.println("\tEl contenido del ArrayList de objetos Libro: \n"
				+ libros.toString());
		/* la longitud del ArrayList */
		System.out.println("Longitud del array de libros: " + libros.size());

		/*
		 * ¿Javier, eso es polimorfismo? O sea, eso que pides de comparar dos
		 * objetos; porque si es así , lo habré hecho bien, si no, no sé porqué
		 * funciona.Si se comporta como tal, lo será,no?
		 */

		/* Polimorfismo.Lo usamos para completar la última parte del ejercicio */

		Almacen objeto1 = new Libro("Factotum", "Charles Bukowski", Formato.MP3);
		Libro objeto2 = new Libro("Factotum", "Charles Bukowski", Formato.MP3);

		if (objeto1.equals(objeto2)) {
			System.out.println("Objetos iguales");
		} else {
			System.out.println("Objetos distintos");
		}

		/*
		 * Tanto el código de arriba, como el de abajo comprueban la
		 * funcionalidad del método equals()
		 */

		Almacen objeto3 = new Libro("Tu pupila azul", "Gustavo Adolfo Bécquer",
				Formato.MIDI);
		Libro objeto4 = new Libro("Suave es la noche", "F. Scott Fitzgerald",
				Formato.MIDI);

		if (objeto3.equals(objeto4)) {
			System.out.println("Objetos iguales");
		} else {
			System.out.println("Objetos distintos");
		}

		/*
		 * añadiré los últimos objetos al ArrayList Libro e mostraré el
		 * resultado final
		 */
		libros.add((Libro) objeto1);
		libros.add((Libro) objeto2);
		libros.add((Libro) objeto3);
		libros.add((Libro) objeto4);
		/*
		 * lo descomentas si quieres, pero funciona,añade e imprime todo,lo que
		 * pasa es que visualiza un montón de información.
		 */
		/*
		 * System.out .println(
		 * "\tEl contenido final del ArrayList de objetos Libro: \nTiene una longitud de: "
		 * + libros.size() + libros.toString());
		 */
	}
}
