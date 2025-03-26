import java.util.ArrayList;
import java.util.List;

// Classe Transacao
class Transacao {
    private String descricao;
    private double valor;
    private TipoTransacao tipo;

    // Enum para definir se é Receita ou Despesa
    public enum TipoTransacao {
        RECEITA, DESPESA
    }

    // Construtor
    public Transacao(String descricao, double valor, TipoTransacao tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public void exibirTransacao(){
        System.out.printf("Descrição: %s",descricao );
        System.out.printf("Valor: %2f",valor );
        System.out.printf("Tipo: %s",tipo );




    }
}
