package paqueteCadena;

import java.security.PublicKey;

public class Cadena {
	public int longitud(String cadena) {
	return	cadena.length();
	}
	
	public int vocales(String cadena) {
	int contador=0;
		for (int i = 0; i < cadena.length() ; i++) {
			if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e'|| cadena.charAt(i)=='i'|| cadena.charAt(i)=='o' || cadena.charAt(i)=='u' ) {
				contador +=1;
			}
		}
		return contador;
	}

	public String invertir(String cadena) {
		String cadenaInversa="";
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			
			cadenaInversa += cadena.charAt(i);
		}
		return cadenaInversa;
	}

	public int contarLetra(String cadena, char caracter) {
		int contador=0;
		
		for (int i = 0; i < cadena.length() ; i++) {
			if (caracter == cadena.charAt(i)) {
				contador +=1;
			}
		}
		return contador;
	}
		
}
	

