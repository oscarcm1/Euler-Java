package palindromo;

public class getPalindromo {
	
	private int min;
	private int max;
	private int total = 0;
	
	public getPalindromo(int min , int max) {
		this.min = min;
		this.max = max;
	}
	
	public void palindromo() {
 
       int res = 0;
		for (int i = min; i <= max; i++) {
			for (int j = min; j <= max; j++) {
				res = i*j;
					checkPlindromo(i , j , res);
			}
		}
	}
	

	public void checkPlindromo(int a , int b,  int resTotal) {

		String aux = "";
		String respuesta = "";
		String cadena = String.valueOf(resTotal);

        for (int i = cadena.length() -1 ; i >= 0; i--) {
			aux += cadena.charAt(i);
		}

		if(cadena.equals(aux)) {
			if(resTotal > total) {
				respuesta = Integer.toString(a) + " * " +  Integer.toString(b) + " = " + cadena;
				System.out.println(respuesta);	
				total = resTotal;
			}
		}
		
	}

}










