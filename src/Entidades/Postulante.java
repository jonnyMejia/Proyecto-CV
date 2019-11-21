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
public class Postulante {
    int postu_id;
    String nombre;
    String ap_pat;
    String ap_mat;
    Date edad;
    Date fNac;
    String pais_id;
    String genero;
    String estado_id;
    String email;
    String pensiones_id;

    public Postulante() {
    }

    public Postulante(int postu_id, String nombre, String ap_pat, String ap_mat, Date edad, Date fNac, String pais_id, String genero, String estado_id, String email, String pensiones_id) {
        this.postu_id = postu_id;
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

    public int getPostu_id() {
        return postu_id;
    }

    public void setPostu_id(int postu_id) {
        this.postu_id = postu_id;
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

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setfNac(Date fNac) {
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
        return "Postulante{" + "postu_id=" + postu_id + ", nombre=" + nombre + ", ap_pat=" + ap_pat + ", ap_mat=" + ap_mat + ", edad=" + edad + ", fNac=" + fNac + ", pais_id=" + pais_id + ", genero=" + genero + ", estado_id=" + estado_id + ", email=" + email + ", pensiones_id=" + pensiones_id + '}';
    }
    
    
}
