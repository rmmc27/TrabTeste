package org.example;

// Classe que contém os métodos utilitários
public class EstacionamentoUtils {

    // Método 1: Calcular o valor total com base no tempo (horas) e valor por hora
    public static double calcularValorTotal(double valorPorHora, int horas) {
        return valorPorHora * horas;
    }

    // Método 2: Verificar vagas disponíveis
    public static int vagasDisponiveis(int totalVagas, int vagasOcupadas) {
        return totalVagas - vagasOcupadas;
    }

    // Método 3: Controlar tempo restante da estadia
    public static double tempoRestante(double horasPermitidas, double horasUsadas) {
        return Math.max(horasPermitidas - horasUsadas, 0); // Garante que o tempo restante não seja negativo
    }

    // Método 4: Registrar pagamentos e atualizar parcelas
    public static double atualizarParcelas(double valorTotal, double valorPago) {
        return Math.max(valorTotal - valorPago, 0); // Calcula o saldo restante
    }
}
