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
    int inst_id;
    String rama;
    String nombre;
    int nivel;
    public int getEst_ext_id() {
        return est_ext_id;
    }

    public void setEst_ext_id(int est_ext_id) {
        this.est_ext_id = est_ext_id;
    }

    public int getInst_id() {
        return inst_id;
    }

    public void setInst_id(int inst_id) {
        this.inst_id = inst_id;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
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

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }
    
    
}
