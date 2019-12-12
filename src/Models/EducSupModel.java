/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Controller.SQLIntitucion;
import Entidades.Educ_Superior;
import Entidades.Institucion;
import Controller.SQLGrado_Espec;
import Entidades.Grado_Espec;
import Controller.SQLPais;
import Entidades.Pais;
import Controller.SQLEspecialidad;
import Entidades.Especialidad;


public class EducSupModel extends AbstractTableModel{
	List<Educ_Superior> data;
	Object[] colNames = {"Institucion", "Grado", "Especialidad", "Fecha Inicio","Fecha Fin","Pais"};
	/**
	 * @param estudianteApp
	 */
	EducSupModel (List<Educ_Superior> data, Object[] colNames) {
		this.data = data;
		this.colNames = colNames;
	}

	@Override
	public int getColumnCount() {
		return colNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return (String)colNames[columnIndex];
	}

	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Educ_Superior e = data.get(rowIndex);
		SQLIntitucion inst= new SQLIntitucion();
		Institucion tempInst=inst.querySelectOne(e.getInst_id());
		SQLGrado_Espec g= new SQLGrado_Espec();
		Grado_Espec tempGrad=g.querySelectOne(e.getGrado_id());
		SQLPais p= new SQLPais();
		Pais tempP=p.querySelectOne(e.getPais_id());
                SQLEspecialidad esp= new SQLEspecialidad();
		Especialidad tempEsp=esp.querySelectOne(e.getEspec_id());
		switch (columnIndex) {
		case 0:
			return tempInst.getNombre();
		case 1:
			return tempGrad.getNombre();
		case 2:
			return tempEsp.getNombre();
		case 3:
			return e.getF_ini();
                case 4: 
                        return e.getF_fin();
                case 5:
			return tempP.getNombre();
                default: 
                          return null;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Educ_Superior e = data.get(rowIndex);
	}
}
