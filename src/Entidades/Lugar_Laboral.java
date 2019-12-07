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
public class Lugar_Laboral {
    int lug_id;
    String nombre;
    

    public Lugar_Laboral(int lug_id, String nombre) {
		super();
		this.lug_id = lug_id;
		this.nombre = nombre;
	}


	public int getLug_id() {
		return lug_id;
	}


	public void setLug_id(int lug_id) {
		this.lug_id = lug_id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
