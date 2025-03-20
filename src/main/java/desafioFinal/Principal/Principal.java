package desafioFinal.Principal;

import desafioFinal.models.Eletrodomesticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Eletrodomesticos> eletrodomesticos = new ArrayList<>();
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "LG", "TV LED 58' ", 4000, "bla bla bla", 40));
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Brastemp", "Frost Free 400L", 3500, "Geladeira econômica e espaçosa", 50));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "Electrolux", "30L Inox", 800, "Micro-ondas potente com painel digital", 15));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Consul", "5 bocas com acendimento automático", 1500, "Fogão moderno e eficiente", 45));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "Samsung", "12kg EcoBubble", 2800, "Lavagem eficiente com menos consumo de água", 55));
        eletrodomesticos.add(new Eletrodomesticos("Ar-condicionado", "LG", "Split 12000 BTUs", 2200, "Resfria rapidamente ambientes médios", 35));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "Philco", "Vertical Power 2 em 1", 500, "Aspira com potência e praticidade", 10));
        eletrodomesticos.add(new Eletrodomesticos("Ferro de Passar", "Black+Decker", "Cerâmico a vapor", 250, "Passa roupas com facilidade e eficiência", 5));
        eletrodomesticos.add(new Eletrodomesticos("Liquidificador", "Oster", "700W com copo de vidro", 300, "Bate e tritura com alta performance", 7));
        eletrodomesticos.add(new Eletrodomesticos("Cafeteira", "Dolce Gusto", "Automática para cápsulas", 450, "Prepara cafés especiais com rapidez", 6));
        eletrodomesticos.add(new Eletrodomesticos("Ventilador", "Mondial", "Turbo 40cm", 230, "Ventilação forte e silenciosa", 8));
        eletrodomesticos.add(new Eletrodomesticos("Torradeira", "Cadence", "2 fatias com ajuste de temperatura", 150, "Prepara torradas crocantes em segundos", 4));
        eletrodomesticos.add(new Eletrodomesticos("Forno Elétrico", "Fischer", "50L com timer", 700, "Assa e gratina alimentos com precisão", 20));
        eletrodomesticos.add(new Eletrodomesticos("Exaustor", "Suggar", "60cm inox", 480, "Elimina odores e melhora a ventilação", 12));
        eletrodomesticos.add(new Eletrodomesticos("Purificador de Água", "Consul", "Compacto com filtro avançado", 600, "Filtra impurezas e melhora o sabor da água", 10));
        eletrodomesticos.add(new Eletrodomesticos("Churrasqueira Elétrica", "Britânia", "Com grelha antiaderente", 300, "Prepara carnes de forma prática", 7));
        eletrodomesticos.add(new Eletrodomesticos("Secador de Cabelo", "Taiff", "2100W Profissional", 350, "Secagem rápida e eficiente", 5));
        eletrodomesticos.add(new Eletrodomesticos("Batedeira", "Arno", "Planetária Deluxe", 500, "Ideal para massas e preparos diversos", 9));
        eletrodomesticos.add(new Eletrodomesticos("Lava-louças", "Brastemp", "10 serviços inox", 3200, "Lava e seca pratos e talheres com eficiência", 40));
        eletrodomesticos.add(new Eletrodomesticos("Smart TV", "Samsung", "4K UHD 65’", 4500, "Imagem ultra HD com tecnologia HDR", 45));
        Scanner scanner = new Scanner(System.in);


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
        int opcao = scanner.nextInt();

        if (opcao == 1) {
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
    }

}



