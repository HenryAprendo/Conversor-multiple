package com.alura.conversor;

public class Monedas extends Conversor {
	
	public double calcular(double valor, double tazaDeCambio) {
		return valor * tazaDeCambio;
	}
	
	@Override	
	public void hacerConversion(String opcion, double valor) {
		
		double resultado = 0;
		double cambio = 0;
		switch (opcion) {

			case "De Pesos a Dolar": {
				cambio = 0.00026;
				resultado = this.calcular(valor, cambio);				
				super.mostrarMensaje("Tienes $" + resultado + " dolares");
				break;
			}
			case "De Pesos a Euros": {
				cambio = 0.00024;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " euros");
				break;
			}
			case "De Pesos a Libras": {
				cambio = 0.00020;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " libras");
				break;
			}
			case "De Pesos a Yen": {
				cambio = 0.033;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " yen");
				break;
			}
			case "De Pesos a Won coreano": {
				cambio = 0.32;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " won coreano");
				break;
			}
			case "De Dolar a Pesos": {
				cambio = 3922.50;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De Euros a Pesos": {
				cambio = 4209.69;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De libras a Pesos": {
				cambio = 4953.76;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De Yen a Pesos": {
				cambio = 30.85;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
			case "De Won coreano a Pesos": {
				cambio = 3.12;
				resultado = this.calcular(valor, cambio);
				super.mostrarMensaje("Tienes $" + resultado + " pesos");
				break;
			}
		}
		
	
	}

}
