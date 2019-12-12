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
import Entidades.Exp_Laboral;
import Entidades.Area_Laboral;
import Entidades.Motivo;



public class ExpLabModel extends AbstractTableModel{
	List<Exp_Laboral> data;
	Object[] colNames = {"Empresa","Area","Cargo","Fecha Inicio","Fecha Fin","Motivo de cese"};
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
		Motivo tempM=m.querySelectOne(e.getMotivo_id());

		switch (columnIndex) {
		case 0:
			return e.getEmp_nom();
		case 1:
			return a.querySelectOne(e.getSrea_id());
		case 2:
			return e.getCargo_id();
		case 3:
			return e.getF_ini();
                case 4: 
                        return e.getF_fin();
                case 5:
			return tempM.getMotivo();
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
		Exp_Laboral e = data.get(rowIndex);
	}
}
