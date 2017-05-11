package ar.edu.unlam.CuentasBancarias;

public class CajaDeAhorro extends CuentasSueldo {
	
	private static final Double  CostoExtraccion = 6.00;
	private int contarCantExtracciones = 0;
	
	public void extraerSaldoCuenta(Double Monto){
		if(contarCantExtracciones >= 5){
			Monto = Monto + CostoExtraccion;
			extraerSaldo(Monto);
		}
		else{
			contarCantExtracciones = contarCantExtracciones + 1;
			extraerSaldo(Monto);
		}
	}
}
