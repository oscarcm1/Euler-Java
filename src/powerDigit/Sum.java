package powerDigit;

import java.math.BigInteger;

public class Sum {
	
	
	private int base;
	private int exp;
	private BigInteger  res;
	

	public Sum(int base , int exp) {
		this.base = base;
		this.exp = exp;
	}

	
	public BigInteger getRes() {
		 res = BigInteger.valueOf(base).pow(exp);
		 System.out.println("Cadena = " + res);
		return res;
	}
	
	
	public void SumCad() {
		String cadena = res.toString();
		int total = 0;
		for (int i = 0; i < cadena.length(); i++) {
			total += Character.getNumericValue(cadena.charAt(i));
			//System.out.println(total);
		}
		System.out.println("Suma = " + total);
	}
	
	
}

