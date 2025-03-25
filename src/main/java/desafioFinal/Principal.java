package desafioFinal;

import desafioFinal.repositories.DadosClientes;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.services.ClienteServices;
import desafioFinal.services.EletrodomesticosServices;
import desafioFinal.mensagens.Mensagens;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.validacao.ValidacaoCiente;
import desafioFinal.view.View;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mensagens mensagens = new Mensagens();
        int indiceDoCliente;
        int exit = 5;

        DadosClientes criandoDadosCliente = new DadosClientes();// Criando base de dados dos Clientes
        List<Cliente> clientes = criandoDadosCliente.criandoListaCLientes();

        DadosProdutos dadosProdutos = new DadosProdutos();//Criando base de dados dos Produtos
        List<Eletrodomesticos> produtosEletrodomesticos = dadosProdutos.criandodadosProdutosEletrodomesticos();

        ValidacaoCiente validacaoLogin = new ValidacaoCiente();// Validando o Login do usuario
        indiceDoCliente = validacaoLogin.validadoCliente(clientes); // atribuindo o indice

        Collections.sort(dadosProdutos.criandodadosProdutosEletrodomesticos());// Tirando os numeros duplicados
        LinkedHashSet<Eletrodomesticos> listaSemDuplicatas = new LinkedHashSet<>(produtosEletrodomesticos);

        System.out.println(" Printado lista sem duplicados " + listaSemDuplicatas);

        ClienteServices client = new ClienteServices();//calculo do carrinho

        ArrayList<String> criandoListaDeTiposDeProdutos = new ArrayList<>(); // Criando a lista de tipos de produtos

        View testessss = new View();


        mensagens.MensagemDeApresentacao();
        int tipoDeUsuario = scanner.nextInt();

        while (tipoDeUsuario == 1) {
            while (exit != 0) {
                mensagens.tiposDeCompras();
                int opcao2 = scanner.nextInt();
                while (opcao2 == 1) {
                    mensagens.verAlimentos();
                    int opcao3 = scanner.nextInt();
                    while (opcao3 == 1) {
                        System.out.println("teste");
                        int opcao4 = scanner.nextInt();

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
                        List<String> teste = eletrodomesticosServices.separandoPorTipoEletro(listaSemDuplicatas);

                        System.out.println("0 -- voltar");

                        int opcao4 = scanner.nextInt();
                        if (opcao4 == 0) {
                            opcao3 = 100;
                        }
                        while (opcao4 == 1) {


                            List<Eletrodomesticos> marcas = eletrodomesticosServices.separandoPorMarcaEletro(produtosEletrodomesticos, teste.get(opcao4 - 1));
                            System.out.println(teste);
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
                testessss.testess(opcao2);
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


    }
}






