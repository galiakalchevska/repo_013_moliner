package ejemplo1;

public class Alumnado {
		
	protected String nombre;
	protected int edad;
	protected Padre padre = new Padre();
	
	/* Constructor */
	
	public Alumnado(String a, int b) {
		nombre = a;
		edad = b;
	}
	
	public Padre getPadre() {
		return padre;
	}

	public void setPadre(Padre padre) {
		this.padre = padre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean puedeIrExcursion (int edadPuede){
		
		boolean puede = false;
		
		if (edad >= edadPuede){
			puede = true;
		}
		return puede;
	}
}