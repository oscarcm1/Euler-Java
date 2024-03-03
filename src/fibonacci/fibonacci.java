package fibonacci;

import java.math.BigInteger;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci");
			
		 int longitud = 214748364;
		 int f = 2;
		 
		  BigInteger[] listbonacci = new BigInteger[longitud];
		  listbonacci[0] =  new BigInteger("1");
		  listbonacci[1] =  new BigInteger("1");
		  
		  
		  for (int i = 2; i < listbonacci.length ; i++) {
			  listbonacci[i] = listbonacci[i - 1].add(listbonacci[i - 2]);
			  f++;
			 int cantidadDigitos = String.valueOf( listbonacci[i]).length();

			 if( cantidadDigitos >= 1000) {
				 System.out.println("F' = " + f + " Número Fibonacci = " +  listbonacci[i]);
				 break;
			 }
		}
		  
	}

}
