package desafioFinal.view;

import desafioFinal.mensagens.Mensagens;
import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.services.AlimentosServices;
import desafioFinal.services.ClienteServices;
import desafioFinal.services.EletrodomesticosServices;
import desafioFinal.validacao.ValidacaoCiente;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class View {


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

        ClienteServices client = new ClienteServices();//calculo do carrinho


        View testessss = new View();


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
                        while (opcao4 == 1) {


                            List<Alimentos> marcas = alimentosServices.separandoPorMarcaAlimento(produtosAlimentos, separandoPorTipoAlimento.get(opcao4 - 1));
                            System.out.println(separandoPorTipoAlimento);
                            int opcao5 = scanner.nextInt();
                            if (opcao5 > 0) {
                                clientes.get(indiceDoCliente).adicionandoNocarrinho(marcas.get(opcao5 - 1).getValor());
                                System.out.println(clientes.get(indiceDoCliente));

                                mensagens.continuarOAdd();

                                int opcao6 = scanner.nextInt();
                                opcao4 = opcao6;


                            } else if (opcao5 == 0) {
                                opcao4 = 0;

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
                        while (opcao4 == 1) {


                            List<Eletrodomesticos> marcas = eletrodomesticosServices.separandoPorMarcaEletro(produtosEletrodomesticos, separandoPorTipoEletro.get(opcao4 - 1));
                            System.out.println(separandoPorTipoEletro);
                            int opcao5 = scanner.nextInt();
                            if (opcao5 > 0) {
                                clientes.get(indiceDoCliente).adicionandoNocarrinho(marcas.get(opcao5 - 1).getValor());
                                System.out.println(clientes.get(indiceDoCliente));

                                mensagens.continuarOAdd();

                                int opcao6 = scanner.nextInt();
                                opcao4 = opcao6;


                            } else if (opcao5 == 0) {
                                opcao4 = 0;

                            }


                        }


                    }
                    if (opcao3 == 2) {
                        opcao2 = 666;
                    }


                }
                while (opcao2 == 3) {
                    System.out.println("Vizualizando carrinho");

                    double valorDaCompra = clientes.get(indiceDoCliente).getTotalDoCarrinho();
                    double saldo = clientes.get(indiceDoCliente).getValorEmconta();
                    client.pagamentoFinal(saldo, valorDaCompra);

                    break;
                }

//                while (opcao2 == 4) {
//                    System.out.println("Finalizar compra");
//                    break;
//                }

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

