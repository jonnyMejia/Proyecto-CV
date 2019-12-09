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
    String fam_nom;
<<<<<<< HEAD
    int fam_id; //PUEDE SER UN DNI
=======
    String fam_ape;
>>>>>>> bc9763a87c818154f8380e3baffbdc63d3dd2906
    int tipo_id;
    String telf;
    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fam_id;
		result = prime * result + ((fam_nom == null) ? 0 : fam_nom.hashCode());
		result = prime * result + ((telf == null) ? 0 : telf.hashCode());
		result = prime * result + tipo_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Familiar other = (Familiar) obj;
		if (fam_id != other.fam_id)
			return false;
		if (fam_nom == null) {
			if (other.fam_nom != null)
				return false;
		} else if (!fam_nom.equals(other.fam_nom))
			return false;
		if (telf == null) {
			if (other.telf != null)
				return false;
		} else if (!telf.equals(other.telf))
			return false;
		if (tipo_id != other.tipo_id)
			return false;
		return true;
	}

<<<<<<< HEAD
	public int getFam_id() {
=======
    public String getFam_ape() {
        return fam_ape;
    }

    public void setFam_ape(String fam_ape) {
        this.fam_ape = fam_ape;
    }

    public int getFam_id() {
>>>>>>> bc9763a87c818154f8380e3baffbdc63d3dd2906
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
