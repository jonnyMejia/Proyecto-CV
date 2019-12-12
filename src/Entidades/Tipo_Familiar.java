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
public class Tipo_Familiar {
    int tipo_id;
    String nombre;
    
    public Tipo_Familiar( String nombre) {
		super();
		this.nombre = nombre;
	}

    public int getTipo_id() {
        return tipo_id;
    }


    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
