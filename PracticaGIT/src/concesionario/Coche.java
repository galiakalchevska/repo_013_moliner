package concesionario;

/**
 * @author PUÑETEIRA
 * @version 2.0
 */
public class Coche {

	private static String matricula;
	private static String marca;
	private static String modelo;

	public static String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		Coche.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}

	public Coche() {
	}

	public Coche(String matricula, String marca, String modelo) {
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
	}

	public static void visualizar() {
		System.out.println("Coche: ");
		System.out.println("Matricula: " + Coche.getMatricula());
		System.out.println("Marca :"+ Coche.getMarca());
		System.out.println("Modelo :"+ Coche.getModelo());
	}

	public static String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		Coche.marca = marca;
	}

	public static String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
}
