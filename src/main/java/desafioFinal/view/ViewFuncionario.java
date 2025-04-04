package desafioFinal.view;

import desafioFinal.mensagens.MensagensFuncionario;
import desafioFinal.models.usuarios.Funcionario;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.services.FuncionarioServices;
import desafioFinal.validacao.ValidacaoUsuario;

import java.util.List;
import java.util.Scanner;

public class ViewFuncionario {
    public static void runViewFuncionario(List<Funcionario> funcionarios) {
        Scanner scanner = new Scanner(System.in);
        int indiceDoFuncionario = ValidacaoUsuario.validadoFuncionario(funcionarios); // atribuindo o indice;
        int exit = 5;

        FuncionarioServices.apresentacao(indiceDoFuncionario);

        while (exit != 0) {

            MensagensFuncionario.opcoesFuncionario();
            int op1 = scanner.nextInt();
            while (op1 == 1) {
                MensagensFuncionario.tipoDeListaProduto();
                int op2 = scanner.nextInt();
                if (op2 == 1) {
                    DadosProdutos.adicionarProdutoAli(FuncionarioServices.adicionandoProdutoAli());
                    System.out.println(DadosProdutos.getAlimentos());
                }
                if (op2 == 2) {
                    DadosProdutos.adicionarProdutoEletro(FuncionarioServices.adicionandoProdutoEle());
                }
                if (op2 == 0) {
                    break;
                }


            }
            while (op1 == 2) {
                MensagensFuncionario.tipoDeListaProduto();
                int op2 = scanner.nextInt();
                System.out.println(DadosProdutos.getAlimentos());
            }

        }


    }
}
