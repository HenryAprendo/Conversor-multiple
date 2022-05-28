package com.alura.conversor;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String opcion1 =  "Conversor de monedas";
		String opcion2 =  "Conversor de temperatura";
		
		String mensaje1 = "Ingresa la cantidad de dinero que deseas convertir";
		String mensaje2 = "Ingresa el valor de la temperatura que deseas convertir";
		String entrada;

		//Menu
		Object[] opciones = { opcion1, opcion2 };
		String itemSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una opci�n de conversi�n", "Menu", 
				JOptionPane.DEFAULT_OPTION,  null, opciones,
				opciones[0]);
	
		System.out.println(itemSeleccionado);
		
		//Input
		double valor = 0;
		if (itemSeleccionado.equals(opcion1)) {
			entrada = JOptionPane.showInputDialog(mensaje1);
			valor = Double.parseDouble(entrada);
			System.out.println(valor);
		}
		
		if (itemSeleccionado.equals(opcion2)) {
			entrada = JOptionPane.showInputDialog(mensaje2);
			valor = Double.parseDouble(entrada);
			System.out.println(valor);
		}
		
		//Lista de monedas
		Object[] posiblesMonedas = {"De Pesos a Dolar","De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
		"De Pesos a Won coreano", "De Dolar a Pesos", "De Euros a Pesos", "De libras a Pesos", "De Yen a Pesos", "De Won coreano a Pesos"};
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero"
				+ "", "Monedas", JOptionPane.DEFAULT_OPTION,  null, posiblesMonedas, posiblesMonedas[0]);
		
		double resultado = 0;
		switch(opcionSeleccionada) {
					
			case "De Pesos a Dolar": {
				System.out.println("Convierte a dolar");
				resultado = 0.00026 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado+ "dolares");
				break;
			}
			case "De Pesos a Euros": {
				System.out.println("Convierte a euro");
				resultado = 0.00024 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "euros");
				break;
			}
			case "De Pesos a Libras": {
				System.out.println("De Pesos a Libras");
				resultado = 0.00020 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "libras");
				break;
			}
			case "De Pesos a Yen": {
				System.out.println("De Pesos a Yen");
				resultado = 0.033 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "yen");
				break;
			}
			case "De Pesos a Won coreano": {
				System.out.println("De Pesos a Won coreano");
				resultado = 0.32 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "won coreano");
				break;
			}
			case "De Dolar a Pesos": {
				System.out.println("De Dolar a Pesos");
				resultado = 3922.50 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "pesos");
				break;
			}
			case "De Euros a Pesos": {
				System.out.println("De Euros a Pesos");
				resultado = 4209.69 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "pesos");
				break;
			}
			case "De libras a Pesos": {
				System.out.println("De libras a Pesos");
				resultado = 4953.76 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "pesos");
				break;
			}
			case "De Yen a Pesos": {
				System.out.println("De Yen a Pesos");
				resultado = 30.85 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "pesos");
				break;
			}
			case "De Won coreano a Pesos": {
				System.out.println("De Won coreano a Pesos");
				resultado = 3.12 * valor;
				JOptionPane.showMessageDialog(null, "Tienes $" + resultado + "pesos");
				break;
			}
					
		}

	}

}

















