package desafioFinal;

import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.validacao.ValidacaoCiente;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Testes {




    public void teste1(){
        int indiceDoCliente;
        DadosClientes criandoDadosCliente = new DadosClientes();// Criando base de dados dos Clientes
        List<Cliente> clientes = criandoDadosCliente.criandoListaCLientes();

        DadosProdutos dadosProdutos = new DadosProdutos();//Criando base de dados dos Produtos
        List<Eletrodomesticos> produtosEletrodomesticos = dadosProdutos.criandodadosProdutosEletrodomesticos();
        List<Alimentos> produtosAlimentos = dadosProdutos.criandodadosProdutosAlimentos();


        ValidacaoCiente validacaoLogin = new ValidacaoCiente();// Validando o Login do usuario
        indiceDoCliente = validacaoLogin.validadoCliente(clientes); // atribuindo o indice

        Collections.sort(dadosProdutos.criandodadosProdutosEletrodomesticos());// Tirando os numeros duplicados
        Collections.sort(dadosProdutos.criandodadosProdutosAlimentos());// Tirando os numeros duplicados
        LinkedHashSet<Eletrodomesticos> listaSemDuplicatasEletrodomesticos = new LinkedHashSet<>(produtosEletrodomesticos);
        LinkedHashSet<Alimentos> listaSemDuplicatasAlimentos = new LinkedHashSet<>(produtosAlimentos);

    }

}






