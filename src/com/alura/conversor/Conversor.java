package com.alura.conversor;

import javax.swing.JOptionPane;

public class Conversor {
	
	public Conversor() {

	}
	
	// Menu de opciones
	public static String itemSeleccionado( String message, String titulo, int display, Object[] lista ) {
		String itemSeleccionado = (String) JOptionPane.showInputDialog(null, message, titulo, display, null, lista, lista[0]);
		return itemSeleccionado;
	}
	
	//Solicitar dato de entrada
	public String solicitarDato(String message) {
		String entrada = JOptionPane.showInputDialog(message);
		return entrada;
	}


	
	
	
	
	
	
}













