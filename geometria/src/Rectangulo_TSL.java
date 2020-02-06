/**
 * 
 * @author Tomás Soler Linares
 *
 */
public class Rectangulo_TSL extends FiguraGeometrica_TSL {
	private double l1;
	private double l2;
	/**
	 * Establece el tipo de figura que es pasándole 2 double de los lados
	 * @param tipoFigura String que contiene el tipo de figura
	 * @param lG Double que contiene la medida del lado 1
	 * @param lPDouble que contiene la medida del lado 2
	 */
	public Rectangulo_TSL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Calcula el área del rectángulo
	 * @return Área del rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Calcula el perímetro del rectángulo
	 * @return Perímetro del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}
	

}
