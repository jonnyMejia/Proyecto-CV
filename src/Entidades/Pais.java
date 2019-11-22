/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Dani Lucano
 */
public class Pais {
    int pais_id;
    String nombre;
    
    public Pais(String pais_id, String nombre) {
		super();
		this.pais_id = pais_id;
		this.nombre = nombre;
	}

<<<<<<< HEAD
    public int getPais_id() {
=======
	public String getPais_id() {
>>>>>>> 2ebe7571efbc69be9a74e14d3c5c09fb16f6d3ee
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
