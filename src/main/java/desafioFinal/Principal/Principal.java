package desafioFinal.Principal;

import desafioFinal.models.Eletrodomesticos;

import java.util.*;

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
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Brastemp", "Frost Free Duplex 375L", 3200, "Geladeira espaçosa e econômica", 15));
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Electrolux", "Infinity Frost Free 450L", 4100, "Design moderno e eficiência energética", 10));
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Consul", "Frost Free 340L", 2900, "Ideal para famílias pequenas", 20));
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "Samsung", "Smart TV Crystal UHD 50'", 3600, "Imagem 4K com HDR10+", 25));
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "Sony", "OLED 65' Bravia XR", 8900, "Qualidade de imagem incrível com cores vivas", 8));
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "LG", "NanoCell 55' AI ThinQ", 5200, "Tecnologia avançada para melhor experiência", 18));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Brastemp", "4 bocas com Timer Touch", 2100, "Praticidade e controle preciso do tempo", 12));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Electrolux", "5 bocas com turbo chama", 2500, "Chama mais potente para cozimento rápido", 10));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Atlas", "Fogão 4 bocas com vidro temperado", 1700, "Design sofisticado e segurança no uso", 15));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "Panasonic", "30L Grill Inverter", 950, "Função Grill para dourar alimentos", 30));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "Philco", "25L Espelhado", 750, "Painel digital com funções rápidas", 25));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "LG", "32L EasyClean", 1100, "Revestimento antibacteriano e maior capacidade", 20));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "Electrolux", "PowerSpeed 2000W", 800, "Alta potência e filtro HEPA", 18));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "Mondial", "Turbo Cyclone", 550, "Aspiração eficiente com tecnologia ciclone", 22));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "WAP", "Silent Speed", 720, "Silencioso e potente para todos os tipos de piso", 20));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "Samsung", "EcoBubble 11kg", 3100, "Tecnologia que economiza água e energia", 10));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "Brastemp", "Ative! 12kg", 2700, "Ciclo rápido e eficiente para o dia a dia", 15));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "LG", "Titan 14kg", 4300, "Motor Direct Drive silencioso e eficiente", 8));
        eletrodomesticos.add(new Eletrodomesticos("Ventilador", "Arno", "Silence Force 40cm", 320, "Potência e silêncio para o ambiente", 30));
        eletrodomesticos.add(new Eletrodomesticos("Ventilador", "Mondial", "Super Power 50cm", 380, "Oscilação ampla e velocidade ajustável", 25));
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Samsung", "Duplex Frost Free 460L", 4500, "Tecnologia Digital Inverter", 12));
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Eletrolux", "Top Freezer 500L", 4800, "Design sofisticado com controle digital", 10));
        eletrodomesticos.add(new Eletrodomesticos("Geladeira", "Consul", "Compacta Frost Free 300L", 2700, "Eficiente e ideal para espaços pequenos", 18));
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "TCL", "Smart TV LED 50' 4K", 3400, "Tecnologia HDR para cores vibrantes", 22));
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "AOC", "Android TV 43' Full HD", 2800, "Sistema Android para mais conectividade", 20));
        eletrodomesticos.add(new Eletrodomesticos("Televisão", "Philips", "Ambilight OLED 65'", 7200, "Experiência imersiva com Ambilight", 8));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Dako", "5 Bocas com forno duplo", 2900, "Ideal para quem cozinha grandes receitas", 10));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Fischer", "Cooktop por Indução 4 bocas", 3200, "Cozimento rápido e seguro", 12));
        eletrodomesticos.add(new Eletrodomesticos("Fogão", "Atlas", "Fogão 6 bocas industrial", 3500, "Alta potência para uso profissional", 8));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "Midea", "Espelhado 30L", 870, "Design sofisticado e painel touch", 25));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "Brastemp", "Inox 35L", 1100, "Função Grill e descongelamento por peso", 20));
        eletrodomesticos.add(new Eletrodomesticos("Micro-ondas", "Electrolux", "Painel Blue Touch 40L", 1350, "Maior capacidade e mais funções", 15));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "Philco", "Vertical Power Clean", 620, "Leve e eficiente para qualquer superfície", 28));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "Samsung", "Jet 90 Pet", 1900, "Sem fio e com alta potência de sucção", 10));
        eletrodomesticos.add(new Eletrodomesticos("Aspirador de Pó", "Dyson", "V15 Detect", 4500, "Tecnologia laser para detecção de poeira", 7));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "Electrolux", "Perfect Care 9kg", 2800, "Lavagem eficiente e delicada", 12));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "Panasonic", "Econavi 13kg", 3600, "Inteligência artificial para economia de água", 9));
        eletrodomesticos.add(new Eletrodomesticos("Máquina de Lavar", "Consul", "Automática 8kg", 2200, "Ideal para quem mora sozinho", 15));
        eletrodomesticos.add(new Eletrodomesticos("Ventilador", "Britânia", "Turbo 40cm", 290, "Oscilação automática e motor potente", 32));
        eletrodomesticos.add(new Eletrodomesticos("Ventilador", "Cadence", "Ventisol 50cm", 350, "Design moderno e maior alcance de vento", 25));

        Collections.sort(eletrodomesticos);


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
            int opcao2 = scanner.nextInt();
            if (opcao2 == 2) {
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
                int opcao3 = scanner.nextInt();
                if (opcao3 == 1) {
                    System.out.println(
                            """
                                    *********************************************************
                                    *        🔌📺 T I P O S   D E   E L E T R O D O M É S T I C O S 📺🔌       *
                                    *********************************************************
                                    ---------------------------------------------------------
                                    🔹 Tipos disponíveis:
                                    [1] Televisão
                                    [2] Geladeira
                                    [3] Fogão
                                    [4] Micro-ondas
                                    [5] Aspirador de Pó
                                    [6] Máquina de Lavar
                                    [7] Ventilador
                                    ---------------------------------------------------------
                                    
                                    *********************************************************
                                    """
                    );
                }
                System.out.println("""
                        *********************************************************
                        *        🔌📺 L I S T A   D E   T E L E V I S Õ E S 📺🔌       *
                        *********************************************************
                        --------------------------------------------------------- \n
                        """);


                int contador = 1;
                for (Eletrodomesticos eletro : eletrodomesticos) {
                    if (Objects.equals(eletro.getTipoProduto(), "Televisão")) {
                        System.out.println(contador++ + " - Marca: " + eletro.getMarca() + "Nome: " + eletro.getnomeProduto() + "Valor: " + eletro.getValor());
                    }
                }


            }

        }


    }
}





