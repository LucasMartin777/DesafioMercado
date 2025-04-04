package desafioFinal.models.usuarios;

public class Funcionario extends Usuario {
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nomeUsuario, String senhaUsuario, String cargo, double salario) {
        super(nomeUsuario, senhaUsuario);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", Nome de Usuário='" + getNomeUsuario() + '\'' +
                ", Senha de Usuário='" + getSenhaUsuario() + '\'' +
                "}\n";
    }

}
