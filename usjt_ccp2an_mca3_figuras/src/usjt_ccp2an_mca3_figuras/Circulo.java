package usjt_ccp2an_mca3_figuras;

public class Circulo extends Figura{
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}
}
