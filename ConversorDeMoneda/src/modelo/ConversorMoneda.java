package modelo;

public class ConversorMoneda {
	
	private double valor;
	
	public double aDolar(double pesos) {
		double dolar = 0;
		
		dolar = pesos * 0.0059;
		
		return dolar;
	}
		
	public double aEuro(double pesos) {
		double euro = 0;
		
		euro = pesos * 0.0056;
		
		return euro;
	}
	
	public double aLibrasEsterlinas(double pesos) {
		double libra = 0;
		
		libra = pesos * 0.0048;
		
		return libra;
	}
	
	public double aYenJapones(double pesos) {
		double yen = 0;
		
		yen = pesos * 0.80;
		
		return yen;
	}
	
	public double aWonSul_Coreano(double pesos) {
		double won = 0;
		
		won = pesos * 7.79;
		
		return won;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
