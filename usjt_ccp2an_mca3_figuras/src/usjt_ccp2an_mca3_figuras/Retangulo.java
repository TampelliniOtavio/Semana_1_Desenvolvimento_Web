package usjt_ccp2an_mca3_figuras;

public class Retangulo extends Poligono implements Diagonal{
	public Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
	@Override
	public double area() {
		return super.getAltura() * super.getBase();
	}
	
	@Override
	public double calcularDiagonal() {
		return Math.sqrt((Math.pow(super.getBase(), 2) * Math.pow(super.getAltura(), 2)));
	}
}
