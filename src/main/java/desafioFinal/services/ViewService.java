package desafioFinal.services;

import desafioFinal.constant.MensagensCliente;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosFuncionarios;
import desafioFinal.view.ViewCliente;
import desafioFinal.view.ViewFuncionario;

import java.util.Objects;
import java.util.Scanner;

public class ViewService {


    public static void runApp() {
        int tentativas = 3;

        Scanner op = new Scanner(System.in);

        while (tentativas > 0) {
            System.out.println("Login do Admin:");
            String login = op.nextLine();
            System.out.println("Senha do Admin: ");

            String senha = op.nextLine();

            if (Objects.equals(login, "a") && Objects.equals(senha, "a")) {
                MensagensCliente.mensagemDeApresentacao();
                int op1 = op.nextInt();
                if (op1 == 1) {
                    ViewCliente.runViewClient(DadosClientes.getClientes());
                }
                if (op1 == 2) {
                    ViewFuncionario.runViewFuncionario(DadosFuncionarios.getFuncionarios());
                }
            }

            System.out.println("Usuario ou senha invalido, tente novamente, voce tem " + tentativas + " tentativas");
            tentativas--;
        }
    }
}

