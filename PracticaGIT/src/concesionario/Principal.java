package concesionario;

/**
 * @author PUÑETEIRA
 * @version 1.0
 */
public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Javier", "García");
		System.out.println(cliente);
		System.out.println();
		Coche coche = new Coche ("1234-ABC","Ford","Fiesta");
		Coche.visualizar();
		System.out.println(coche);
	}
}
