package desafioFinal.services;

import desafioFinal.constant.MensagensFuncionario;
import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;
import desafioFinal.repositories.DadosProdutos;

import java.util.Objects;
import java.util.Scanner;

import static desafioFinal.repositories.DadosFuncionarios.funcionarios;


public class FuncionarioServices {

    public static void apresentacao(int indiceDoFuncionario) {
        System.out.println("Bem Vindo " + funcionarios.get(indiceDoFuncionario).getNomeUsuario());

    }

    public static Eletrodomesticos adicionandoProdutoEle() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o Tipo de produto q deseja adicionar");
        String tipoProduto = scanner.nextLine();
        System.out.println(tipoProduto);

        System.out.println("Escolha o marca de produto q deseja adicionar");
        String marcaProduto = scanner.nextLine();
        System.out.println(marcaProduto);

        System.out.println("Escolha o nome de produto q deseja adicionar");
        String nomeProduto = scanner.nextLine();
        System.out.println(nomeProduto);

        System.out.println("Escolha o Descricao de produto q deseja adicionar");
        String descricaoProduto = scanner.nextLine();
        System.out.println(descricaoProduto);

        System.out.println("Escolha o valor de produto q deseja adicionar");
        double valorProduto = scanner.nextDouble();
        System.out.println(valorProduto);

        System.out.println("Escolha o Quantidade de produto q deseja adicionar");
        int quantidadeProduto = scanner.nextInt();
        System.out.println(quantidadeProduto);

        return new Eletrodomesticos(tipoProduto, marcaProduto, nomeProduto, valorProduto, descricaoProduto, quantidadeProduto);
    }

    public static Alimentos adicionandoProdutoAli() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o tipo de produto q deseja adicionar");
        String tipoProduto = scanner.nextLine();
        System.out.println(tipoProduto);

        System.out.println("Escolha o nome desse produto");
        String nomeProduto = scanner.nextLine();
        System.out.println(nomeProduto);

        System.out.println("Escolha a descrição desse produto");
        String descricaoProduto = scanner.nextLine();
        System.out.println(descricaoProduto);

        System.out.println("Escolha a validade desse produto");
        String validadeProduto = scanner.nextLine();
        System.out.println(validadeProduto);

        System.out.println("Escolha o valor desse produto");
        double valorProduto = scanner.nextDouble();
        System.out.println(valorProduto);

        System.out.println("Escolha o peso desse produto");
        double pesoProduto = scanner.nextDouble();
        System.out.println(pesoProduto);

        System.out.println("Escolha a quantidade desse produto");
        int quantidadeProduto = scanner.nextInt();
        System.out.println(quantidadeProduto);

        return new Alimentos(tipoProduto, nomeProduto, valorProduto, descricaoProduto, quantidadeProduto, validadeProduto, quantidadeProduto);
    }

    public static void alterandoAlimento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(DadosProdutos.getAlimentos());
        System.out.println("Informe o nome do alimento que deseja editar");
        String nomeAlimento = scanner.nextLine();


        for (Alimentos alimento : DadosProdutos.getAlimentos()) {
            if (Objects.equals(alimento.getnomeProduto().toLowerCase(), nomeAlimento.toLowerCase())) {
                System.out.println("Voce deseja alterar o " + alimento + "?");
                System.out.println("1 para s e 2 para nao");
                int resposta = scanner.nextInt();
                if (resposta == 1) {
                    MensagensFuncionario.opcoesAlteracaoAlimento();
                    int resposta2 = scanner.nextInt();

                    switch (resposta2) {
                        case 1:
                            System.out.println("Infome o novo tipo do produto");
                            scanner.nextLine();
                            String resposta3 = scanner.nextLine();
                            alimento.setTipoProduto(resposta3);
                            System.out.println(alimento);

                        case 2:
                            System.out.println("Infome o novo nome do produto");
                            scanner.nextLine();
                            String resposta4 = scanner.nextLine();
                            alimento.setNomeProduto(resposta4);
                            System.out.println(alimento);
                            break;
                        case 3:
                            System.out.println("Infome o novo valor do produto");
                            double resposta5 = scanner.nextDouble();
                            alimento.setValor(resposta5);
                            System.out.println(alimento);
                            break;
                        case 4:
                            System.out.println("Infome a nova descrição do produto");
                            scanner.nextLine();
                            String resposta6 = scanner.nextLine();
                            alimento.setDescricao(resposta6);
                            System.out.println(alimento);
                            break;
                        case 5:
                            System.out.println("Infome a nova quantidade do produto");
                            int resposta7 = scanner.nextInt();
                            alimento.setQuantidade(resposta7);
                            System.out.println(alimento);
                            break;
                        case 6:
                            System.out.println("Infome a nova validade do produto");
                            scanner.nextLine();
                            String resposta8 = scanner.nextLine();
                            alimento.setValidade(resposta8);
                            System.out.println(alimento);
                            break;
                        case 7:
                            System.out.println("Infome o peso do produto");
                            double resposta9 = scanner.nextDouble();
                            alimento.setPeso(resposta9);
                            System.out.println(alimento);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                } else {
                    break;
                }
            }
        }
    }

    public static void alterandoEletrodomestico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(DadosProdutos.getEletrodomesticos());
        System.out.println("Informe o nome do produto que deseja editar");
        String nomeEletrodomestico = scanner.nextLine();


        for (Eletrodomesticos eletrodomesticos : DadosProdutos.getEletrodomesticos()) {
            if (Objects.equals(eletrodomesticos.getnomeProduto().toLowerCase(), nomeEletrodomestico.toLowerCase())) {
                System.out.println("Voce deseja alterar o " + eletrodomesticos + "?");
                System.out.println("1 para s e 2 para nao");
                int resposta = scanner.nextInt();
                if (resposta == 1) {
                    MensagensFuncionario.opcoesAlteracaoEletrodomesticos();
                    int resposta2 = scanner.nextInt();

                    switch (resposta2) {
                        case 1:
                            System.out.println("Infome o novo tipo do produto");
                            scanner.nextLine();
                            String resposta3 = scanner.nextLine();
                            eletrodomesticos.setTipoProduto(resposta3);
                            System.out.println(eletrodomesticos);

                        case 2:
                            System.out.println("Infome a nova marca do produto");
                            scanner.nextLine();
                            String resposta4 = scanner.nextLine();
                            eletrodomesticos.setMarca(resposta4);
                            System.out.println(eletrodomesticos);
                            break;
                        case 3:
                            System.out.println("Infome o novo nome do produto");
                            scanner.nextLine();
                            String resposta5 = scanner.nextLine();
                            eletrodomesticos.setNomeProduto(resposta5);
                            System.out.println(eletrodomesticos);
                            break;
                        case 4:
                            System.out.println("Infome o novo valor do produto");
                            int resposta6 = scanner.nextInt();
                            eletrodomesticos.setValor(resposta6);
                            System.out.println(eletrodomesticos);
                            break;
                        case 5:
                            System.out.println("Infome a nova descrição do produto");
                            scanner.nextLine();
                            String resposta7 = scanner.nextLine();
                            eletrodomesticos.setDescricao(resposta7);
                            System.out.println(eletrodomesticos);
                            break;
                        case 6:
                            System.out.println("Infome a nova quantidade do produto");
                            int resposta8 = scanner.nextInt();
                            eletrodomesticos.setQuantidade(resposta8);
                            System.out.println(eletrodomesticos);
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                } else {
                    break;
                }
            }
        }

    }
    public static void removendoAlimento() {

    }
    public static void removendoEletrodomestico() {

    }
}

