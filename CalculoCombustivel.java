
public class CalculoCombustivel {

	public static void main(String[] args) {
		double valorAlcool = 2.49;
		double valorGasolina = 3.79;
		double resultadoCalculo = valorGasolina * 0.7;
		if(resultadoCalculo < valorAlcool) {
			System.out.println("Gasolina é Melhor");
		}
		
		else {
			System.out.println("Alcool é Melhor");
		}
	}
}
