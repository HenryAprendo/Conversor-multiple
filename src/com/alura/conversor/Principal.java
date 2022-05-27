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
		String itemSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", 
				JOptionPane.DEFAULT_OPTION,  null, opciones,
				opciones[0]);
	
		System.out.println(itemSeleccionado);
		
		//Input
		if (itemSeleccionado.equals(opcion1)) {
			entrada = JOptionPane.showInputDialog(mensaje1);
			double valor = Double.parseDouble(entrada);
			System.out.println(valor);
		}
		
		if (itemSeleccionado.equals(opcion2)) {
			entrada = JOptionPane.showInputDialog(mensaje2);
			double valor = Double.parseDouble(entrada);
			System.out.println(valor);
		}
		
		//Lista de monedas
		Object[] posiblesMonedas = {"De Pesos a Dolar","De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
		"De Pesos a Won coreano", "De Dolar a Pesos", "De Euros a Pesos", "De libras a Pesos", "De Yen a Pesos", "De Won coreano a Pesos"};
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero"
				+ "", "Monedas", JOptionPane.DEFAULT_OPTION,  null, posiblesMonedas, posiblesMonedas[0]);
		
		System.out.println(opcionSeleccionada);

	}

}













