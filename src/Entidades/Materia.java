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
public class Materia {
    int materia_id;
    String nombre;
    
    public Materia(int materia_id, String nombre) {
		super();
		this.materia_id = materia_id;
		this.nombre = nombre;
	}

	public int getMat_id() {
        return materia_id;
    }

    public void setMat_id(int materia_id) {
        this.materia_id = materia_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
