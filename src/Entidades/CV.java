/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Dani Lucano
 */
public class CV {
    int cv_id;
    String dni_id;
    int puesto_id;
    String fecha;
	public CV(int cv_id, String dni_id, int puesto_id, String fecha) {
		super();
		this.cv_id = cv_id;
		this.dni_id = dni_id;
		this.puesto_id = puesto_id;
		this.fecha = fecha;
	}
	public int getCv_id() {
		return cv_id;
	}
	public void setCv_id(int cv_id) {
		this.cv_id = cv_id;
	}
	public String getDni_id() {
		return dni_id;
	}
	public void setDni_id(String dni_id) {
		this.dni_id = dni_id;
	}
	public int getPuesto_id() {
		return puesto_id;
	}
	public void setPuesto_id(int puesto_id) {
		this.puesto_id = puesto_id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
}
