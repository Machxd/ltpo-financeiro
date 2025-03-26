// Classe Principal
public class Main {
    public static void main(String[] args) {
        // Criando o gestor financeiro
        GestorFinanceiro gestor = new GestorFinanceiro();

        // Adicionando receitas e despesas manualmente
        gestor.adicionarTransacao("Salário ", 5000.0 , Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Freelance ", 1200.0 , Transacao.TipoTransacao.RECEITA);
        gestor.adicionarTransacao("Aluguel ", 1500.0 , Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Supermercado ", 600.0 , Transacao.TipoTransacao.DESPESA);
        gestor.adicionarTransacao("Internet ", 100.0 , Transacao.TipoTransacao.DESPESA);

        // Exibir relatório de transações
        gestor.listarTransacoes();

        // Exibir saldo final
        System.out.printf("\nSaldo Final: R$ %.2f\n", gestor.calcularSaldo());
    }
}
