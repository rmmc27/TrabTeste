package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Imovel_MatchTest {

    @Test
    public void testeCalcularPrecoPorMetroQuadrado() {
        Imovel_Match imovel = new Imovel_Match();
        double resultado = imovel.calcularPrecoPorMetroQuadrado(200000, 100);
        assertEquals(2000.0, resultado, 0.1);
        
        resultado = imovel.calcularPrecoPorMetroQuadrado(300000, 150);
        assertEquals(2000.0, resultado, 0.1);
    }

    @Test
    public void testeCompararPrecos() {
        Imovel_Match imovel = new Imovel_Match();
        assertTrue(imovel.compararPrecos(200000, 300000), "O primeiro imóvel deve ser mais barato que o segundo");
        assertFalse(imovel.compararPrecos(300000, 200000), "O primeiro imóvel não deve ser mais barato que o segundo");
    }

    @Test
    public void testeCalcularDiferencaPreco() {
        Imovel_Match imovel = new Imovel_Match();
        double resultado = imovel.calcularDiferencaPreco(200000, 300000);
        assertEquals(100000.0, resultado, 0.1);

        resultado = imovel.calcularDiferencaPreco(500000, 300000);
        assertEquals(200000.0, resultado, 0.1);
    }

    @Test
    public void testeEstaDentroDoOrcamento() {
        Imovel_Match imovel = new Imovel_Match();
        assertTrue(imovel.estaDentroDoOrcamento(200000, 250000), "O imóvel deve estar dentro do orçamento");
        assertFalse(imovel.estaDentroDoOrcamento(300000, 250000), "O imóvel não deve estar dentro do orçamento");
    }
}
