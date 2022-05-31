package com.alura.conversor;

import javax.swing.JOptionPane;

public class Conversor {
	
	public Conversor() {

	}
	
	// Menu de opciones
	public static String seleccionarItem( String message, String titulo, int display, Object[] lista ) {
		String seleccionarItem = (String) JOptionPane.showInputDialog(null, message, titulo, display, null, lista, lista[0]);
		return seleccionarItem;
	}
	
	//Solicitar dato de entrada
	public String solicitarDato(String message) {
		String entrada = JOptionPane.showInputDialog(message);
		return entrada;
	}
	
	//Escoger opciones de monedas
	public String seleccionarTipoCambio(String message, String titulo, int display, String[] lista) {
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, message, titulo, display,	null, lista, lista[0]);
		return opcionSeleccionada;
	}
	
	
	//Ventana de continuar
	public int continuarFinalizar(String message, String titulo, int display) {
		int confirmar = JOptionPane.showConfirmDialog(null, message, titulo, display);
		return confirmar;
	}
	
	//Ventana de mostrar mensajes
	public void mostrarMensaje(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	
}













