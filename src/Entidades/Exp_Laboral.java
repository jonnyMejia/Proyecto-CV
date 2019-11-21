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
public class Exp_Laboral {
    String exp_lab_id;
    String emp_nom;
    String nom_puesto;
    Date f_ini;
    Date f_fin;
    String srea_id;
    String cargo_id;
    String motivo_id;

    public String getExp_lab_id() {
        return exp_lab_id;
    }

    public void setExp_lab_id(String exp_lab_id) {
        this.exp_lab_id = exp_lab_id;
    }

    public String getEmp_nom() {
        return emp_nom;
    }

    public void setEmp_nom(String emp_nom) {
        this.emp_nom = emp_nom;
    }

    public String getNom_puesto() {
        return nom_puesto;
    }

    public void setNom_puesto(String nom_puesto) {
        this.nom_puesto = nom_puesto;
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

    public String getSrea_id() {
        return srea_id;
    }

    public void setSrea_id(String srea_id) {
        this.srea_id = srea_id;
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
    
    
}
