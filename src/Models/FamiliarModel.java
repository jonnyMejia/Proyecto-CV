package Models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Controller.SQLTipoFamiliar;
import Entidades.Familiar;
import Entidades.Tipo_Familiar;

public class FamiliarModel extends AbstractTableModel{
	List<Familiar> data;
	Object[] colNames = {"Nombre", "Apellido", "Relacion", "Telefono"};
	/**
	 * @param estudianteApp
	 */
	public FamiliarModel(List<Familiar> data, Object[] colNames) {
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
		Familiar e = data.get(rowIndex);
		SQLTipoFamiliar tipo= new SQLTipoFamiliar();
		Tipo_Familiar temp=tipo.querySelect_one(e.getTipo_id());
		switch (columnIndex) {
		case 0:
			return e.getNombre();
		case 1:
			return e.getApellido();
		case 2:
			return temp.getNombre();
		case 3:
			return e.getTelefono();
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
		Familiar e = data.get(rowIndex);
	}
}
