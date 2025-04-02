package desafioFinal.models.usuarios;

public class Funcionario extends Usuario {
    private String cargo;
    private double salario;

    public Funcionario(String nomeUsuario, String senhaUsuario, String cargo, double salario) {
        super(nomeUsuario, senhaUsuario);
        this.cargo = cargo;
        this.salario = salario;
    }
}
