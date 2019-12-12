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
public class Postulante {
    String dni_id;
    String nombre;
    String ap_pat;
    String ap_mat;
    String domiciilio;
    int edad;
    String fNac;
    int pais_id;
    String genero;
    int estado_id;
    String email;
    int pensiones_id;
    int lugar_id;
    int area_id;
	public Postulante(String dni_id, String nombre, String ap_pat, String ap_mat, String domiciilio, int edad, String fNac,
			int pais_id, String genero, int estado_id, String email, int pensiones_id, int lugar_id, int area_id) {
		super();
		this.dni_id = dni_id;
		this.nombre = nombre;
		this.ap_pat = ap_pat;
		this.ap_mat = ap_mat;
		this.domiciilio = domiciilio;
		this.edad = edad;
		this.fNac = fNac;
		this.pais_id = pais_id;
		this.genero = genero;
		this.estado_id = estado_id;
		this.email = email;
		this.pensiones_id = pensiones_id;
		this.lugar_id = lugar_id;
		this.area_id = area_id;
	}
	public String getDNI() {
		return dni_id;
	}
	public void setDNI(String dni_id) {
		this.dni_id = dni_id;
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
	public String getDomiciilio() {
		return domiciilio;
	}
	public void setDomiciilio(String domiciilio) {
		this.domiciilio = domiciilio;
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
	public int getPais_id() {
		return pais_id;
	}
	public void setPais_id(int pais_id) {
		this.pais_id = pais_id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(int estado_id) {
		this.estado_id = estado_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPensiones_id() {
		return pensiones_id;
	}
	public void setPensiones_id(int pensiones_id) {
		this.pensiones_id = pensiones_id;
	}
	public int getLugar_id() {
		return lugar_id;
	}
	public void setLugar_id(int lugar_id) {
		this.lugar_id = lugar_id;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	@Override
	public String toString() {
		return "Postulante [dni_id=" + dni_id + ", nombre=" + nombre + ", ap_pat=" + ap_pat + ", ap_mat=" + ap_mat
				+ ", domiciilio=" + domiciilio + ", edad=" + edad + ", fNac=" + fNac + ", pais_id=" + pais_id
				+ ", genero=" + genero + ", estado_id=" + estado_id + ", email=" + email + ", pensiones_id="
				+ pensiones_id + ", lugar_id=" + lugar_id + ", area_id=" + area_id + "]";
	}
    
  
    
}
