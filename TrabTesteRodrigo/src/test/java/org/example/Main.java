/ Classe principal para executar os métodos
public class Main {

    public static void main(String[] args) {
        // Testando o Método 1: calcularValorTotal
        double valorPorHora = 5.0;
        int horas = 3;
        double total = EstacionamentoUtils.calcularValorTotal(valorPorHora, horas);
        System.out.println("Total a pagar: R$ " + total); // Saída: Total a pagar: R$ 15.0

        // Testando o Método 2: vagasDisponiveis
        int totalVagas = 50;
        int vagasOcupadas = 35;
        int disponiveis = EstacionamentoUtils.vagasDisponiveis(totalVagas, vagasOcupadas);
        System.out.println("Vagas disponíveis: " + disponiveis); // Saída: Vagas disponíveis: 15

        // Testando o Método 3: tempoRestante
        double horasPermitidas = 5.0;
        double horasUsadas = 3.5;
        double restante = EstacionamentoUtils.tempoRestante(horasPermitidas, horasUsadas);
        System.out.println("Tempo restante: " + restante + " horas"); // Saída: Tempo restante: 1.5 horas

        // Testando o Método 4: atualizarParcelas
        double valorTotal = 120.0;
        double valorPago = 50.0;
        double saldoRestante = EstacionamentoUtils.atualizarParcelas(valorTotal, valorPago);
        System.out.println("Saldo restante: R$ " + saldoRestante); // Saída: Saldo restante: R$ 70.0
    }
}
