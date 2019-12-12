/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Controller.SQLAreaLaboral;
import Controller.SQLMotivo;       
import Entidades.Empresa;
import Entidades.Exp_Laboral;
import Entidades.Area_Laboral;
import Entidades.Motivo;
import Entidades.Grado_Espec;
import Controller.SQLPais;
import Entidades.Pais;
import Controller.SQLEspecialidad;
import Entidades.Especialidad;


public class ExpLabModel extends AbstractTableModel{
	List<Exp_Laboral> data;
	Object[] colNames = {"Empresa", "Sector", "Rubro","Area","Cargo","Fecha Inicio","Fecha Fin","Motivo de cese"};
	/**
	 * @param estudianteApp
	 */
	ExpLabModel (List<Exp_Laboral> data, Object[] colNames) {
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
		Exp_Laboral e = data.get(rowIndex);
		SQLAreaLaboral a= new SQLAreaLaboral ();
		Area_Laboral tempArea=a.querySelectOne(e.getSrea_id());
		SQLMotivo m= new SQLMotivo ();
		Motivo tempMotivo=m.querySelectOne(e.getMotivo_id());
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
