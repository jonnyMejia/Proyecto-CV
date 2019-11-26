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
public class Especialidad {
    int espec_id;
    String nombre;

    public Especialidad(int espec_id, String nimbre) {
		super();
		this.espec_id = espec_id;
		this.nombre = nimbre;
	}

	public int getEspec_id() {
        return espec_id;
    }

    public void setEspec_id(int espec_id) {
        this.espec_id = espec_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nimbre) {
        this.nombre = nimbre;
    }
    
    
}
