package desafioFinal;

import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosClientes;

import java.util.List;

public class Testes {




    public void teste1(){
        DadosClientes criandoDadosCliente = new DadosClientes();// Criando base de dados dos Clientes
        List<Cliente> clientes = criandoDadosCliente.criandoListaCLientes();

    }

}






