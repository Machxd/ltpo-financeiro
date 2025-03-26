import java.util.ArrayList;
import java.util.List;

// Classe GestorFinanceiro
class GestorFinanceiro {
    private List<Transacao> transacoes;

    // Construtor
    public GestorFinanceiro() {
        this.transacoes = new ArrayList<>();
    }

    // Método para adicionar uma transação
    public void adicionarTransacao(String descricao, double valor, Transacao.TipoTransacao tipo) {
        Transacao transacao = new Transacao(descricao, valor, tipo);
        transacoes.add(transacao);
    }

    // Método para listar todas as transações
    public void listarTransacoes() {
        System.out.println("\n=== RELATÓRIO DE TRANSAÇÕES ===");
        System.out.printf("%-20s %-10s %-2s\n", "Descrição ", "Tipo ", "Valor ");
        System.out.println("-------------------------------------------");
        for (Transacao t : transacoes) {
            t.exibirTransacao();
        }
    }

    // Método para calcular o saldo final
    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (t.getTipo() == Transacao.TipoTransacao.RECEITA) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}
