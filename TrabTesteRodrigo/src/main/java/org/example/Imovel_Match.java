package org.example;

public class Imovel_Match {

    public double calcularPrecoPorMetroQuadrado(double preco, double area) {
        return preco / area;
    }

    public boolean compararPrecos(double preco1, double preco2) {
        return preco1 < preco2; // Retorna true se o primeiro imóvel é mais barato que o segundo
    }

    // Método para calcular a diferença de preço entre dois imóveis
    public double calcularDiferencaPreco(double preco1, double preco2) {
        return Math.abs(preco1 - preco2);
    }

    // Método para verificar se um imóvel está dentro de um orçamento
    public boolean estaDentroDoOrcamento(double preco, double orcamento) {
        return preco <= orcamento; // Retorna true se o preço do imóvel está dentro do orçamento
    }
}
