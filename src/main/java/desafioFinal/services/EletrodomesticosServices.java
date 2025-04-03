package desafioFinal.services;

import desafioFinal.models.produtos.Eletrodomesticos;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class EletrodomesticosServices {


    public static List<String> separandoPorTipoEletro(LinkedHashSet<Eletrodomesticos> listaSemDuplicatas) {
        ArrayList<String> tipos = new ArrayList<>();

        int contador2 = 1;


        for (Eletrodomesticos lista : listaSemDuplicatas) {


            System.out.println(contador2++ + " -- " + lista.getTipoProduto());
            tipos.add(lista.getTipoProduto());


        }


        return tipos;


    }

    public static List<Eletrodomesticos> separandoPorMarcaEletro(List<Eletrodomesticos> eletrodomesticos, String valor) {
        int contador = 1;
        System.out.println(String.format("""
                *********************************************************
                *        🔌 L I S T A   D E   %s 🔌       *
                *********************************************************
                --------------------------------------------------------- \n
                """, valor));
        List<Eletrodomesticos> listaDeMarcaEletro = new ArrayList<>();
        for (Eletrodomesticos eletro : eletrodomesticos) {
            if (Objects.equals(eletro.getTipoProduto(), valor)) {
                System.out.println(contador++ + " - Marca: " + eletro.getMarca() + "   Nome: " + eletro.getnomeProduto() + "   Valor: " + eletro.getValor());
                listaDeMarcaEletro.add(eletro);

            }
        }
        System.out.println(
                """ 
                        0 - Voltar
                        ---------------------------------------------------------
                        
                        
                        
                        
                        """);

        return listaDeMarcaEletro;
    }


}
