package desafioFinal.models.usuarios;

public class Cliente extends Usuario {
    private double valorEmConta;
    private double totalDoCarrinho;

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

