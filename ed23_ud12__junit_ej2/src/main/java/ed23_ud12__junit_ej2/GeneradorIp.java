package ed23_ud12__junit_ej2;

import java.util.Random;

public class GeneradorIp {

	protected String ip="";
	
	public int generarNumero(int min, int max) {
		Random rnd = new Random();
	return rnd.nextInt(max);
		
	}
	
	public String generarIp() {
		for (int i = 0; i < 3; i++) {
			if (i==0 ) {
			ip+= generarNumero(1, 255);
			}else if (i==3) {
				ip+= "."+generarNumero(1, 255);
			}
			ip+="."+generarNumero(0, 255);
		}
		
		return ip;
	}
	
}
