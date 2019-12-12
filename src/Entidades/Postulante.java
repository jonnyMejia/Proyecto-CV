/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;
import java.lang.*;

/**
 *
 * @author Dani Lucano
 */
public class Postulante {
	String DNI;
    String nombre;
    String ap_pat;
    String ap_mat;
    int edad;
    String fNac;
    String pais_id;
    String genero;
    String estado_id;
    String email;
    String pensiones_id;
    
	public Postulante(String dNI, String nombre, String ap_pat, String ap_mat, int edad, String fNac, String pais_id,
			String genero, String estado_id, String email, String pensiones_id) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.ap_pat = ap_pat;
		this.ap_mat = ap_mat;
		this.edad = edad;
		this.fNac = fNac;
		this.pais_id = pais_id;
		this.genero = genero;
		this.estado_id = estado_id;
		this.email = email;
		this.pensiones_id = pensiones_id;
	}

	
	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_pat() {
        return ap_pat;
    }

    public void setAp_pat(String ap_pat) {
        this.ap_pat = ap_pat;
    }

    public String getAp_mat() {
        return ap_mat;
    }

    public void setAp_mat(String ap_mat) {
        this.ap_mat = ap_mat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getfNac() {
        return fNac;
    }

    public void setfNac(String fNac) {
        this.fNac = fNac;
    }

    public String getPais_id() {
        return pais_id;
    }

    public void setPais_id(String pais_id) {
        this.pais_id = pais_id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(String estado_id) {
        this.estado_id = estado_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPensiones_id() {
        return pensiones_id;
    }

    public void setPensiones_id(String pensiones_id) {
        this.pensiones_id = pensiones_id;
    }


	@Override
	public String toString() {
		return "Postulante [DNI=" + DNI + ", nombre=" + nombre + ", ap_pat=" + ap_pat + ", ap_mat=" + ap_mat + ", edad="
				+ edad + ", fNac=" + fNac + ", pais_id=" + pais_id + ", genero=" + genero + ", estado_id=" + estado_id
				+ ", email=" + email + ", pensiones_id=" + pensiones_id + "]";
	}

  
    
}
