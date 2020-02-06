package geometria;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testArea() {
		Circulo_TSL circulo = new Circulo_TSL(7,"Circulo");
		assertEquals(153.9384,circulo.area(),0.001);
	}
	
	@org.junit.Test
	public void testArea2() {
		Circulo_TSL circulo = new Circulo_TSL(0,"Circulo");
		assertEquals(0,circulo.area(),0.001);
	}
	
	@org.junit.Test
	public void testArea3() {
		Circulo_TSL circulo = new Circulo_TSL(-3,"Circulo");
		assertEquals(28.2744,circulo.area(),0.001);
	}

	@org.junit.Test
	public void testPerimetro() {
		Circulo_TSL circulo = new Circulo_TSL(7,"Circulo");
		assertEquals(43.9824,circulo.perimetro(),0.001);
	}
	
	@org.junit.Test
	public void testPerimetro2() {
		Circulo_TSL circulo = new Circulo_TSL(0,"Circulo");
		assertEquals(0,circulo.perimetro(),0.001);
	}
	
	@org.junit.Test
	public void testPerimetro3() {
		Circulo_TSL circulo = new Circulo_TSL(-3,"Circulo");
		assertEquals(18.8496,circulo.perimetro(),0.001);
	}

	@org.junit.Test
	public void testCirculo_TSL() {
		Circulo_TSL circulo = new Circulo_TSL(7,"Circulo");
		assertEquals("Circulo",circulo.getTipoFigura());
	}
	
	@org.junit.Test
	public void testCirculo_TSL2() {
		Circulo_TSL circulo = new Circulo_TSL(7,"Circulo2");
		assertEquals("Circulo2",circulo.getTipoFigura());
	}
	
	@org.junit.Test
	public void testCirculo_TSL3() {
		Circulo_TSL circulo = new Circulo_TSL(7,"Circulo3");
		assertEquals("Circulo3",circulo.getTipoFigura());
	}

}
