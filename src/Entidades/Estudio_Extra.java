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
public class Estudio_Extra {
    int est_ext_id;
    String nombre;
    String nom_institucion;
    int nivel;
    public int getEst_ext_id() {
        return est_ext_id;
    }

    public void setEst_ext_id(int est_ext_id) {
        this.est_ext_id = est_ext_id;
    }

    public String getNom_institucion() {
        return nom_institucion;
    }

    public void setNom_institucion(String nom_institucion) {
        this.nom_institucion = nom_institucion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

   
    
    
}
