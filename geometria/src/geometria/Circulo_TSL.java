package geometria;

public class Circulo_TSL extends FiguraGeometrica_TSL {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_TSL(double r, String tipoFigura) {
		super(tipoFigura);
		if(r<0) {
			r=r*-1;
		}
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
