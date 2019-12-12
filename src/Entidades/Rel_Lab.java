package Entidades;

public class Rel_Lab {
    int rel_lab_id;
    String descripcion;
	public Rel_Lab(int rel_lab_id, String descripcion) {
		super();
		this.rel_lab_id = rel_lab_id;
		this.descripcion = descripcion;
	}
	public int getRel_lab_id() {
		return rel_lab_id;
	}
	public void setRel_lab_id(int rel_lab_id) {
		this.rel_lab_id = rel_lab_id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
