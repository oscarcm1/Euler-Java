
public class largestProduct extends readFile {

	
	private int longitud;
	private String cadena;
	private long resultado = 1L;
	private long resultado2 = 1L;
	
	public largestProduct(String url , int longitudCadena ) throws Exception {	
		super(url);
		this.longitud = longitudCadena;
		this.cadena = super.getCadena();
	}
	
	
	public void getAnswer() {
		String res = "";
		String res2 = "";
		for (int i = 0; i < cadena.length() - (longitud - 1); i++) {
			
			for (int j = 0; j < longitud; j++) {
        		 res += cadena.charAt(i + j); 
        		 resultado *=  Character.getNumericValue(res.charAt(j));
        		 System.out.println(resultado);
        		 
        		 if(resultado > resultado2) {
        			 resultado2 = resultado;
        			 res2 = res;
        		 }else {
        			 
        		 }
        		 
        	  }
			
		
			 res = "";     
			 resultado = 1L;
			 System.out.println("Cadena = "+ res2 + "Resultado = " + resultado2);
		}
			
	}
	
	
	
}
