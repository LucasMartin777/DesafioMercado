package desafioFinal.models.usuarios;

public class Funcionario extends Usuario {
    private int id;

    public Funcionario(String nomeUsuario, String senhaUsuario,int id) {
        super(nomeUsuario, senhaUsuario);
        this.id = id;
    }
}
