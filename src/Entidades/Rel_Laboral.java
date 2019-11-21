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
public class Rel_Laboral {
    int ref_lab_id;
    int rel_lab_id;
    String nom_ref;
    String nom_emp_ref;
    String cargo_ref;
    String telf_ref;

    public int getRef_lab_id() {
        return ref_lab_id;
    }

    public void setRef_lab_id(int ref_lab_id) {
        this.ref_lab_id = ref_lab_id;
    }

    public int getRel_lab_id() {
        return rel_lab_id;
    }

    public void setRel_lab_id(int rel_lab_id) {
        this.rel_lab_id = rel_lab_id;
    }

    public String getNom_ref() {
        return nom_ref;
    }

    public void setNom_ref(String nom_ref) {
        this.nom_ref = nom_ref;
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
    
    
}
