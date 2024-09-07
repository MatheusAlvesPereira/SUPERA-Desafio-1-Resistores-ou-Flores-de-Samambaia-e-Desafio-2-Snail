package org.example.test.DesafioFloresDeSamanbaiaTest;

import org.example.DesafioFloresDeSamambaia.DesafioDeSamanbaia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
class DesafioDeSamanbaiaTest {
    @Test
    public void testFlorSamambaia() {
        // Casos de teste
        assertEquals("MORTO", DesafioDeSamanbaia.tentativaDesenhar(10, 0, 0, 5, 5, 5));
        assertEquals("MORTO", DesafioDeSamanbaia.tentativaDesenhar(10, 0, 0, 5, 7, 7));
        assertEquals("RICO", DesafioDeSamanbaia.tentativaDesenhar(10, 0, 0, 10, 0, 0));
        assertEquals("MORTO", DesafioDeSamanbaia.tentativaDesenhar(5, 0, 0, 10, 0, 0));
        // Adicione mais casos de teste conforme necessário
    }

    @Test
    public void testInputData() {
        String input = "10\n0\n0\n5\n5\n5\n";
        InputStream originalSystemIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            DesafioDeSamanbaia.main(new String[0]);
        } finally {
            System.setIn(originalSystemIn);
        }
    }
}