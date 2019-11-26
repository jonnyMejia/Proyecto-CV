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
public class Departamento {
    int depto_id;
    String nombre;

    public Departamento(int depto_id, String nombre) {
		super();
		this.depto_id = depto_id;
		this.nombre = nombre;
	}

	public int getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(int depto_id) {
        this.depto_id = depto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
