package Ejercicios.Cadena.LibreriaCadenas;

import Programacion.Ejercicio.Ejercicios.Cadena.LibreriaCadenas.AuxiliarPalabra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuxiliarPalabraTest {

    @Test
    void obtenerNumeroDLetras() {
        assertEquals(-1, AuxiliarPalabra.obtenerNumeroDLetras(null));
        assertEquals(2, AuxiliarPalabra.obtenerNumeroDLetras("do"));
        assertEquals(0, AuxiliarPalabra.obtenerNumeroDLetras(""));
        assertEquals(5, AuxiliarPalabra.obtenerNumeroDLetras("12345"));
    }

    @Test
    void empiezaVocal() {
        assertNull(AuxiliarPalabra.empiezaVocal(null));
        assertTrue(AuxiliarPalabra.empiezaVocal("amigo"),"amigo");
        assertFalse(AuxiliarPalabra.empiezaVocal("juan"),"juan");
        assertTrue(AuxiliarPalabra.empiezaVocal("Emilio"),"Emilio");

    }

    @Test
    void acabaVocal() {
        assertNull(AuxiliarPalabra.empiezaVocal(null));
        assertTrue(AuxiliarPalabra.empiezaVocal("amigo"),"amigo");
        assertFalse(AuxiliarPalabra.empiezaVocal("juan"),"juan");
        assertTrue(AuxiliarPalabra.empiezaVocal("Emilio"),"Emilio");
    }

    @Test
    void contarVocales() {
    }

    @Test
    void contieneLetra() {
    }

    @Test
    void esUnPalimodro() {
    }
}