package ejemplo1;

/**
 * @author GALIA
 *
 */
public class Lista {
	
	private Alumno[] listaAlumno;
	private int numeroAlumnos;

	/* Constructor */
	
	public Lista(int a) {
		
		listaAlumno = new Alumno[a];
		numeroAlumnos = 0;
	}

	/* Añadir un alumno a la lista */
	
	public void añadirAlumnado(Alumno a, Object nuevoParametro) {
		
		listaAlumno[numeroAlumnos] = a;
		numeroAlumnos++;
	}

	/* Borrar alumno */
	public void borrarAlumno(String a) {
		
		int posicion;
		posicion = buscarAlumno(a);
		for (int i = posicion; i < numeroAlumnos - 1; i++) {
			listaAlumno[i] = listaAlumno[i + 1];
		}
		numeroAlumnos--;
	}

	/* Buscar a un alumno en la lista */

	public int buscarAlumno(String a) {
		int c = -1;
		for (int i = 0; i < numeroAlumnos; i++) {
			if (a.equals(listaAlumno[i].getNombre())) {
				c = i;
				break;
			}
		}
		return c;
	}

	public Alumno[] getListaAlumno() {
		return listaAlumno;
	}

	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}
}
