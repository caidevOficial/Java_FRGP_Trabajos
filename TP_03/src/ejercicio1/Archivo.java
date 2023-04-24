package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	private String ruta;
	
	public Archivo() {	 
	}
	
	public Archivo(String Path) {
		this.ruta = Path; 
	}

	//gets y sets
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	//Metodos
	
	public boolean existe() {
		File archivo = new File(ruta);
		if(archivo.exists())
			return true;
		return false;
		
	}

	public boolean crearArchivo(String ruta) {
		
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void escribe_lineas (String frase) {
		try {
		
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.newLine();
			miBuffer.close();
			entrada.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lee_lineas () {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = "";
			while(linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			entrada.close();
			
		}catch(IOException e) {
			
			System.out.println("No se encontro el archivo");
		}
	}

	
	}
