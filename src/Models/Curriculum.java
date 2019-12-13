package Models;

import java.util.ArrayList;

import java.util.List;

import Entidades.CV;
import Entidades.Educ_Superior;
import Entidades.Estudio_Extra;
import Entidades.Familiar;
import Entidades.Postulante;
import Entidades.Ref_Laboral;

public class Curriculum {
	public static List<Familiar> data_familiar= new ArrayList<>();
	public static List<Postulante> data_postulante= new ArrayList<>();
	public static List<Ref_Laboral> data_ref= new ArrayList<>();
	public static List<CV> data_cv= new ArrayList<>();
	public static List<Estudio_Extra> data_extras= new ArrayList<>();
	public static List<Educ_Superior> data_educ= new ArrayList<>();
	public Curriculum() {
		data_familiar= new ArrayList<>();
		data_postulante= new ArrayList<>();
		data_ref= new ArrayList<>();
		data_cv= new ArrayList<>();
		data_extras= new ArrayList<>();
		data_educ= new ArrayList<>();
	}
	public static void initFamiliar() {
		data_familiar= new ArrayList<>();		
	}
	public static void initPostu() {
		// TODO Auto-generated method stub
		data_postulante= new ArrayList<>();

	}
	public static void initRef() {
		// TODO Auto-generated method stub
		data_ref= new ArrayList<>();

	}
	public static void initCv() {
		// TODO Auto-generated method stub
		data_cv= new ArrayList<>();

	}
	public  static void initExtras() {
		data_extras= new ArrayList<>();
		// TODO Auto-generated method stub

	}
	public static void initEduc() {
		// TODO Auto-generated method stub
		data_educ= new ArrayList<>();

	}
}
