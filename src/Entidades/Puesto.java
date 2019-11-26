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
public class Puesto {
    int puesto_id;
    String nombre;
    
    public Puesto(int puesto_id, String nombre) {
		super();
		this.puesto_id = puesto_id;
		this.nombre = nombre;
	}

	public int getPuest_id() {
        return puesto_id;
    }

    public void setPuest_id(int puest_id) {
        this.puesto_id = puest_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
