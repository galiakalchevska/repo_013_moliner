package paquete1;

import ejemplo1.Alumnado;
import ejemplo1.Lista;

public class GestionarAlumnos {

	private static final int NUM_ALUMNOS = 3;

	public static void main(String[] args) {

		/* Crea una lista de alumnos */

		Lista listaDAW;
		listaDAW = new Lista(NUM_ALUMNOS);

		/* Creo dos alumnos */

		Alumnado alumno1;
		Alumnado alumno2;
		alumno1 = new Alumnado("Pedro", 19);
		alumno2 = new Alumnado("María", 18);

		/* Añadimos los alumnos a la lista */

		listaDAW.añadirAlumnado(alumno1, null);
		listaDAW.añadirAlumnado(alumno2, null);

		/* Obtenemos los valores de los atributos de listaDAW */

		Alumnado[] miLista;
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
	private static void mostrarAlumnos(Alumnado[] miLista, int numero) {
		for (int i1 = 0; i1 < numero; i1++) {
			System.out.println(miLista[i1].getNombre() + " "
					+ miLista[i1].getEdad());

		}
	}

	public static void mostrarAlumnosComprobando(Alumnado[] miLista, int numero) {
		if (miLista != null) {
			GestionarAlumnos.mostrarAlumnos(miLista, numero);
		}
	}
}