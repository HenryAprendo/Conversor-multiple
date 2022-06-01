package com.alura.conversor;

public class Monedas extends Conversor {
	
	@Override	
	public void hacerConversion(String opcion, double valor) {
		
		double resultado = 0;
		switch (opcion) {

			case "De Pesos a Dolar": {
				resultado = 0.00026 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "dolares");
				break;
			}
			case "De Pesos a Euros": {
				resultado = 0.00024 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "euros");
				break;
			}
			case "De Pesos a Libras": {
				resultado = 0.00020 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "libras");
				break;
			}
			case "De Pesos a Yen": {
				resultado = 0.033 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "yen");
				break;
			}
			case "De Pesos a Won coreano": {
				resultado = 0.32 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "won coreano");
				break;
			}
			case "De Dolar a Pesos": {
				resultado = 3922.50 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "pesos");
				break;
			}
			case "De Euros a Pesos": {
				resultado = 4209.69 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "pesos");
				break;
			}
			case "De libras a Pesos": {
				resultado = 4953.76 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "pesos");
				break;
			}
			case "De Yen a Pesos": {
				resultado = 30.85 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "pesos");
				break;
			}
			case "De Won coreano a Pesos": {
				resultado = 3.12 * valor;
				super.mostrarMensaje("Tienes $" + resultado + "pesos");
				break;
			}
		}
		
	
	}

}
