package desafioFinal.services;

import static desafioFinal.repositories.DadosClientes.clientes;

public class ClienteServices {


    public static void apresentacao(int indiceDoCliente) {
        System.out.println("Bem Vindo " + clientes.get(indiceDoCliente).getNomeUsuario());

    }

}
