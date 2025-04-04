package desafioFinal.repositories;

import desafioFinal.models.produtos.Alimentos;
import desafioFinal.models.produtos.Eletrodomesticos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class DadosProdutos {

    private static List<Eletrodomesticos> eletrodomesticos = new ArrayList<>();
    private static List<Alimentos> alimentos = new ArrayList<>();


    static {


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
        Collections.sort(DadosProdutos.eletrodomesticos);

    }

    static {

        alimentos.add(new Alimentos("Frutas", "Morango", 10.99, "BlaBlaBla", 40, "30/03/2025", 900));
        alimentos.add(new Alimentos("Frutas", "Morango", 10.99, "BlaBlaBla", 40, "30/03/2025", 900));
        alimentos.add(new Alimentos("Frutas", "Banana", 5.49, "Fonte de potássio", 60, "15/04/2025", 1200));
        alimentos.add(new Alimentos("Laticínios", "Leite Integral", 6.99, "Leite puro e fresco", 30, "10/05/2025", 1000));
        alimentos.add(new Alimentos("Carnes", "Filé de Frango", 25.90, "Peito de frango sem osso", 20, "05/04/2025", 800));
        alimentos.add(new Alimentos("Grãos", "Arroz Branco", 22.50, "Pacote de 5kg", 15, "20/12/2025", 5000));
        alimentos.add(new Alimentos("Bebidas", "Suco de Laranja", 8.75, "100% Natural", 25, "02/06/2025", 1000));
        alimentos.add(new Alimentos("Doces", "Chocolate Amargo", 12.99, "70% Cacau", 50, "12/08/2025", 500));
        alimentos.add(new Alimentos("Massas", "Macarrão Espaguete", 7.80, "500g de macarrão", 35, "25/11/2025", 500));
        alimentos.add(new Alimentos("Condimentos", "Molho de Tomate", 4.99, "Molho caseiro", 45, "18/09/2025", 350));
        alimentos.add(new Alimentos("Bebidas", "Refrigerante Cola", 6.50, "2L de refrigerante", 55, "30/07/2025", 2000));
        alimentos.add(new Alimentos("Frutas", "Maçã", 8.99, "Maçã Fuji fresca", 35, "10/04/2025", 1000));
        alimentos.add(new Alimentos("Frutas", "Uva", 12.50, "Uva sem sementes", 25, "05/04/2025", 900));
        alimentos.add(new Alimentos("Frutas", "Pera", 9.99, "Pera portuguesa", 30, "15/04/2025", 950));
        alimentos.add(new Alimentos("Laticínios", "Queijo Mussarela", 18.99, "Queijo fatiado", 20, "20/05/2025", 500));
        alimentos.add(new Alimentos("Laticínios", "Iogurte Natural", 4.50, "Iogurte sem açúcar", 40, "12/04/2025", 200));
        alimentos.add(new Alimentos("Laticínios", "Manteiga", 9.75, "Manteiga sem sal", 25, "01/07/2025", 250));
        alimentos.add(new Alimentos("Carnes", "Carne Moída", 29.90, "Patinho moído", 15, "06/04/2025", 1000));
        alimentos.add(new Alimentos("Carnes", "Picanha", 79.99, "Picanha premium", 10, "10/04/2025", 1500));
        alimentos.add(new Alimentos("Carnes", "Linguiça Toscana", 19.50, "Pacote de 1kg", 20, "12/04/2025", 1000));
        alimentos.add(new Alimentos("Grãos", "Feijão Preto", 15.99, "Pacote de 1kg", 30, "22/12/2025", 1000));
        alimentos.add(new Alimentos("Grãos", "Lentilha", 13.75, "Pacote de 500g", 20, "20/11/2025", 500));
        alimentos.add(new Alimentos("Bebidas", "Água Mineral", 2.50, "Garrafa de 500ml", 100, "05/12/2025", 500));
        alimentos.add(new Alimentos("Bebidas", "Cerveja Lager", 6.99, "Long neck 330ml", 50, "10/10/2025", 330));
        alimentos.add(new Alimentos("Doces", "Bolo de Chocolate", 24.99, "Bolo caseiro", 10, "08/05/2025", 600));
        alimentos.add(new Alimentos("Doces", "Biscoito Recheado", 3.99, "Pacote de 150g", 40, "15/09/2025", 150));
        alimentos.add(new Alimentos("Massas", "Lasagna", 16.50, "Pronta para assar", 20, "18/10/2025", 900));
        alimentos.add(new Alimentos("Massas", "Penne", 8.25, "500g de massa", 35, "25/11/2025", 500));
        alimentos.add(new Alimentos("Condimentos", "Sal Rosa", 14.99, "1kg de sal do Himalaia", 30, "30/12/2026", 1000));
        alimentos.add(new Alimentos("Condimentos", "Azeite de Oliva", 32.90, "500ml Extra Virgem", 15, "20/06/2026", 500));
        alimentos.add(new Alimentos("Condimentos", "Ketchup", 7.99, "500g de ketchup", 25, "10/08/2025", 500));
        alimentos.add(new Alimentos("Frutas", "Abacaxi", 14.99, "Abacaxi doce e suculento", 25, "10/05/2025", 2000));
        alimentos.add(new Alimentos("Frutas", "Melancia", 22.50, "Melancia grande", 15, "05/06/2025", 5000));
        alimentos.add(new Alimentos("Frutas", "Mamão", 9.99, "Mamão Papaia", 30, "20/04/2025", 1200));
        alimentos.add(new Alimentos("Laticínios", "Queijo Parmesão", 29.99, "Queijo curado", 20, "15/07/2025", 400));
        alimentos.add(new Alimentos("Laticínios", "Leite Desnatado", 6.49, "1 litro", 35, "25/05/2025", 1000));
        alimentos.add(new Alimentos("Laticínios", "Iogurte de Morango", 5.25, "200ml", 50, "30/04/2025", 200));
        alimentos.add(new Alimentos("Carnes", "Costela Bovina", 35.90, "Ideal para churrasco", 10, "12/04/2025", 2000));
        alimentos.add(new Alimentos("Carnes", "Carne de Porco", 28.50, "Pernil sem osso", 15, "15/04/2025", 1800));
        alimentos.add(new Alimentos("Carnes", "Salmão", 49.99, "Posta de salmão", 12, "08/04/2025", 1200));
        alimentos.add(new Alimentos("Grãos", "Farinha de Trigo", 7.99, "Pacote de 1kg", 40, "10/10/2025", 1000));
        alimentos.add(new Alimentos("Grãos", "Milho para Pipoca", 8.99, "500g", 30, "12/12/2025", 500));
        alimentos.add(new Alimentos("Bebidas", "Chá Verde", 15.90, "Caixa com 20 sachês", 25, "10/09/2025", 100));
        alimentos.add(new Alimentos("Bebidas", "Vinho Tinto Seco", 45.99, "750ml", 10, "20/07/2027", 750));
        alimentos.add(new Alimentos("Doces", "Geleia de Morango", 13.99, "Pote de 300g", 20, "18/06/2025", 300));
        alimentos.add(new Alimentos("Doces", "Pudim de Leite", 17.50, "Pote de 500g", 15, "30/05/2025", 500));
        alimentos.add(new Alimentos("Massas", "Ravioli de Queijo", 19.99, "500g de massa recheada", 20, "22/09/2025", 500));
        alimentos.add(new Alimentos("Massas", "Nhoque de Batata", 16.75, "500g", 30, "12/08/2025", 500));
        alimentos.add(new Alimentos("Condimentos", "Mostarda", 6.50, "Frasco de 250g", 35, "05/10/2025", 250));
        alimentos.add(new Alimentos("Condimentos", "Vinagre de Maçã", 9.80, "500ml", 20, "20/06/2026", 500));
        alimentos.add(new Alimentos("Condimentos", "Orégano", 3.99, "Pacote de 50g", 40, "30/11/2026", 50));
        Collections.sort(DadosProdutos.alimentos);


    }

    private static LinkedHashSet<Eletrodomesticos> listaSemDuplicatasEletrodomesticos = new LinkedHashSet<>(eletrodomesticos);
    private static LinkedHashSet<Alimentos> listaSemDuplicatasAlimentos = new LinkedHashSet<>(alimentos);


    public static LinkedHashSet<Alimentos> getListaSemDuplicatasAlimentos() {
        if (listaSemDuplicatasAlimentos == null) {
            listaSemDuplicatasAlimentos = new LinkedHashSet<>(alimentos);
        }
        return listaSemDuplicatasAlimentos;
    }


    public static LinkedHashSet<Eletrodomesticos> getListaSemDuplicatasEletrodomesticos() {
        return listaSemDuplicatasEletrodomesticos;
    }

    public static List<Eletrodomesticos> getEletrodomesticos() {
        return eletrodomesticos;
    }

    public static List<Alimentos> getAlimentos() {
        return alimentos;
    }

    public static void adicionarProdutoEletro(Eletrodomesticos novoELetro) {
        eletrodomesticos.add((novoELetro));
    }
    public static void adicionarProdutoAli(Alimentos novoALi) {
        alimentos.add((novoALi));
    }


}
