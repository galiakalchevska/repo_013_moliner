package concesionario;

import java.util.*;

public class Concesionario {

	private ArrayList<Coche> coches ;
	private String nomConcesionario;
	private String 	direcConcesionario;
		

	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public void setCoches(ArrayList<Coche> coches) {
		this.coches = coches;
	}

	public String getNomConcesionario() {
		return nomConcesionario;
	}

	public void setNomConcesionario(String nomConcesionario) {
		this.nomConcesionario = nomConcesionario;
	}

	public String getDirecConcesionario() {
		return direcConcesionario;
	}

	public void setDirecConcesionario(String direcConcesionario) {
		this.direcConcesionario = direcConcesionario;
	}	
}

