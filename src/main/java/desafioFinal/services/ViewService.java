package desafioFinal.services;

import desafioFinal.mensagens.Mensagens;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.view.ViewCliente;
import desafioFinal.view.ViewFuncionario;

import java.util.List;
import java.util.Scanner;

public class ViewService {
    static List<Cliente> clientes = DadosClientes.getClientes();


    public static void runApp() {
        Scanner op = new Scanner(System.in);
        Mensagens.tipoDeUsuario();
        int op1 = op.nextInt();
        if (op1 == 1) {
            ViewCliente viewCliente = new ViewCliente();
            viewCliente.runViewClient(clientes);
        }
        if (op1 == 2) {
            ViewFuncionario.runViewFuncionario();
        }
    }
}

