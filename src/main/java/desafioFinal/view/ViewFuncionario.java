package desafioFinal.view;

import desafioFinal.constant.MensagensFuncionario;
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
                int op4 = scanner.nextInt();

                if (op4 == 1) {
                    FuncionarioServices.alterandoAlimento();
                }
                if (op4 == 2) {
                    FuncionarioServices.alterandoEletrodomestico();
                }
                if (op4 == 0) {
                    break;
                }
            }
            while (op1 == 3) {
                MensagensFuncionario.tipoDeListaProduto();
                int op3 = scanner.nextInt();
                if (op3 == 1) {
                    FuncionarioServices.removendoAlimento();
                }
                if (op3 == 2) {
                    FuncionarioServices.removendoEletrodomestico();
                }
                if (op3 == 0) {
                    break;

                }
            }
        }
    }
}
