package concesionario;

/**
 * @author PUÑETEIRA
 * @version 2.0
 */
public class Coche {

	private String matricula;
	private String marca;
	private String modelo;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + "]";
	}
}
