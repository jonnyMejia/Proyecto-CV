package EXECUTE;

import java.util.List;

import Controller.SQLPais;
import Entidades.Pais;

public class appCV {
	public static void main(String[] args) {
		SQLPais paisjdbc = new SQLPais();
		paisjdbc.queryInsert(new Pais("1", "Peru"));
		paisjdbc.queryInsert(new Pais("2", "Chile"));
		paisjdbc.queryInsert(new Pais("3", "Argentina"));
		paisjdbc.queryDelete("3");
		paisjdbc.queryUpdate(new Pais("1", "NuevoPeru"));
		List<Pais> lista=paisjdbc.querySelect();
		System.out.println("mostrando Result");
		lista.forEach(e->System.out.println(String.format("%1$3S -> %2$S", e.getPais_id(),e.getNombre())));
		
	}
}
