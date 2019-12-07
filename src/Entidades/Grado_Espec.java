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
public class Grado_Espec {
    int grado_id;
    String nombre;

    
    public Grado_Espec(int grado_id, String nombre) {
		super();
		this.grado_id = grado_id;
		this.nombre = nombre;
	}

	public int getGrado_id() {
        return grado_id;
    }

    public void setGrado_id(int grdo_id) {
        this.grado_id = grdo_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
