package Tema_3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


class CalculadoraPrueba {
	
	private Calculadora calcu;
	
	@BeforeEach
	public void creaCalculadora () {
		calcu = new Calculadora (20, 10);
	}
	
	@AfterEach
	public void borraCalculadora () {
		calcu = null;
	}
	
	@Test
	public void testSuma() {
		double valorEsperado = 30;
		double valorCalculado = calcu.suma();
		assertEquals(valorEsperado, valorCalculado);
	}
	
	@Test
	public void testResta() {
		double valorCalculado = calcu.resta();
		assertTrue(valorCalculado == 10);
		assertFalse(valorCalculado != 10);
	}
	
	@ParameterizedTest
	@CsvFileSource (resources = {"Prueba.csv"}, delimiter = ',' )
	public void testMultiplicacion	(int a, int b, int valorEsperado) {
		Calculadora calcu = new Calculadora (a, b);
		int resultado = calcu.multiplicacion();
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}
	
}
