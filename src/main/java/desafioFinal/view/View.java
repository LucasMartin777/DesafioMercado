//package desafioFinal.view;
//
//import desafioFinal.models.produtos.Eletrodomesticos;
//import desafioFinal.services.SeparadorMarca;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class View {
//
//
//
//
//     while (tipoDeUsuario == 1) {
//        while (exit != 0) {
//            mensagens.tiposDeCompras();
//            int opcao2 = scanner.nextInt();
//            while (opcao2 == 1) {
//                mensagens.verAlimentos();
//                int opcao3 = scanner.nextInt();
//                while (opcao3 == 1) {
//                    System.out.println("teste");
//                    int opcao4 = scanner.nextInt();
//
//                }
//                if (opcao3 == 2) {
//                    opcao2 = 666;
//                }
//
//            }
//
//            while (opcao2 == 2) {
//                mensagens.verEletrodomesticos();
//                int opcao3 = scanner.nextInt();
//
//
//                while (opcao3 == 1) {
//                    mensagens.tiposDeEletrodomesticosDisponiveis();
//
//                    ArrayList<String> criandoListaDeTiposDeProdutos = new ArrayList<>();
//
//
//                    int contador2 = 1;
//                    for (Eletrodomesticos lista : listaSemDuplicatas) {
//
//
//                        System.out.println(contador2++ + " -- " + lista.getTipoProduto());
//                        criandoListaDeTiposDeProdutos.add(lista.getTipoProduto());
//
//
//                    }
//
//                    System.out.println("0 -- voltar");
//
//                    int opcao4 = scanner.nextInt();
//                    if (opcao4 == 0) {
//                        opcao3 = 100;
//                    }
//                    while (opcao4 == 1) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 2) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 3) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 4) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 5) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 6) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 7) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 8) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 9) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 10) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 11) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 12) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 13) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 14) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 15) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 16) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 17) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 18) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 19) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//                    while (opcao4 == 20) {
//
//
//                        SeparadorMarca arCondicionado = new SeparadorMarca(criandoListaDeTiposDeProdutos.get(opcao4 - 1));
//                        List<Eletrodomesticos> lista = arCondicionado.separandoPorMarcaEletro(dadosProdutos.criandodadosProdutosEletrodomesticos());
//
//                        int opcao5 = scanner.nextInt();
//                        if (opcao5 > 0) {
//                            clientes.get(indiceDoCliente).adicionandoNocarrinho(lista.get(opcao5 - 1).getValor());
//
//                            System.out.println(clientes.get(indiceDoCliente));
//
//                            mensagens.continuarOAdd();
//
//                            int opcao6 = scanner.nextInt();
//                            opcao4 = opcao6;
//
//
//                        } else if (opcao5 == 0) {
//                            opcao4 = 0;
//
//                        }
//
//
//                    }
//
//
//                }
//                if (opcao3 == 2) {
//                    opcao2 = 666;
//                }
//
//
//            }
//            while (opcao2 == 3) {
//                System.out.println("Vizualizando carrinho");
//
//                double valorDaCompra = clientes.get(indiceDoCliente).getTotalDoCarrinho();
//                double saldo = clientes.get(indiceDoCliente).getValorEmconta();
//                client.pagamentoFinal(saldo,valorDaCompra);
//
//                break;
//            }
//            while (opcao2 == 4) {
//                System.out.println("Finalizar compra");
//                break;
//            }
//            if (opcao2 == 0) {
//                System.out.println("Saindo do Sistema...");
//                exit = 0;
//            }
//
//
//        }
//
//    }
//}
