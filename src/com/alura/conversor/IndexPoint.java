package com.alura.conversor;
import javax.swing.JOptionPane;

public class IndexPoint {

	public static void main(String[] args) {
		
		String opcion1 = "Conversor de monedas";
		String opcion2 = "Conversor de temperatura";
		Object[] opciones = { opcion1, opcion2 };
	
		String seleccion = Conversor.itemSeleccionado("Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, opciones);
		System.out.println(seleccion);
		
		Conversor conversor = null;
		String mensaje = null;
		
		if (seleccion.equals(opcion1)) {
			conversor = new Monedas();
			mensaje = "Ingresa la cantidad de dinero que deseas convertir";
		}
		if (seleccion.equals(opcion2)){
			conversor = new Temperatura();
			mensaje = "Ingresa el valor de la temperatura que deseas convertir";
		}
		
		double valor = 0;
		boolean esValido = false;
		String entrada = conversor.solicitarDato(mensaje);

		if (entrada.isBlank()) {
			JOptionPane.showMessageDialog(null, "Valor no valido");
		} else if (!entrada.matches(".*[0-9].*")) {
			JOptionPane.showMessageDialog(null, "Valor no valido");
		} else {
			try {
				valor = Double.parseDouble(entrada);
				esValido = true;
			} catch (NumberFormatException e) {
				System.out.println("No es posible combinar caracteres del tipo letras y números");
				e.getMessage();
				e.printStackTrace();
			}
		}

		System.out.println(valor);
		System.out.println(esValido);
		
		
	}

}














