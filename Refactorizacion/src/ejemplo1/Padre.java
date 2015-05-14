package ejemplo1;

/**
 * @author GALIA
 *
 */
public class Padre {

	private String nombrePadre;
	private String apellidoPadre;
	private Telefono telefonos = new Telefono();

	public void insertarNombreYTelefono(NombreYTelefonoDePadre nombreYtelefono) {

		this.setNombrePadre(nombreYtelefono.getNombre());
		this.getTelefonos().setTelefono(nombreYtelefono.getTelefono());
	}

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public String getApellidoPadre() {
		return apellidoPadre;
	}

	public void setApellidoPadre(String apellidoPadre) {
		this.apellidoPadre = apellidoPadre;
	}

	public Telefono getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Telefono telefonos) {
		this.telefonos = telefonos;
	}
}