package desafioFinal.services;

import desafioFinal.models.produtos.Alimentos;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class AlimentosServices {

    public List<Alimentos> separandoPorMarcaAlimento(List<Alimentos> alimentos, String valor) {
        int contador = 1;
        System.out.println(String.format("""
                *********************************************************
                *        🍏 L I S T A   D E   %s 🍽️       *
                *********************************************************
                --------------------------------------------------------- \n
                """, valor));
        List<Alimentos> listaTiposAlimentos = new ArrayList<>();
        for (Alimentos alimento : alimentos) {
            if (Objects.equals(alimento.getTipoProduto(), valor)) {
                System.out.println(contador++ + " - Marca: " + alimento.getnomeProduto() + "   Valor: " + alimento.getValor());
                listaTiposAlimentos.add(alimento);

            }
        }
        System.out.println(
                """ 
                        0 - Voltar
                        ---------------------------------------------------------
                        
                        
                        
                        
                        """);

        return listaTiposAlimentos;
    }

    public List<String> separandoPorTipoAlimentos(LinkedHashSet<Alimentos> listaSemDuplicatas) {
        ArrayList<String> tipos = new ArrayList<>();

        int contador2 = 1;


        for (Alimentos lista : listaSemDuplicatas) {


            System.out.println(contador2++ + " -- " + lista.getTipoProduto());
            tipos.add(lista.getTipoProduto());


        }


        return tipos;


    }

}
