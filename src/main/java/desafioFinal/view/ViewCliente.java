package desafioFinal.view;

import desafioFinal.mensagens.MensagensCliente;
import desafioFinal.models.carrinhos.Carrinho;
import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.models.usuarios.Cliente;
import desafioFinal.repositories.DadosProdutos;
import desafioFinal.services.AlimentosServices;
import desafioFinal.services.CarrinhoDeCompraServices;
import desafioFinal.services.ClienteServices;
import desafioFinal.services.EletrodomesticosServices;
import desafioFinal.validacao.ValidacaoUsuario;

import java.util.List;
import java.util.Scanner;

public class ViewCliente {


    public static void runViewClient(List<Cliente> clientes) {
        Scanner scanner = new Scanner(System.in);
        int indiceDoCliente = ValidacaoUsuario.validadoCliente(clientes); // atribuindo o indice;
        int exit = 5;

        ClienteServices.apresentacao(indiceDoCliente);


        while (exit != 0) {
            MensagensCliente.tiposDeCompras();

            int opcao2 = scanner.nextInt();
            while (opcao2 == 1) {

                MensagensCliente.verAlimentos();

                int opcao3 = scanner.nextInt();

                while (opcao3 == 1) {

                    List<String> separandoPorTipoAlimento = AlimentosServices.separandoPorTipoAlimentos(DadosProdutos.getListaSemDuplicatasAlimentos());
                    MensagensCliente.volta();

                    int opcao4 = scanner.nextInt();
                    if (opcao4 == 0) {
                        break;
                    }

                    for (int i = 0; i <= 20; i++) {


                        while (opcao4 == i) {
                            List<Alimentos> marcas = AlimentosServices.separandoPorMarcaAlimento(DadosProdutos.getAlimentos(), separandoPorTipoAlimento.get(opcao4 - 1));

                            int opcao5 = scanner.nextInt();

                            if (opcao5 > 0) {
                                Carrinho novo = new Carrinho(marcas.get(opcao5 - 1).getnomeProduto(), marcas.get(opcao5 - 1).getValor());
                                CarrinhoDeCompraServices.produtosNoCarrinho(novo);
                            }
                            break;
                        }
                    }
                }
                if (opcao3 == 2) {
                    break;
                }
            }

            while (opcao2 == 2) {
                MensagensCliente.verEletrodomesticos();
                int opcao3 = scanner.nextInt();


                while (opcao3 == 1) {
                    MensagensCliente.tiposDeEletrodomesticosDisponiveis();

                    List<String> separandoPorTipoEletro = EletrodomesticosServices.separandoPorTipoEletro(DadosProdutos.getListaSemDuplicatasEletrodomesticos());

                    MensagensCliente.volta();

                    int opcao4 = scanner.nextInt();
                    if (opcao4 == 0) {
                        break;
                    }
                    for (int i = 0; i <= 20; i++) {

                        while (opcao4 == i) {

                            List<Eletrodomesticos> marcas = EletrodomesticosServices.separandoPorMarcaEletro(DadosProdutos.getEletrodomesticos(), separandoPorTipoEletro.get(opcao4 - 1));

                            int opcao5 = scanner.nextInt();

                            if (opcao5 > 0) {
                                Carrinho novo = new Carrinho(marcas.get(opcao5 - 1).getnomeProduto(), marcas.get(opcao5 - 1).getValor());
                                CarrinhoDeCompraServices.produtosNoCarrinho(novo);
                            }
                            break;
                        }
                    }
                }
                if (opcao3 == 2) {
                    break;
                }
            }
            while (opcao2 == 3) {
                CarrinhoDeCompraServices.vizualizarCarrinho();
                int opcao6 = scanner.nextInt();
                if (opcao6 == 1) {
                    opcao2 = 1;

                } else if (opcao6 == 2) {
                    opcao2 = 4;
                }
            }

            while (opcao2 == 4) {

                CarrinhoDeCompraServices.
                        pagarContaAVista(clientes.get(indiceDoCliente));
                opcao2 = 66;

            }

            if (opcao2 == 0) {
                MensagensCliente.saindoDoSistema();
                exit = 0;
            }
        }
    }
}