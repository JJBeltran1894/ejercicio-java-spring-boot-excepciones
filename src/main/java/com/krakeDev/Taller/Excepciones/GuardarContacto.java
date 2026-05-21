package com.krakeDev.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class GuardarContacto {
	public static final Logger log = LogManager.getLogger(GuardarContacto.class);
	public static void guardar() {
		FileWriter escritor = null; //se declara afuera
		try {
			//abrir archivo y escribir
			escritor = new FileWriter("contactos.txt",true);
			escritor.write("Nombre: Maria\n");
			escritor.write("Apellido: Gomez\n");
			escritor.write("Telefono: 0981234567");
			log.info("Ejecutado correctamente");
		}catch(IOException e) {
			log.error("Error al escribir en el archivo: ",e);
		}finally {
			try {
				escritor.close();
			}catch (IOException e){
				log.error("Error al cerrar el archivo: ",e);
			}finally {
				
			}
		}
	}
}
