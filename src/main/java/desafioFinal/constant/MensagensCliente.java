package desafioFinal.constant;

public class MensagensCliente {

    public static void MensagemDeApresentacao() {

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

    public static void tiposDeCompras() {
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
                        [0] ❌ Sair do Sistema 
                        
                        
                        *********************************************************
                        """);
    }

    public static void verEletrodomesticos() {
        System.out.println("""
                *********************************************************
                *        🔌📺 T I P O S   D E   E L E T R O D O M É S T I C O S 📺🔌       *
                *********************************************************
                
                Você selecionou a opção Eletrodomésticos.
                
                Escolha uma das opções abaixo digitando o número correspondente:
                
                [1] 📜 Ver produtos
                [2] 🔙 Voltar ao menu principal
                
                """);

    }

    public static void verAlimentos() {
        System.out.println(
                """
                        ********************************************************* 
                        *        🍏🥩 T I P O S   D E   A L I M E N T O S 🥖🥛       * 
                        ********************************************************* 
                        
                        Você selecionou a opção Alimentos. \s
                        
                        Escolha uma das opções abaixo digitando o número correspondente: 
                        
                        [1] 📜 Ver produtos 
                        [2] 🔙 Voltar ao menu principal 
                        
                        
                        """);
    }

    public static void tiposDeEletrodomesticosDisponiveis() {
        System.out.println(
                """
                        *********************************************************
                        *        🔌📺 T I P O S   D E   E L E T R O D O M É S T I C O S 📺🔌       *
                        *********************************************************
                        ---------------------------------------------------------
                        
                        
                        🔹 Tipos disponíveis:
                        
                        """);

    }

    public static void continuarOAdd() {
        System.out.println(
                """
                        Deseja continuar adicionar mais produtos?
                        [1] Para continuar.
                        [2] Para voltar.
                        
                        """
        );
    }

    public static void tipoDeUsuario() {
        System.out.println(
                """
                        Por gentileza, escolher o tipo de usuario?
                        [1] Para Cliente.
                        [2] Para Funcionario.
                        
                        """
        );
    }

    public static void volta() {
        System.out.println("0 -- voltar");
    }
    public static void saindoDoSistema() {
        System.out.println("Obrigado por escolher nosso sistema, até logo");
    }
}
