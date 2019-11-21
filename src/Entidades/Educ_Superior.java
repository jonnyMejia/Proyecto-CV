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
public class Educ_Superior {
    String educ_sup_id;
    String inst_id;
    String grado_id;
    String esduc_sup_ciclo;
    String pais_id;
    Date f_ini;
    Date f_fin;
    Date anios;
    String espec_id;
    String orden_merito;

    public String getEduc_sup_id() {
        return educ_sup_id;
    }

    public void setEduc_sup_id(String educ_sup_id) {
        this.educ_sup_id = educ_sup_id;
    }

    public String getInst_id() {
        return inst_id;
    }

    public void setInst_id(String inst_id) {
        this.inst_id = inst_id;
    }

    public String getGrado_id() {
        return grado_id;
    }

    public void setGrado_id(String grado_id) {
        this.grado_id = grado_id;
    }

    public String getEsduc_sup_ciclo() {
        return esduc_sup_ciclo;
    }

    public void setEsduc_sup_ciclo(String esduc_sup_ciclo) {
        this.esduc_sup_ciclo = esduc_sup_ciclo;
    }

    public String getPais_id() {
        return pais_id;
    }

    public void setPais_id(String pais_id) {
        this.pais_id = pais_id;
    }

    public Date getF_ini() {
        return f_ini;
    }

    public void setF_ini(Date f_ini) {
        this.f_ini = f_ini;
    }

    public Date getF_fin() {
        return f_fin;
    }

    public void setF_fin(Date f_fin) {
        this.f_fin = f_fin;
    }

    public Date getAnios() {
        return anios;
    }

    public void setAnios(Date anios) {
        this.anios = anios;
    }

    public String getEspec_id() {
        return espec_id;
    }

    public void setEspec_id(String espec_id) {
        this.espec_id = espec_id;
    }

    public String getOrden_merito() {
        return orden_merito;
    }

    public void setOrden_merito(String orden_merito) {
        this.orden_merito = orden_merito;
    }
    
    
}
