package desafioFinal.models.usuarios;

public class Cliente extends Usuario {
    private double valorEmConta;
    private double totalDoCarrinho = 0;

    public Cliente(String nomeUsuario, String senhaUsuario, double valorEmConta) {
        super(nomeUsuario, senhaUsuario);
        this.valorEmConta = valorEmConta;
    }

    public double getValorEmconta() {
        return valorEmConta;
    }

    public void setValorEmconta(double valorEmconta) {
        this.valorEmConta = valorEmconta;
    }

    public double getTotalDoCarrinho() {
        return totalDoCarrinho;

    }

    public void setTotalDoCarrinho(double totalDoCarrinho) {
        this.totalDoCarrinho = totalDoCarrinho;
    }

    public void adicionandoNocarrinho(double adicionar) {
        this.totalDoCarrinho = this.totalDoCarrinho + adicionar;
    }

    public void teste(double adicionando) {
        this.totalDoCarrinho += adicionando;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "valorEmConta=" + valorEmConta +
                ", totalDoCarrinho=" + totalDoCarrinho +
                ", Nome de Usuário='" + getNomeUsuario() + '\'' +
                ", Senha de Usuário='" + getSenhaUsuario() + '\'' +
                "}\n";
    }


}

