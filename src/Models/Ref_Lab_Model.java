package Models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import Entidades.Ref_Laboral;
import Controller.SQLAreaLaboral;
import Controller.SQLMotivo;    
import Controller.SQLCargo;
import Entidades.Area_Laboral;
import Entidades.Motivo;
import Entidades.Cargo;

public class Ref_Lab_Model extends AbstractTableModel{
	List<Ref_Laboral> data;
	Object[] colNames = {"Nombre", "Apellido", "Telefono", "Empresa","Area","Cargo","Año inicio","Año fin","Motivo de cese"};
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
		SQLAreaLaboral a= new SQLAreaLaboral ();
		Area_Laboral tempArea=a.querySelectOne(e.getSrea_id());
		SQLMotivo m= new SQLMotivo ();
		Motivo tempM=m.querySelectOne(e.getMotivo_id());
		SQLCargo c= new SQLCargo ();
		Cargo tempC=c.querySelectOne(e.getCargo_id());
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
                        return tempArea.getNombre();
                case 5:
                        return tempC.getNombre();
                case 6: 
                        return e.getF_ini();
                case 7:
                       return e.getF_fin();
                case 8:
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
		Ref_Laboral e = data.get(rowIndex);
	}
}