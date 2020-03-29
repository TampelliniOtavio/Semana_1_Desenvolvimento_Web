package usjt_ccp2an_mca3_figuras;

public class Triangulo extends Poligono {
	public Triangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	@Override
	public double area() {
		return (super.getBase() * super.getAltura()) / 2;
	}
}
