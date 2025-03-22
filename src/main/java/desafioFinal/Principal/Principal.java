package desafioFinal.Principal;

import desafioFinal.bancoDeDados.DadosClientes;
import desafioFinal.bancoDeDados.DadosProdutos;
import desafioFinal.calculos.SeparandoUnicos;
import desafioFinal.mensagens.Mensagens;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.validacao.ValidacaoCiente;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mensagens mensagens = new Mensagens();
        int indiceDoCliente;

        DadosClientes criandoDadosCliente = new DadosClientes();// Criando base de dados dos Clientes
        List<Cliente> clientes = criandoDadosCliente.criandoListaCLientes();

        DadosProdutos dadosProdutos = new DadosProdutos();//Criando base de dados dos Produtos
        dadosProdutos.criandodadosProdutos();

        ValidacaoCiente validacaoLogin = new ValidacaoCiente();// Validando o Login do usuario
        indiceDoCliente = validacaoLogin.validadoCliente(criandoDadosCliente.criandoListaCLientes()); // atribuindo o indice

        Collections.sort(dadosProdutos.criandodadosProdutos());// Tirando os numeros duplicados
        LinkedHashSet<Eletrodomesticos> listaSemDuplicatas = new LinkedHashSet<>(dadosProdutos.criandodadosProdutos());


        mensagens.MensagemDeApresentacao();
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            mensagens.tiposDeCompras();
            int opcao2 = scanner.nextInt();
            if (opcao2 == 2) {
                mensagens.tiposDeEletrodomesticos();
                int opcao3 = scanner.nextInt();
                if (opcao3 == 1) {
                    mensagens.tiposDeEletrodomesticosDisponiveis();

                    ArrayList<String> criandoListaDeTiposDeProdutos = new ArrayList<>();


                    int contador2 = 1;
                    for (Eletrodomesticos lista : listaSemDuplicatas) {


                        System.out.println(contador2++ + " -- " + lista.getTipoProduto());
                        criandoListaDeTiposDeProdutos.add(lista.getTipoProduto());


                    }


                    int opcao4 = scanner.nextInt();
                    if (opcao4 == 1) {


                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        List<Eletrodomesticos> lista = arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                        int opcao5 = scanner.nextInt();

                        System.out.println("Valor q esta voltando " + lista.get(opcao5 - 1).getValor());

                        clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());

                        System.out.println(clientes.get(indiceDoCliente));


                    } else if (opcao4 == 2) {

//                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        criandoDadosCliente
//                                .criandoListaCLientes()
//                                .get(indiceDoCliente)
//                                .adicionandoNocarrinho(arCondicionado.contadors(dadosProdutos.criandodadosProdutos()));


                        System.out.println(criandoDadosCliente
                                .criandoListaCLientes()
                                .get(indiceDoCliente).getTotalDoCarrinho());


                    } else if (opcao4 == 3) {


                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());


                    } else if (opcao4 == 4) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());


                    } else if (opcao4 == 5) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());


                    } else if (opcao4 == 6) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 7) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 8) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 9) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 10) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 11) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 12) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 13) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 14) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 15) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 16) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 17) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 18) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 19) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    } else if (opcao4 == 20) {
                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                    }


                }


            }

        }


    }
}





