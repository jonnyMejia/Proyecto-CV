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
    int educ_sup_id;
    int inst_id;
    int grado_id;
    int pais_id;
    Date f_ini;
    Date f_fin;
    Date anios;
    int espec_id;

    public int getEduc_sup_id() {
        return educ_sup_id;
    }

    public void setEduc_sup_id(int educ_sup_id) {
        this.educ_sup_id = educ_sup_id;
    }

    public int getInst_id() {
        return inst_id;
    }

    public void setInst_id(int inst_id) {
        this.inst_id = inst_id;
    }

    public int getGrado_id() {
        return grado_id;
    }

    public void setGrado_id(int grado_id) {
        this.grado_id = grado_id;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
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

    public int getEspec_id() {
        return espec_id;
    }

    public void setEspec_id(int espec_id) {
        this.espec_id = espec_id;
    }


    
}
