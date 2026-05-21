package com.krakeDev.Taller.Excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	
	public static final Logger log = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
		
		System.out.println("--- PRUEBA 1 Telefono Invalido ---");
		ejecutarPrueba("1231");
		
		System.out.println("--- PRUEBA 2 Telefono Valido ---");
		ejecutarPrueba("1234567890");
		
	}
	
	public static void ejecutarPrueba(String telefono) {
		try {
			ValidarContacto.validarTelefono(telefono);
			GuardarContacto.guardar();
			LeerContacto.leer();
			log.info("Proceso finalizado con exito.");
		}catch(IllegalArgumentException e ) {
			log.error("Error: Telefono provisto no es valido", e.getMessage());
		}
	}
	
}
