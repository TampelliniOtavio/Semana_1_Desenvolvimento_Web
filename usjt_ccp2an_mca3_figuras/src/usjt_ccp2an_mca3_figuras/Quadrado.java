package usjt_ccp2an_mca3_figuras;

public class Quadrado extends  Retangulo implements Diagonal{
	public Quadrado(double base) {
		super(base, base);
	}
	@Override
	public double calcularDiagonal() {
		return super.getBase()*Math.sqrt(2);
	}
}