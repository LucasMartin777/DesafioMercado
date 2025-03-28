package desafioFinal.models.usuarios;

public class Cliente extends Usuario {
    private double valorEmConta;


    public Cliente(String nomeUsuario, String senhaUsuario, double valorEmConta) {
        super(nomeUsuario, senhaUsuario);
        this.valorEmConta = valorEmConta;
    }

    public double getValorEmconta() {
        return valorEmConta;
    }




    @Override
    public String toString() {
        return "Cliente{" +
                "valorEmConta=" + valorEmConta +
                ", Nome de Usuário='" + getNomeUsuario() + '\'' +
                ", Senha de Usuário='" + getSenhaUsuario() + '\'' +
                "}\n";
    }


}

