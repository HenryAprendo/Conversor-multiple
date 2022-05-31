package com.alura.conversor;
import javax.swing.JOptionPane;

public class IndexPoint {

	public static void main(String[] args) {
		
		String opcion1 = "Conversor de monedas";
		String opcion2 = "Conversor de temperatura";
		String[] opciones = { opcion1, opcion2 };
		
		String[] posiblesMonedas = { "De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won coreano", "De Dolar a Pesos", "De Euros a Pesos", "De libras a Pesos",
				"De Yen a Pesos", "De Won coreano a Pesos" };
		
		String[] posiblesMedidas = { "De grados Centigrados a Fahrenheit ", "De grados Centigrados a Kelvin", "De grados Centigrados a Rankine", "De grados Fahrenheit a Centigrados",
				"De grados kelvin a centigrados", "De de grados Rankine a Centigrados" };
		
		boolean seguir = true;
		
		while(seguir) {
			//ventana de opciones de conversión
			String seleccion = Conversor.seleccionarItem("Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, opciones);
			System.out.println(seleccion);
			
			
			Conversor conversor = null;
			String mensaje = null;
			String tipoCambio = null;
			String[] posibilidades = null;
			
			if (seleccion.equals(opcion1)) {
				conversor = new Monedas();
				mensaje = "Ingresa la cantidad de dinero que deseas convertir";
				tipoCambio = "Elije la moneda a la que deseas convertir tu dinero";
				posibilidades = posiblesMonedas;
			}
			else if (seleccion.equals(opcion2)){
				conversor = new Temperatura();
				mensaje = "Ingresa el valor de la temperatura que deseas convertir";
				tipoCambio = "Elije la medida a la que deseas convertir la temperatura";
				posibilidades = posiblesMedidas;
			}else {
				System.out.println("Fin del programa");
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
			
			if (esValido) {
				
				//Opciones de cambio
				String opcionSeleccionada = conversor.seleccionarTipoCambio(tipoCambio, "Monedas", JOptionPane.DEFAULT_OPTION, posibilidades);
				System.out.println(opcionSeleccionada);
				
			}
			
			//Continuar o finalizar programa
			int confirmar = conversor.continuarFinalizar("¿Desea continuar?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
					
			if (confirmar != 0) {
				conversor.mostrarMensaje("Programa terminado");
				seguir = false;
			}

		}		
		
		
	}

}




























