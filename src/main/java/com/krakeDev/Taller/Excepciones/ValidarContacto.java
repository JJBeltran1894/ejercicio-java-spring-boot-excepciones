package com.krakeDev.Taller.Excepciones;

public class ValidarContacto {
	
	public static void validarTelefono(String telefono) throws IllegalArgumentException {
		if(telefono.length()!=10 || telefono == null) {
			throw new IllegalArgumentException("El telefono no tiene el numero correcto de caracteres (10)");
		}
	}
	
}
