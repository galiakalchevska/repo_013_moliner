package concesionario;

/**
 * @author PUÑETEIRA
 * @version 1.0
 */
public class Cliente {

	private String nombre;
	private String apellidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Cliente(String nombre, String apellidos) {
		setNombre(nombre);
		setApellidos(apellidos);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
}
