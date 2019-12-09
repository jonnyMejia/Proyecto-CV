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
public class Familiar {
    int fam_id;  //PUEDE SER UN DNI
    String fam_nom;
    String fam_ape;
    int tipo_id;
    String telf;

    public String getFam_ape() {
        return fam_ape;
    }

    public void setFam_ape(String fam_ape) {
        this.fam_ape = fam_ape;
    }

    public int getFam_id() {
        return fam_id;
    }

    public void setFam_id(int fam_id) {
        this.fam_id = fam_id;
    }

    public String getFam_nom() {
        return fam_nom;
    }

    public void setFam_nom(String fam_nom) {
        this.fam_nom = fam_nom;
    }

    public int getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    
}
