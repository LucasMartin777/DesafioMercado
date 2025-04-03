package desafioFinal;

import desafioFinal.repositories.DadosProdutos;

public class Testes {

    public static void main(String[] args) {
        DadosProdutos teste = new DadosProdutos();

        System.out.println(teste.getListaSemDuplicatasAlimentos());

        System.out.println(DadosProdutos.getListaSemDuplicatasAlimentos());
    }


}






