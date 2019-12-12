package Models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Controller.SQLNivel;
import Entidades.Estudio_Extra;
import Entidades.Nivel;



public class Otros_est_Model extends AbstractTableModel{
	List<Estudio_Extra> data;
	Object[] colNames = {"Nombre", "Institucion", "Nivel"};
	/**
	 * @param estudianteApp
	 */
	Otros_est_Model (List<Estudio_Extra> data, Object[] colNames) {
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
		Estudio_Extra e = data.get(rowIndex);
		SQLNivel niv= new SQLNivel();
		Nivel temp=niv.querySelectOne(e.getNivel_id());
		
		switch (columnIndex) {
		case 0:
			return e.getNombre();
		case 1:
			return e.getNom_institucion();
		case 2:
			return temp.getNivel();

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
		Estudio_Extra e = data.get(rowIndex);
	}
}
