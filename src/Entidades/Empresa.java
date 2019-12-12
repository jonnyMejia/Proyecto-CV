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
public class Empresa {
    String emp_nom;
    int sector_id;
    int depto_id;
    String rubro;
    String telf;

    public String getEmo_nom() {
        return emp_nom;
    }

    public void setEmo_nom(String emo_nom) {
        this.emp_nom = emo_nom;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public int getDepto_id() {
        return depto_id;
    }

    public void setDepto_id(int depto_id) {
        this.depto_id = depto_id;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    
}
