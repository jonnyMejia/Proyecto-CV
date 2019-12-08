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
public class Area_Laboral {
    int area_id;
    String area_nom;

    public Area_Laboral(int area_id, String area_nom) {
        this.area_id = area_id;
        this.area_nom = area_nom;
    }
    

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getArea_nom() {
        return area_nom;
    }

    public void setArea_nom(String area_nom) {
        this.area_nom = area_nom;
    }

 

    
    
    
}
