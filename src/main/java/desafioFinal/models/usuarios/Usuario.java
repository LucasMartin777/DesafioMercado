package desafioFinal.models.usuarios;

public class Usuario implements Comparable<Usuario> {
    private String nomeUsuario;
    private String senhaUsuario;

    public Usuario(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }


    @Override
    public int compareTo(Usuario o) {
        return this.getNomeUsuario().compareTo(o.getNomeUsuario());
    }
}
