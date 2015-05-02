package concesionario;

/**
 * @author PUÑETEIRA
 * @version 1.0
 */
public class Cliente {

	//Comentario nuevo en clase <<Cliente>>

	private String nombre;
	private String apellidos;
	
	private String idCliente;
	private String nomCliente;
	private String apeCliente;
	
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

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getApeCliente() {
		return apeCliente;
	}

	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}
}
