package desafioFinal.repositories;

import desafioFinal.models.usuarios.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DadosClientes {
    private static List<Cliente> clientes = new ArrayList<>();



    static {


        clientes.add(new Cliente("LucasMartin", "senha123", 2000));
        clientes.add(new Cliente("Mariana Souza", "abc456", 3500));
        clientes.add(new Cliente("Fernando Lima", "pass789", 1500));
        clientes.add(new Cliente("Camila Rocha", "secure987", 4200));
        clientes.add(new Cliente("João Pedro", "mypassword", 2800));
        clientes.add(new Cliente("Ana Beatriz", "senha321", 5000));
        clientes.add(new Cliente("Roberto Carlos", "qwerty12", 1700));
        clientes.add(new Cliente("Juliana Mendes", "juliana2024", 6200));
        clientes.add(new Cliente("Carlos Alberto", "carlospass", 3400));
        clientes.add(new Cliente("Patrícia Oliveira", "patty@123", 2900));
        clientes.add(new Cliente("Ricardo Neves", "ric12345", 3100));
        clientes.add(new Cliente("Vanessa Santos", "vanessa!789", 4100));
        clientes.add(new Cliente("Felipe Moura", "felipepass", 2300));
        clientes.add(new Cliente("Beatriz Castro", "beatriz@987", 5300));
        clientes.add(new Cliente("Gustavo Henrique", "ghpass321", 2600));
        clientes.add(new Cliente("Larissa Almeida", "lariSenha", 4700));
        clientes.add(new Cliente("a", "a", 3800));
        clientes.add(new Cliente("Renata Ferreira", "renatinha12", 5500));
        clientes.add(new Cliente("Daniel Correia", "danielpass", 3000));
        clientes.add(new Cliente("Sabrina Lopes", "sabrin@321", 4000));
        Collections.sort(DadosClientes.clientes);

    }


    public static List<Cliente> getClientes() {
        return clientes;
    }
}
