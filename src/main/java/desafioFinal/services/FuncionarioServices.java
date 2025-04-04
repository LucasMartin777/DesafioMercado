package desafioFinal.services;

import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;

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
}
