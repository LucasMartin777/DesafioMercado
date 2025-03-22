package desafioFinal.validacao;

import desafioFinal.models.usuarios.Cliente;

import java.util.List;
import java.util.Scanner;

public class ValidacaoCiente {

    public int validadoCliente(List<Cliente> clientes){
        System.out.println("Informe o nome do usuario:");
        Scanner scanner = new Scanner(System.in);
        String dado = scanner.nextLine();
        System.out.println("Informe a senha do usuario:");
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


}
