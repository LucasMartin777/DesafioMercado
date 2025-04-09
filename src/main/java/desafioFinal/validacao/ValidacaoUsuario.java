package desafioFinal.validacao;

import desafioFinal.models.usuarios.Cliente;
import desafioFinal.models.usuarios.Funcionario;

import java.util.List;
import java.util.Scanner;


public class ValidacaoUsuario {

    public static int validadoCliente(List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                ╔═══════════════════════════════════════╗
                ║        VALIDAÇÃO DE CLIENTE          ║
                ╚═══════════════════════════════════════╝
                → Nome do usuário: """);
        String dado = scanner.nextLine();
        System.out.print("→ Senha do usuário: ");
        String dado1 = scanner.nextLine();


        Boolean encontrou = false;
        for (Cliente cliente : clientes) {


            if (cliente.getNomeUsuario().equals(dado) && cliente.getSenhaUsuario().equals(dado1)) {

                encontrou = true;
                System.out.println("Acesso Liberado");

                return clientes.indexOf(cliente); // estou pegando o indice do cliente para saber de qual cliente estou me referenciando

            }
        }
        if (encontrou) {
            System.out.println("Bem vindo");
        } else {
            System.out.println("Usuario ou senha invalido");
        }
        return -2;
    }

    public static int validadoFuncionario(List<Funcionario> funcionarios) {
        System.out.println("Informe o nome do usuario:");
        Scanner scanner = new Scanner(System.in);
        String dado = scanner.nextLine();
        System.out.println("Informe a senha do usuario:");
        String dado1 = scanner.nextLine();

        Boolean encontrou = false;
        for (Funcionario funcionario : funcionarios) {


            if (funcionario.getNomeUsuario().equals(dado) && funcionario.getSenhaUsuario().equals(dado1)) {

                encontrou = true;
                System.out.println("Acesso Liberado");

                return funcionarios.indexOf(funcionario); // estou pegando o indice do cliente para saber de qual cliente estou me referenciando

            }
        }
        if (encontrou) {
            System.out.println("Bem vindo");
        } else {
            System.out.println("Usuario ou senha invalido");
        }
        return -2;
    }


}
