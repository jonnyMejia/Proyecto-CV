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
public class Estado {
    int estado_id;
    String nombre;    

    public Estado(int estado_id, String nombre) {
		super();
		this.estado_id = estado_id;
		this.nombre = nombre;
	}

	public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estadi_id) {
        this.estado_id = estadi_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
