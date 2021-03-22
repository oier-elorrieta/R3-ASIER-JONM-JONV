package Modelo;

public class kontsultak {

	static final String selectProdiktuenizena="SELECT NomProd,PrecioVentaProd FROM productos WHERE IDProducto= ";
	
	static final String selectProduktuKantitatea = "SELECT count(NomProd) from productos";
	
	static final String selectProdukturenprezioa = "SELECT PrecioVentaProd FROM productos WHERE NomProd=";
	
	static final String selectUsuario = "SELECT * from usuarios WHERE Usuario=";
	
	static final String selectUsuarioNif = "SELECT NIF from usuarios WHERE Usuario=";
	
	static final String selectTipoLocal = "SELECT TipoDeNegocio FROM local WHERE NIF= ";
	
	static final String selectMaxID ="SELECT max(IDOperaciones) FROM operaciones";
	
	static final String selectIDproducto ="SELECT IDProducto FROM productos WHERE NomProd= ";
	
	static final String selectIDaparecen ="SELECT IDProducto FROM aparecen WHERE IDProducto= ";

	// *****************************************************************************************************************************************************************************************************

	static final String insertDatuak = "INSERT INTO usuarios VALUES";
	
	static final String insertOperaciones = "INSERT INTO operaciones(PrecioTotalOp,NIF,tipo) VALUES";

	static final String insertPedido = "INSERT INTO pedido(ID,DomicilioSioNo,DirDomicilio) values";
	
	static final String insertAparecen = "INSERT INTO aparecen VALUES";
	
	// *****************************************************************************************************************************************************************************************************
	static final String updateaparecen = "UPDATE aparecen SET NumUniPorProd=";
}