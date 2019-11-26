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
public class Pensiones {
    int pensiones_id;
    String nombre;

    
    public Pensiones(int pensiones_id, String nombre) {
		super();
		this.pensiones_id = pensiones_id;
		this.nombre = nombre;
	}

	public int getPensiones_id() {
        return pensiones_id;
    }

    public void setPensiones_id(int pensiones_id) {
        this.pensiones_id = pensiones_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nimbre) {
        this.nombre = nimbre;
    }
    
    
}
