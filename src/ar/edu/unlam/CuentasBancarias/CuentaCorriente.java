package ar.edu.unlam.CuentasBancarias;

public class CuentaCorriente extends CuentasSueldo{

	private Double  GiroDescubierto = 500.0;
	private static final Double Comision = 0.05;
	
	public void extraerSaldoCC(Double Monto){
		if(this.obtenerSaldo() < Monto){

			if(this.obtenerSaldo() + GiroDescubierto >= Monto){
				
				if(GiroDescubierto >= this.obtenerSaldo() - Monto){
					Double MontoComicion = (Monto - this.obtenerSaldo()) * Comision;					
					GiroDescubierto = GiroDescubierto - (Monto - this.obtenerSaldo() + MontoComicion);																				
					extraerSaldo(this.obtenerSaldo());				
				}
				else
				{
					System.out.println("Saldo y Giro descubierto Insuficiente");
				}
			} 
			else{
				System.out.println("Saldo y Giro descubierto Insuficiente");
			}			
		}
		else{
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public Double debeAlBanco(){
		return this.GiroDescubierto - 500;
	}
}
