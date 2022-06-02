package com.alura.conversor;

import javax.swing.JOptionPane;

public class IndexPoint {

	
	//PARA HOY 2 DE JUNIO CREAR OTRA CLASE QUE REUNA LOS MENSAJES Y OPCIONES DE CADA TIPO DE CONVERSION.
	//ADEMAS, GENERAR UN METODO CALCULAR GENERAL PARA CLASE MONEDAS Y METER TAZAS DE CAMBIO EN CONSTANTES.
	
	public static void main(String[] args) {
		
		String opcion1 = "Conversor de monedas";
		String opcion2 = "Conversor de temperatura";
		String[] opciones = { opcion1, opcion2 };

		String[] posiblesMonedas = { "De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won coreano", "De Dolar a Pesos", "De Euros a Pesos", "De libras a Pesos", "De Yen a Pesos",
				"De Won coreano a Pesos" };

		String[] posiblesMedidas = { "De grados Centigrados a Fahrenheit", "De grados Centigrados a Kelvin",
				"De grados Centigrados a Rankine", "De grados Fahrenheit a Centigrados",
				"De grados kelvin a centigrados", "De de grados Rankine a Centigrados" };

		// Permite seguir o detener el programa cuando se cambia a false;
		boolean seguir = true;

		while (seguir) {

			Conversor conversor = null;
			String seleccion = null;
			
			//menu de opciones secundario
			String mensaje = null;
			String tipo = null;
			String[] posibilidades = null;
			String titulo = null;
						
			try {
				// ventana de opciones de conversión
				seleccion = Conversor.seleccionarItem("Seleccione una opción de conversión", "Menu",
						JOptionPane.DEFAULT_OPTION, opciones);
				
				if (seleccion.equals(opcion1)) {
					conversor = new Monedas();
					mensaje = "Ingresa la cantidad de dinero que deseas convertir";
					tipo = "Elije la moneda a la que deseas convertir tu dinero";
					titulo = "Monedas";
					posibilidades = posiblesMonedas;
				} 
				if (seleccion.equals(opcion2)) {
					conversor = new Temperatura();
					mensaje = "Ingresa el valor de la temperatura que deseas convertir";
					tipo = "Elije la medida a la que deseas convertir la temperatura";
					titulo = "Temperatura";
					posibilidades = posiblesMedidas;
				}

				double valor = 0;
				boolean esValido = false;
				String entrada = conversor.solicitarDato(mensaje);

				if (entrada.isBlank()) {
					conversor.mostrarMensaje("Valor no valido");
				} else if (!entrada.matches(".*[0-9].*")) {
					conversor.mostrarMensaje("Valor no valido");
				} else {
					try {
						valor = Double.parseDouble(entrada);
						esValido = true;
					} catch (NumberFormatException e) {
						conversor.mostrarMensaje("No es posible combinar caracteres del tipo letras y números");
						e.printStackTrace();
					}
				}

				if (esValido) {
					// Opciones de cambio
					String opcionSeleccionada = conversor.seleccionarTipoCambio(tipo, titulo,
							JOptionPane.DEFAULT_OPTION, posibilidades);
					conversor.hacerConversion(opcionSeleccionada, valor);
				}

				// Continuar o finalizar programa
				int confirmar = conversor.continuarFinalizar("¿Desea continuar?", "Select an Option",
						JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(!Conversor.validar(confirmar)) {
					conversor.mostrarMensaje("Programa terminado");
					seguir = false;
				}
				
			}catch (NullPointerException e) {
				System.out.println("Entro en catch");
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Se ha cancelado la operación");
				int terminar = Conversor.continuarFinalizar();
				seguir = Conversor.validar(terminar);

			}

		} 

	}
}
