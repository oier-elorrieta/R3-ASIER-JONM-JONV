package TestModelo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Modelo.Metodoak;
import Modelo.Usuario;

public class ModeloTest {

	@Test
	public void Test_irakurriarray() {
		String[] produktizena = new String[5];
		produktizena[0]="coca-cola";
		produktizena[1]="kas";
		produktizena[2]="cafe con leche";
		produktizena[3]="Zumo";
		produktizena[4]="Pintxo tortilla";
		produktizena=Metodoak.irakurriarray();
		String[] espero = new String[5];
		espero[0]="coca-cola";
		espero[1]="kas";
		espero[2]="café con leche";
		espero[3]="Zumo";
		espero[4]="Pintxo tortilla";
		assertArrayEquals(espero,produktizena);
	}
	@Test
	public void Test_daramanprezioaagertzea() {
		ArrayList prezio = new ArrayList<Double>();
		String kanti="1";
		String izena="kas";
		String emaitza=Metodoak.daramanprezioaagertzea(kanti, prezio,izena);
		double espero=1.5;
		double emaitzazbk=Double.parseDouble(emaitza);
		assertEquals(espero,emaitzazbk,0);
	}
	@Test
	public void Test_sartuprezioa() {
		double emaitzaint=1;
		ArrayList prezio = new ArrayList<Double>();
		prezio=Metodoak.sartuprezioa(emaitzaint, prezio);
		ArrayList espero = new ArrayList<Double>();
		espero.add(1.0);
		assertEquals(espero,prezio);
	}
	@Test
	public void Test_emaitzaetxerekin() {
		ArrayList prezio = new ArrayList<Double>();
		prezio.add(2.0);
		String emaitza=Metodoak.emaitzaetxerekin(prezio);
		String espero="2.0";
		assertEquals(espero,emaitza);
	}
	@Test
	public void Test_produktuenarray() {
		ArrayList izena = new ArrayList<String>();
		String prodizena="Esnea";
		izena=Metodoak.produktuenarray(prodizena, izena);
		ArrayList espero = new ArrayList<String>();
		espero.add("Esnea");
		assertEquals(espero,izena);
	}
	@Test
	public void Test_arrayresuemnbueltatu() {
		ArrayList izena = new ArrayList<String>();
		izena.add("Esnea");
		ArrayList prezio = new ArrayList<Double>();
		prezio.add(2.0);
		String resumen=Metodoak.arrayresuemnbueltatu(izena, prezio);
		String espero="<html>Esnea.....................................................................................2.0euro<br><html>";
		assertEquals(espero,resumen);
	}
	@Test
	public void Test_asieratuarrayizena() {
		ArrayList izena = new ArrayList<String>();
		izena.add("Esnea");
		izena.add("Oilaskoa");
		izena.add("Gailetak");
		izena=Metodoak.asieratuarrayizena(izena);
		ArrayList espero = new ArrayList<String>();
		espero.clear();
		assertEquals(espero,izena);
	}
	@Test
	public void Test_asieratuarrayprezio() {
		ArrayList prezio = new ArrayList<Double>();
		prezio.add(1);
		prezio.add(5);
		prezio.add(10);
		prezio=Metodoak.asieratuarrayprezioa(prezio);
		ArrayList espero = new ArrayList<Double>();
		assertEquals(espero,prezio);
}
	@Test
	public void Test_UsuarioaInsertatuTrue() {
		boolean berdina=Metodoak.UsuarioaInsertatu("antonio", "1234", "1234","12345678a");
		boolean espero=true;
		assertEquals(espero,berdina);
	}
	@Test
	public void Test_UsuarioaInsertatuFalse() {
		boolean berdina=Metodoak.UsuarioaInsertatu("aitor", "1234", "12345","12345678a");
		boolean espero=false;
		assertEquals(espero,berdina);
	}
	
	@Test
	public void Test_TipoLocalAtera() {
		Usuario a = new Usuario("12345678b",null);
		String tipolocal=Metodoak.TipoLocalAtera(a);
		String espero="Restaurante";
		assertEquals(espero,tipolocal);
	}
	@Test
	public void Test_TipoLocalAteranif() {
		Usuario a = new Usuario("12345678b",null);
		String tipolocal=Metodoak.TipoLocalAteranif("12345678b",a);
		String espero="Restaurante";
		assertEquals(espero,tipolocal);
	}
	
	@Test
	public void test_kantisartuarrayclear() {
		ArrayList kanti = new ArrayList<Integer>();
		kanti.add(1);
		kanti.add(4);
		kanti.add(6);
		Metodoak.kantisartuarrayclear(kanti);
		ArrayList espero = new ArrayList<Integer>();
		espero.clear();
		assertEquals(espero,kanti);
	}
	@Test
	public void Test_kantisartuarray() {
		int kanti=1;
		ArrayList kantitatea = new ArrayList<Integer>();
		Metodoak.kantisartuarray(kanti, kantitatea);
		ArrayList espero = new ArrayList<Integer>();
		espero.add(1);
		assertEquals(espero,kantitatea);
	}
	@Test
	public void Test_IDproducto() {
		ArrayList array = new ArrayList<Integer>();
		array.add("coca-cola");
		int emaitza=Metodoak.IDproducto(array, 0);
		int espero=1;
		assertEquals(espero,emaitza);
	}
	@Test
	public void Test_idproduktuadago() {
		boolean emaitza=Metodoak.idproduktuadago(2, 1);
		boolean espero=false;
		assertEquals(espero,emaitza);
	}
}