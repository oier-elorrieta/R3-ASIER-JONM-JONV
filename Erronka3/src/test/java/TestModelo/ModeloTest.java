package TestModelo;

import static org.junit.Assert.*;


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
		double[] prezio=new double[10];
		prezio[0]=0;
		prezio[1]=0;
		prezio[2]=0;
		prezio[3]=0;
		prezio[4]=0;
		prezio[5]=0;
		prezio[6]=0;
		prezio[7]=0;
		prezio[8]=0;
		prezio[9]=0;
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
		double[] prezio=new double[10];
		prezio[0]=0;
		prezio[1]=0;
		prezio[2]=0;
		prezio[3]=0;
		prezio[4]=0;
		prezio[5]=0;
		prezio[6]=0;
		prezio[7]=0;
		prezio[8]=0;
		prezio[9]=0;
		prezio=Metodoak.sartuprezioa(emaitzaint, prezio);
		double[] espero=new double[10];
		espero[0]=1;
		espero[1]=0;
		espero[2]=0;
		espero[3]=0;
		espero[4]=0;
		espero[5]=0;
		espero[6]=0;
		espero[7]=0;
		espero[8]=0;
		espero[9]=0;
		assertArrayEquals(espero,prezio,0);
	}
	@Test
	public void Test_emaitzaetxerekin() {
		double[] prezio=new double[10];
		prezio[0]=2;
		prezio[1]=0;
		prezio[2]=0;
		prezio[3]=0;
		prezio[4]=0;
		prezio[5]=0;
		prezio[6]=0;
		prezio[7]=0;
		prezio[8]=0;
		prezio[9]=0;
		
		String emaitza=Metodoak.emaitzaetxerekin(prezio);
		String espero="2.0";
		assertEquals(espero,emaitza);
	}
	@Test
	public void Test_produktuenarray() {
		String[] izena=new String[10];
		String prodizena="Esnea";
		izena=Metodoak.produktuenarray(prodizena, izena);
		String[] espero=new String[10];
		espero[0]="Esnea";
		espero[1]=null;
		espero[2]=null;
		espero[3]=null;
		espero[4]=null;
		espero[5]=null;
		espero[6]=null;
		espero[7]=null;
		espero[8]=null;
		espero[9]=null;
		assertArrayEquals(espero,izena);
	}
	@Test
	public void Test_arrayresuemnbueltatu() {
		String[] izena=new String[10];
		izena[0]="Esnea";
		izena[1]=null;
		izena[2]=null;
		izena[3]=null;
		izena[4]=null;
		izena[5]=null;
		izena[6]=null;
		izena[7]=null;
		izena[8]=null;
		izena[9]=null;
		double[] prezio=new double[10];
		prezio[0]=2.0;
		prezio[1]=0;
		prezio[2]=0;
		prezio[3]=0;
		prezio[4]=0;
		prezio[5]=0;
		prezio[6]=0;
		prezio[7]=0;
		prezio[8]=0;
		prezio[9]=0;
		String resumen=Metodoak.arrayresuemnbueltatu(izena, prezio);
		String espero="<html>Esnea..............................2.0euro<br><html>";
		assertEquals(espero,resumen);
	}
	@Test
	public void Test_asieratuarrayizena() {
		String[] izena=new String[10];
		izena[0]="Esnea";
		izena[1]="Oilaskoa";
		izena[2]="Gailetak";
		izena[3]=null;
		izena[4]=null;
		izena[5]=null;
		izena[6]=null;
		izena[7]=null;
		izena[8]=null;
		izena[9]=null;
		izena=Metodoak.asieratuarrayizena(izena);
		String[] espero=new String[10];
		espero[0]=null;
		espero[1]=null;
		espero[2]=null;
		espero[3]=null;
		espero[4]=null;
		espero[5]=null;
		espero[6]=null;
		espero[7]=null;
		espero[8]=null;
		espero[9]=null;
		assertArrayEquals(espero,izena);
	}
	@Test
	public void Test_asieratuarrayprezio() {
		double[] prezio=new double[10];
		prezio[0]=2;
		prezio[1]=3;
		prezio[2]=4;
		prezio[3]=7;
		prezio[4]=0;
		prezio[5]=0;
		prezio[6]=0;
		prezio[7]=0;
		prezio[8]=0;
		prezio[9]=0;
		prezio=Metodoak.asieratuarrayprezioa(prezio);
		double[] espero=new double[10];
		espero[0]=0;
		espero[1]=0;
		espero[2]=0;
		espero[3]=0;
		espero[4]=0;
		espero[5]=0;
		espero[6]=0;
		espero[7]=0;
		espero[8]=0;
		espero[9]=0;
		assertArrayEquals(espero,prezio,0);
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
		Usuario a = new Usuario("12345678b");
		String tipolocal=Metodoak.TipoLocalAtera(a);
		String espero="Restaurante";
		assertEquals(espero,tipolocal);
	}
	@Test
	public void Test_TipoLocalAteranif() {
		Usuario a = new Usuario("12345678b");
		String tipolocal=Metodoak.TipoLocalAteranif("12345678b",a);
		String espero="Restaurante";
		assertEquals(espero,tipolocal);
	}
	
}