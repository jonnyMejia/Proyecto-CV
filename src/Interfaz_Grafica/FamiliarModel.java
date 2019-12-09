package Interfaz_Grafica;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Entidades.Familiar;

public class FamiliarModel extends AbstractTableModel{

	List<Estudiante> data;
	Object[] colNames = {"Codigo", "Apellido", "Nombre", "Promedio"};
	/**
	 * @param estudianteApp
	 */
	FamiliarModel(List<Familiar> data, Object[] colNames) {
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
		Estudiante e = data.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return e.getCodigo();
		case 1:
			return e.getApellido();
		case 2:
			return e.getNombre();
		case 3:
			return e.getPromedio();
		default:
			return null;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 0)
			return false;
		return true;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Estudiante e = data.get(rowIndex);
		switch (columnIndex) {
		case 1:
			e.setApellido((String)aValue);
			break;
		case 2:
			e.setNombre((String)aValue);
			break;
		case 3:
			e.setPromedio(Double.parseDouble((String)aValue));
			break;
		default:
			break;
		}
	}
}
