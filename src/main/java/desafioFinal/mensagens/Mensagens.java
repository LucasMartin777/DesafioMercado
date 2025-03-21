package desafioFinal.mensagens;

public class Mensagens {

    public void MensagemDeApresentacao(){
        System.out.println(
                """
                        *********************************************************
                        *        🍞🛒 S I S T E M A   C L I   P Ã O   D E   A Ç Ú C A R 🛒🍞       *
                        *********************************************************

                        Bem-vindo ao CLI do Pão de Açúcar! 🍏🍞

                        Você está acessando como:

                        [1] 🛍️ Cliente
                        [2] 🏢 Funcionário

                        *********************************************************
                        """);
    }
    public void tiposDeCompras(){
        System.out.println(
                """
                        *********************************************************
                        *        🍞🛒 S I S T E M A   C L I   P Ã O   D E   A Ç Ú C A R 🛒🍞       *
                        *********************************************************
                        
                        
                        
                        
                        Escolha uma das opções abaixo digitando o número correspondente:
                        
                        [1] 🥦 Comprar Alimento
                        [2] 🔌 Comprar Eletrodoméstico
                        [3] 🛍️ Visualizar Carrinho
                        [4] 💳 Finalizar Compra
                        
                        *********************************************************
                        """);
    }
    public void tiposDeEletrodomesticos(){
        System.out.println("""
                                *********************************************************
                                *        🔌📺 T I P O S   D E   E L E T R O D O M É S T I C O S 📺🔌       *
                                *********************************************************
                               \s
                                Você selecionou a opção Eletrodomésticos.
                               \s
                                Escolha uma das opções abaixo digitando o número correspondente:
                               \s
                                [1] 📜 Ver produtos
                                [2] 🔙 Voltar ao menu principal
                        
                        """);

    }
    public void tiposDeEletrodomesticosDisponiveis(){
        System.out.println(
                """
                        *********************************************************
                        *        🔌📺 T I P O S   D E   E L E T R O D O M É S T I C O S 📺🔌       *
                        *********************************************************
                        ---------------------------------------------------------
                        
                        
                        🔹 Tipos disponíveis:
                        
                        """);

    }
}
