package desafioFinal.services;

import desafioFinal.mensagens.Mensagens;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosFuncionarios;
import desafioFinal.view.ViewCliente;
import desafioFinal.view.ViewFuncionario;

import java.util.Scanner;

public class ViewService {


    public static void runApp() {
        Scanner op = new Scanner(System.in);
        Mensagens.tipoDeUsuario();
        int op1 = op.nextInt();
        if (op1 == 1) {
            ViewCliente.runViewClient(DadosClientes.getClientes());
        }
        if (op1 == 2) {
            ViewFuncionario.runViewFuncionario(DadosFuncionarios.getFuncionarios());
        }
    }
}

