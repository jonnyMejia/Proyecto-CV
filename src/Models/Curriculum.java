package Models;

import java.util.ArrayList;

import java.util.List;

import Entidades.Familiar;
import Entidades.Postulante;

public class Curriculum {
	public static List<Familiar> data_familiar= new ArrayList<Familiar>();
	public static List<Postulante> data_postulante= new ArrayList<Postulante>();
    
	public Curriculum() {
		data_familiar= new ArrayList<>();
		data_postulante= new ArrayList<>();
	}
	
}
