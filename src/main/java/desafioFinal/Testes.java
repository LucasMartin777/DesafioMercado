package desafioFinal;

import desafioFinal.mensagens.Mensagens;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.services.ClienteServices;
import desafioFinal.validacao.ValidacaoCiente;

import java.util.*;

public class Testes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mensagens mensagens = new Mensagens();
        int indiceDoCliente;
        int exit = 5;

        DadosClientes criandoDadosCliente = new DadosClientes();// Criando base de dados dos Clientes
        List<Cliente> clientes = criandoDadosCliente.criandoListaCLientes();

        DadosProdutos dadosProdutos = new DadosProdutos();//Criando base de dados dos Produtos
        dadosProdutos.criandodadosProdutosEletrodomesticos();

        ValidacaoCiente validacaoLogin = new ValidacaoCiente();// Validando o Login do usuario
        indiceDoCliente = validacaoLogin.validadoCliente(criandoDadosCliente.criandoListaCLientes()); // atribuindo o indice

        Collections.sort(dadosProdutos.criandodadosProdutosEletrodomesticos());// Tirando os numeros duplicados
        LinkedHashSet<Eletrodomesticos> listaSemDuplicatas = new LinkedHashSet<>(dadosProdutos.criandodadosProdutosEletrodomesticos());
        System.out.println(" Printado lista sem duplicados " + listaSemDuplicatas);

        ClienteServices client = new ClienteServices();//calculo do carrinho


        mensagens.MensagemDeApresentacao();
        int tipoDeUsuario = scanner.nextInt();




    }


}






