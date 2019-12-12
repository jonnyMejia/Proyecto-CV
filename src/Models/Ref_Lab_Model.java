package Models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Controller.SQLIntitucion;
import Entidades.Ref_Laboral;


public class Ref_Lab_Model extends AbstractTableModel{
	List<Ref_Laboral> data;
	Object[] colNames = {"Nombre", "Apellido", "Telefono", "Empresa","Cargo"};
	/**
	 * @param estudianteApp
	 */
	Ref_Lab_Model (List<Ref_Laboral> data, Object[] colNames) {
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
		Ref_Laboral e = data.get(rowIndex);
		
		switch (columnIndex) {
		case 0:
			return e.getNom_ref();
		case 1:
			return e.getApe_ref();
		case 2:
			return e.getTelf_ref();
		case 3:
			return e.getNom_emp_ref();
                case 4: 
                        return e.getCargo_ref();
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
		Ref_Laboral e = data.get(rowIndex);
	}
}