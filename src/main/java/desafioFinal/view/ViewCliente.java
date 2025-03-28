package desafioFinal.view;

import desafioFinal.mensagens.Mensagens;
import desafioFinal.models.carrinhos.Carrinho;
import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.services.AlimentosServices;
import desafioFinal.services.CarrinhoDeCompraServices;
import desafioFinal.services.EletrodomesticosServices;
import desafioFinal.validacao.ValidacaoCiente;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class ViewCliente {


    public void rodandoApp() {
        Scanner scanner = new Scanner(System.in);
        Mensagens mensagens = new Mensagens();
        int indiceDoCliente;
        int exit = 5;

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

        System.out.println(" Printado lista sem duplicados " + listaSemDuplicatasEletrodomesticos);
        System.out.println(" Printado lista sem duplicados " + listaSemDuplicatasAlimentos);

        CarrinhoDeCompraServices totalCarrinho = new CarrinhoDeCompraServices();// metodo onde contem o total do carrinho


        mensagens.MensagemDeApresentacao();
        int tipoDeUsuario = scanner.nextInt();


        if (tipoDeUsuario == 1) {
            while (exit != 0) {
                mensagens.tiposDeCompras();

                int opcao2 = scanner.nextInt();
                while (opcao2 == 1) {
                    mensagens.verAlimentos();


                    int opcao3 = scanner.nextInt();

                    while (opcao3 == 1) {

                        AlimentosServices alimentosServices = new AlimentosServices();
                        List<String> separandoPorTipoAlimento = alimentosServices.separandoPorTipoAlimentos(listaSemDuplicatasAlimentos);
                        mensagens.volta();

                        int opcao4 = scanner.nextInt();
                        if (opcao4 == 0) {
                            opcao3 = 100;
                        }

                        for (int i = 0; i <= 20; i++) {


                            while (opcao4 == i) {


                                List<Alimentos> marcas = alimentosServices.separandoPorMarcaAlimento(produtosAlimentos, separandoPorTipoAlimento.get(opcao4 - 1));

                                int opcao5 = scanner.nextInt();

                                if (opcao5 > 0) {
                                    Carrinho novo = new Carrinho(marcas.get(opcao5 - 1).getnomeProduto(), marcas.get(opcao5 - 1).getValor());
                                    totalCarrinho.produtosNoCarrinho(novo);


                                    mensagens.continuarOAdd();

                                } else if (opcao5 == 0) {
                                    i = 21;
                                    opcao3 = 0;

                                }


                            }
                        }

                    }
                    if (opcao3 == 2) {
                        opcao2 = 666;
                    }


                }

                while (opcao2 == 2) {
                    mensagens.verEletrodomesticos();
                    int opcao3 = scanner.nextInt();


                    while (opcao3 == 1) {
                        mensagens.tiposDeEletrodomesticosDisponiveis();

                        EletrodomesticosServices eletrodomesticosServices = new EletrodomesticosServices();
                        List<String> separandoPorTipoEletro = eletrodomesticosServices.separandoPorTipoEletro(listaSemDuplicatasEletrodomesticos);

                        mensagens.volta();

                        int opcao4 = scanner.nextInt();
                        if (opcao4 == 0) {
                            opcao3 = 100;
                        }
                        for (int i = 0; i <= 20; i++) {


                            while (opcao4 == i) {


                                List<Eletrodomesticos> marcas = eletrodomesticosServices.separandoPorMarcaEletro(produtosEletrodomesticos, separandoPorTipoEletro.get(opcao4 - 1));

                                int opcao5 = scanner.nextInt();

                                if (opcao5 > 0) {
                                    Carrinho novo = new Carrinho(marcas.get(opcao5 - 1).getnomeProduto(), marcas.get(opcao5 - 1).getValor());
                                    totalCarrinho.produtosNoCarrinho(novo);
                                    mensagens.continuarOAdd();


                                } else if (opcao5 == 0) {
                                    i = 21;
                                    opcao3 = 0;

                                }
                            }

                        }


                    }
                    if (opcao3 == 2) {
                        opcao2 = 666;
                    }


                }
                while (opcao2 == 3) {
                    System.out.println("Vizualizando carrinho");
                    System.out.println(totalCarrinho.getTotalCarrinho());

                    System.out.println("Deseja adicionar mais itens ou finalizar a compra?:");
                    System.out.println("1-- Continuar comprando");
                    System.out.println("2-- Pagar");

                    int opcao6 = scanner.nextInt();

                    if (opcao6 == 1) {
                        opcao2 = 1;


                    } else if (opcao2 == 2) {
                        opcao2 = 4;

                    }


                }

                while (opcao2 == 4) {
                    System.out.println("Pagando a vista");
                    totalCarrinho.pagarContaAVista(clientes.get(indiceDoCliente));

                    System.out.println("Compra finalizada, obrigado por usar nosso sistema");
                    opcao2 = 66;


                }

                if (opcao2 == 0) {
                    System.out.println("Saindo do Sistema...");
                    exit = 0;
                }

            }


        }

        if (tipoDeUsuario == 2) {
            System.out.println("Acesso funcionario");

        }


    }


}

