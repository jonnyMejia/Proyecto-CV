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
public class Ref_Laboral {
    
    int ref_lab_id;
    String nom_ref;
    String ape_ref;
    String nom_emp_ref;
    String cargo_ref;
    String telf_ref;
    Date A_ini;
    Date A_fin;
    String cargo_id;
    String motivo_id;
    String area_id;

    public int getRef_lab_id() {
        return ref_lab_id;
    }

    public void setRef_lab_id(int ref_lab_id) {
        this.ref_lab_id = ref_lab_id;
    }

    public String getNom_ref() {
        return nom_ref;
    }

    public void setNom_ref(String nom_ref) {
        this.nom_ref = nom_ref;
    }

    public String getApe_ref() {
        return ape_ref;
    }

    public void setApe_ref(String ape_ref) {
        this.ape_ref = ape_ref;
    }

    public String getNom_emp_ref() {
        return nom_emp_ref;
    }

    public void setNom_emp_ref(String nom_emp_ref) {
        this.nom_emp_ref = nom_emp_ref;
    }

    public String getCargo_ref() {
        return cargo_ref;
    }

    public void setCargo_ref(String cargo_ref) {
        this.cargo_ref = cargo_ref;
    }

    public String getTelf_ref() {
        return telf_ref;
    }

    public void setTelf_ref(String telf_ref) {
        this.telf_ref = telf_ref;
    }

    public Date getA_ini() {
        return A_ini;
    }

    public void setA_ini(Date A_ini) {
        this.A_ini = A_ini;
    }

    public Date getA_fin() {
        return A_fin;
    }

    public void setA_fin(Date A_fin) {
        this.A_fin = A_fin;
    }

    public String getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(String cargo_id) {
        this.cargo_id = cargo_id;
    }

    public String getMotivo_id() {
        return motivo_id;
    }

    public void setMotivo_id(String motivo_id) {
        this.motivo_id = motivo_id;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }
    
    

     
}
