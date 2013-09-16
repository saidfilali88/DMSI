/*
 * Asignatura: DMSI
 * Curso: 2013/2014
 * Autor: Said Filali Yachou
 */
import static org.junit.Assert.*;
import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class SumaTest.
 */
public class SumaTest {

	/**
	 * Suma positivos.
	 */
	@Test
	public void sumaPositivos() {
		System.out.println("Sumando dos n�meros positivos ...");
		Suma S = new Suma(2, 3);
		assertTrue(S.sumar() == 5);
	}

	/**
	 * Suma negativos.
	 */
	@Test
	public void sumaNegativos() {
		System.out.println("Sumando dos n�meros negativos ...");
		Suma S = new Suma(-2, -3);
		assertTrue(S.sumar() == -5);
	}

	/**
	 * Suma positivo negativo.
	 */
	@Test
	public void sumaPositivoNegativo() {
		System.out.println("Sumando un n�mero positivo y un n�mero negativo ...");
		Suma S = new Suma(2, -3);
		assertTrue(S.sumar() == -1);
	}
} 
