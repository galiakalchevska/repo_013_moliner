package parte2;

/**
 * @author GALIA. Clase que contiene el método main. Comprueba la segunda parte
 *         de la práctica. La podía extender para validar la entrada de datos
 *         por teclado, pero ya sería liarme demasiado para el tiempo que hay.
 *         Creo que es lo que pides, Javier,en el enunciado, pero si tengo
 *         tiempo la mejoro.
 * @version 20 de febrero 2015
 */
public class Main {
	public static void main(String[] args) {

		/*
		 * la variable información contendrá el resultado de invocar el método
		 * toString() de la clase padre,Almacén
		 */
		String informacion;

		/* Primer objeto */

		Pelicula p1 = new Pelicula("‎Humphrey Bogart", "‎Ingrid Bergman ");
		p1.comprobar(p1.getActor_principal(), p1.getActriz_principal());
		informacion = p1.toString();
		System.out
		.println("\t\nPelícula 1,constructor con actor y actriz\n\t"
				+ "(el resto se heredan de toString definido\n\ten la clase padre):\n"
				+ informacion);

		/* Segundo objeto */

		Pelicula p2 = new Pelicula(null, "‎Ingrid Bergman ");
		p2.comprobar(p2.getActor_principal(), p2.getActriz_principal());
		informacion = p2.toString();
		System.out.println("\t\nPelícula 2,constructor solo con actriz\n\t"
				+ informacion);

		/*
		 * Aquí es donde comprobamos que el código cumple,cuando ambos objetos
		 * son null
		 */
		System.out
		.println("\n\tAmbos protagonistas null. Nos saltará la excepción de nulos\n");
		Pelicula p3 = new Pelicula(null, null);
		p3.comprobar(p3.getActor_principal(), p3.getActriz_principal());
		informacion = p3.toString();
		System.out
		.println("\t\nPelícula 3,constructor con los dos parametros null\n\t"
				+ informacion);
	}
}
