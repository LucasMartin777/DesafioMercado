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
        int exit = 5;

        DadosClientes criandoDadosCliente = new DadosClientes();// Criando base de dados dos Clientes
        List<Cliente> clientes = criandoDadosCliente.criandoListaCLientes();

        DadosProdutos dadosProdutos = new DadosProdutos();//Criando base de dados dos Produtos
        dadosProdutos.criandodadosProdutos();

        ValidacaoCiente validacaoLogin = new ValidacaoCiente();// Validando o Login do usuario
        indiceDoCliente = validacaoLogin.validadoCliente(criandoDadosCliente.criandoListaCLientes()); // atribuindo o indice

        Collections.sort(dadosProdutos.criandodadosProdutos());// Tirando os numeros duplicados
        LinkedHashSet<Eletrodomesticos> listaSemDuplicatas = new LinkedHashSet<>(dadosProdutos.criandodadosProdutos());


        mensagens.MensagemDeApresentacao();


        while (exit != 0) {
            mensagens.tiposDeCompras();
            int opcao2 = scanner.nextInt();
            while (opcao2 == 1) {
                System.out.println("Alimentos");

            }

            while (opcao2 == 2) {
                mensagens.tiposDeEletrodomesticos();
                int opcao3 = scanner.nextInt();


                while (opcao3 == 1) {
                    mensagens.tiposDeEletrodomesticosDisponiveis();

                    ArrayList<String> criandoListaDeTiposDeProdutos = new ArrayList<>();


                    int contador2 = 1;
                    for (Eletrodomesticos lista : listaSemDuplicatas) {


                        System.out.println(contador2++ + " -- " + lista.getTipoProduto());
                        criandoListaDeTiposDeProdutos.add(lista.getTipoProduto());


                    }

                    System.out.println("0 -- voltar");

                    int opcao4 = scanner.nextInt();
                    if (opcao4 == 0) {
                        opcao3 = 100;
                    }
                    while (opcao4 == 1) {


                        SeparandoUnicos arCondicionado = new SeparandoUnicos(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
                        List<Eletrodomesticos> lista = arCondicionado.contadors(dadosProdutos.criandodadosProdutos());

                        int opcao5 = scanner.nextInt();

                        clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());

                        System.out.println(clientes.get(indiceDoCliente));

                        mensagens.continuarOAdd();

                        int opcao6 = scanner.nextInt();
                        opcao4 = opcao6;


                    }
                    if (opcao4 == 2) {

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
            while (opcao2 == 3) {
                System.out.println("Vizualizando carrinho");
                break;
            }
            while (opcao2 == 4) {
                System.out.println("Finalizar compra");
                break;
            }


        }


    }


}






