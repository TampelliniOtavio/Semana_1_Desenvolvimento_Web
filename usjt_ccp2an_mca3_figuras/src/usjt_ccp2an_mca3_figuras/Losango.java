package usjt_ccp2an_mca3_figuras;

public class Losango extends Poligono {
	public Losango(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	@Override
	public double area() {
		return super.getAltura() * super.getBase();
	}
}
