package com.alura.conversor;

import javax.swing.JOptionPane;

public class Conversor {
	
	public Conversor() {

	}
	
	// Menu de opciones
	public static String seleccionarItem( String message, String titulo, int display, String[] lista ) {
		String seleccionarItem = (String) JOptionPane.showInputDialog(null, message, titulo, display, null, lista, lista[0]);
		return seleccionarItem;
	}
	
	//Solicitar dato de entrada
	public String solicitarDato(String message) {
		//String entrada = JOptionPane.showInputDialog(message);
		//return entrada;
		String entrada = JOptionPane.showInputDialog(message);
		if (entrada == null) {
			throw new NullPointerException("Se ha cancelado la operación");
		}
		else {
			return entrada;
		}
	}
	
	//Escoger opciones de conversion
	public String seleccionarTipoCambio(String message, String titulo, int display, String[] lista) {
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, message, titulo, display, null, lista, lista[0]);
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
	
	// Hacer conversion
	public void hacerConversion(String opcion, double valor) {
	//Implementar en clases hijas
	}
	
	//Ventana de terminar programa
	public static int terminarProgramaValorNulo() {
		int confirmar = JOptionPane.showConfirmDialog(null, "¿desea continuar a un nuevo programa?",
				"Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
		return confirmar;
	}

	
}













