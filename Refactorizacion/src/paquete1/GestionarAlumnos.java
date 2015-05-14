package paquete1;

import ejemplo1.Alumno;
import ejemplo1.Lista;

public class GestionarAlumnos {

	private static final int NUM_ALUMNOS = 3;

	public static void main(String[] args) {

		/* Crea una lista de alumnos */

		Lista listaDAW;
		listaDAW = new Lista(NUM_ALUMNOS);

		/* Creo dos alumnos */

		Alumno alumno1;
		Alumno alumno2;
		alumno1 = new Alumno("Pedro", 19);
		alumno2 = new Alumno("María", 18);

		/* Añadimos los alumnos a la lista */

		listaDAW.añadirAlumnado(alumno1, null);
		listaDAW.añadirAlumnado(alumno2, null);

		/* Obtenemos los valores de los atributos de listaDAW */

		Alumno[] miLista;
		miLista = listaDAW.getListaAlumno();
		int numero;
		numero = listaDAW.getNumeroAlumnos();

		/* Mostramos los alumnos que hay en la lista */
		// mostrarAlumnos(miLista, numero);

		GestionarAlumnos.mostrarAlumnosComprobando(miLista, numero);
		/* Borramos a Pedro de la lista */

		listaDAW.borrarAlumno("Pedro");
		miLista = listaDAW.getListaAlumno();
		numero = listaDAW.getNumeroAlumnos();

		/* Después del direccionamiento indirecto */
		GestionarAlumnos.mostrarAlumnosComprobando(miLista, numero);
	}

	/**
	 * @param miLista
	 * @param numero
	 */
	private static void mostrarAlumnos(Alumno[] miLista, int numero) {
		for (int i1 = 0; i1 < numero; i1++) {
			System.out.println(miLista[i1].getNombre() + " "
					+ miLista[i1].getEdad());

		}
	}

	public static void mostrarAlumnosComprobando(Alumno[] miLista, int numero) {
		if (miLista != null) {
			GestionarAlumnos.mostrarAlumnos(miLista, numero);
		}
	}
}