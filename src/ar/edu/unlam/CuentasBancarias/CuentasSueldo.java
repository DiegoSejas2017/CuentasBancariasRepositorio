package ar.edu.unlam.CuentasBancarias;

public class CuentasSueldo {	

	protected Double Saldo;
	
	public void depositarSaldo(Double Monto){
		this.Saldo = Monto;
	}
	
	public Double obtenerSaldo(){
		return this.Saldo;
	}
	
	public void extraerSaldo(Double Monto){
		if (this.Saldo >= Monto){
			this.Saldo = this.Saldo - Monto;
		}	
		else{
			throw new RuntimeException();
		}
	}
}
