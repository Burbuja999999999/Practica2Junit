package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    @Test
    void registroDiaTest() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(1, 1, true));
        assertFalse(diasLluvia.registroDia(32, 1, true)); // Provoca una comprovació de límits fallida
        assertFalse(diasLluvia.registroDia(1, 13, true)); // Provoca una comprovació de límits fallida
    }

    @Test
    void consultarDiaTest() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        assertTrue(diasLluvia.consultarDia(1, 1));
        assertFalse(diasLluvia.consultarDia(2, 1));
    }

    @Test
    void contarDiasLluviososTest() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(1, 2, true);
        assertEquals(2, diasLluvia.contarDiasLluviosos());
    }

}