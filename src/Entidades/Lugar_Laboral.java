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
public class Lugar_Laboral {
    int lug_id;
    String lug_nom;

    public Lugar_Laboral(int lug_id, String lug_nom) {
        this.lug_id = lug_id;
        this.lug_nom = lug_nom;
    }
    

    public int getLug_id() {
        return lug_id;
    }

    public void setLug_id(int lug_id) {
        this.lug_id = lug_id;
    }

    public String getLug_nom() {
        return lug_nom;
    }

    public void setLug_nom(String lug_nom) {
        this.lug_nom = lug_nom;
    }

 


 
    
}
