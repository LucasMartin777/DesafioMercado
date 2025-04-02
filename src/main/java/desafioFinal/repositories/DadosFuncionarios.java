package desafioFinal.repositories;

import desafioFinal.models.usuarios.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class DadosFuncionarios {
    public static List<Funcionario> funcionarios = new ArrayList<>();
    static {

        funcionarios.add(new Funcionario("a", "a", "ADMIN", 666));
        funcionarios.add(new Funcionario("Lucas Silva", "abc", "Estoquista", 2500));
        funcionarios.add(new Funcionario("Maria Oliveira", "def", "Caixa", 2200));
        funcionarios.add(new Funcionario("João Souza", "ghi", "Gerente", 3500));
        funcionarios.add(new Funcionario("Ana Costa", "jkl", "Vendedora", 2000));
        funcionarios.add(new Funcionario("Carlos Pereira", "mno", "Estoquista", 2400));
        funcionarios.add(new Funcionario("Fernanda Lima", "pqr", "Caixa", 2100));

    }
}
