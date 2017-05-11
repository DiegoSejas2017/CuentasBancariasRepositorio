package ar.edu.unlam.CuentasBancarias.test;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.CuentasBancarias.CajaDeAhorro;
import ar.edu.unlam.CuentasBancarias.CuentaCorriente;
import ar.edu.unlam.CuentasBancarias.CuentasSueldo;

public class TestCuentasBancarias {
@Test 
	public void TesCuentaSueldo(){
		CuentasSueldo Cuenta = new CuentasSueldo();
		Cuenta.depositarSaldo(4000.0);
		
		Double Saldo = Cuenta.obtenerSaldo();
		
		Cuenta.extraerSaldo(500.0);
		
		Saldo = Cuenta.obtenerSaldo();
		
		Double valorObtenido = Saldo;
		Double valorEsperado = 3500.0;
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

@Test 
	public void TestCajaDeAhorro(){
		CajaDeAhorro Caja = new CajaDeAhorro();
		Caja.depositarSaldo(4000.0);
		
		Double Saldo = Caja.obtenerSaldo();
		
		Caja.extraerSaldoCuenta(100.0);
		Caja.extraerSaldoCuenta(100.0);
		Caja.extraerSaldoCuenta(100.0);
		Caja.extraerSaldoCuenta(100.0);
		Caja.extraerSaldoCuenta(100.0);
		Caja.extraerSaldoCuenta(100.0);
		
		Saldo = Caja.obtenerSaldo();
		
		Double valorEsperado = 3394.0;
		Double valorObtenido = Saldo;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

@Test 
	public void TestCuentaCorriente(){
		CuentaCorriente Cuenta = new CuentaCorriente();
		Cuenta.depositarSaldo(4000.0);
		
		Double Saldo = Cuenta.obtenerSaldo();
		
		Cuenta.extraerSaldoCC(4100.0);
		
		Saldo = Cuenta.debeAlBanco();
		
		Double valorEsperado = -105.0;
		Double valorObtenido = Saldo;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}



	