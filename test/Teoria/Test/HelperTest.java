package Teoria.Test;

import Programacion.Ejercicio.Ejercicios.Teoria.Test.Helper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    void calcularValorMedio() {
        assertEquals(2, Helper.calcularValorMedio(2, 2));
        assertEquals(0, Helper.calcularValorMedio(-2, 2));
        assertEquals(-2, Helper.calcularValorMedio(-2, -2));
        assertEquals(2.5, Helper.calcularValorMedio(2, 3));
    }
        @Test
    void calcularRaizCuadrada() {
            assertEquals(2, Helper.calcularRaizCuadrada(4));
            assertEquals((float)Math.sqrt(3), Helper.calcularRaizCuadrada(3));

        }

    @Test
    void devolver2cuadrados() {
        assertNotNull(Helper.devolver2cuadrados(1, 2));
        assertArrayEquals(new int[]{1, 4}, Helper.devolver2cuadrados(1, 2));
    }

    @Test
    void devolverMayor() {
        assertEquals(3, Helper.devolverMayor(3, 1));
        assertEquals(3, Helper.devolverMayor(1, 3));
        assertEquals(3, Helper.devolverMayor(3, 3));
        assertEquals(0, Helper.devolverMayor(0, -3));
        assertEquals(3, Helper.devolverMayor(3, -3));
    }

    @Test
    void devolverMenor() {
        assertEquals(-3, Helper.devolverMenor(3, -3));
    }

    @Test
    void esPrimo() {
        assertEquals(true, Helper.esPrimo(1));
    }

    @Test
    void esDivisible1entre2() {
        assertTrue(Helper.esDivisible1entre2(6, 3));
        assertFalse(Helper.esDivisible1entre2(3, 6));
    }
}