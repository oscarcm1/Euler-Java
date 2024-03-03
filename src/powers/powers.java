package powers;

import java.math.BigInteger;

public class powers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = 0;
		  BigInteger res = BigInteger.ZERO;
		  
		  for (int i = 1; i <= 1000 ; i++) {
			  n++;
			  res = res.add(BigInteger.valueOf(i).pow(n));
		  }
		    System.out.println("Resultado = " +res);

		    // Convertir el BigInteger a una cadena y obtener los últimos dígitos
	        String cadena = res.toString();
	        int longitud = 10; // Especificar cuántos dígitos 
	        String ultimosDigitos = cadena.substring(Math.max(0, cadena.length() - longitud));
	  
	        System.out.println("Ultimos " + longitud + " digitos del BigIntegger = " + ultimosDigitos);
	}
}
