package com.krakeDev.Taller.Excepciones;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LeerContacto {
	private static final Logger log = LogManager.getLogger(LeerContacto.class);
	
	public static void leer() {
		FileReader lector = null;
		BufferedReader buffer = null;
		
		try {
			//lector = new FileReader("fantasma.txt");
			lector = new FileReader("contactos.txt");
			buffer = new BufferedReader(lector);
			
			for(String linea  = buffer.readLine(); linea !=null; linea = buffer.readLine()) {
				System.out.println(linea);
			}
			 log.info("El Archivo ha sido leido exitosamente");
			
		}catch (FileNotFoundException e){
			log.error("Error: No se encontro el archivo especificado", e);
		}catch (IOException e) {
			log.error("Error: Problema de Input/Output al leer el archivo:", e);
		}finally {
			try {
				if(buffer !=null) {
					buffer.close();
				}
				if(lector !=null) {
					lector.close();
				}
			}catch(IOException e) {
				log.error("Error al intentar cerrar la lectura del archivo",e);
			}
		}
	}
}
