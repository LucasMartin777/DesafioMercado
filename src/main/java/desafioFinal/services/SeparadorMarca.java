package desafioFinal.services;

import desafioFinal.models.produtos.Eletrodomesticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SeparadorMarca {
    String valor;

    public SeparadorMarca(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<Eletrodomesticos> separandoPorMarcaEletro(List<Eletrodomesticos> eletrodomesticos) {
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

//    public List<Alimentos> tiposDeAlimentos(List<Alimentos> alimentos){
//        System.out.println(String.format("""
//                *********************************************************
//                *        🍏 L I S T A   D E   %s 🍽️       *
//                *********************************************************
//                --------------------------------------------------------- \n
//                """, valor));
//        List<Alimentos> listaTiposAlimentos = new ArrayList<>();
//        for (Alimentos alimento : alimentos){
//
//        }
//
//        return
//    }
}
