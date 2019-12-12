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
    int exp_lab_id;
    String emp_nom;
    String nom_ref;
    String ape_ref;
    String nom_emp_ref;
    String cargo_ref;
    String telf_ref;
    int f_ini;
    int f_fin;

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
    int srea_id;
    int cargo_id;
    int motivo_id;

    public int getExp_lab_id() {
        return exp_lab_id;
    }

    public void setExp_lab_id(int exp_lab_id) {
        this.exp_lab_id = exp_lab_id;
    }

    public String getEmp_nom() {
        return emp_nom;
    }

    public void setEmp_nom(String emp_nom) {
        this.emp_nom = emp_nom;
    }

    public int getF_ini() {
        return f_ini;
    }

    public void setF_ini(int f_ini) {
        this.f_ini = f_ini;
    }

    public int getF_fin() {
        return f_fin;
    }

    public void setF_fin(int f_fin) {
        this.f_fin = f_fin;
    }

    public int getSrea_id() {
        return srea_id;
    }

    public void setSrea_id(int srea_id) {
        this.srea_id = srea_id;
    }

    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int cargo_id) {
        this.cargo_id = cargo_id;
    }

    public int getMotivo_id() {
        return motivo_id;
    }

    public void setMotivo_id(int motivo_id) {
        this.motivo_id = motivo_id;
    }
    
    
}
