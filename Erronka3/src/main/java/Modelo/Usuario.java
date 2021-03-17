package Modelo;

public class Usuario {
	
	private String nif;
	private String operaziotipo;

	public String getOperaziotipo() {
		return operaziotipo;
	}

	public void setOperaziotipo(String operaziotipo) {
		this.operaziotipo = operaziotipo;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Usuario(String nif,String opreaziotipo) {
		this.nif = nif;
		this.operaziotipo = operaziotipo;
	}

	
	

}
