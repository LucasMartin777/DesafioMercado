package desafioFinal.calculos;

import desafioFinal.models.produtos.Eletrodomesticos;

import java.util.List;
import java.util.Objects;

public class SeparandoUnicos {
    String valor;

    public SeparandoUnicos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void contadors(List<Eletrodomesticos> eletrodomesticos) {
        int contador = 1;
        System.out.println(String.format("""
                *********************************************************
                *        🔌 L I S T A   D E   %s 🔌       *
                *********************************************************
                --------------------------------------------------------- \n
                """, valor));
        for (Eletrodomesticos eletro : eletrodomesticos) {
            if (Objects.equals(eletro.getTipoProduto(), valor)) {
                System.out.println(contador++ + " - Marca: " + eletro.getMarca() + "   Nome: " + eletro.getnomeProduto() + "   Valor: " + eletro.getValor());
            }
        }
        System.out.println(
                """
                        
                        ---------------------------------------------------------
                        
                        
                        
                        
                        """);
    }
}
