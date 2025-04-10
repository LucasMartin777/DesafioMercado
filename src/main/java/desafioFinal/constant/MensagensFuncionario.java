package desafioFinal.constant;

public class MensagensFuncionario {


    public static void opcoesFuncionario() {
        System.out.println(
                "\n===== 🧑‍💼 Menu do Funcionário =====\n" +
                        "[1] 📦 Adicionar Produto ao Estoque\n" +
                        "[2] 📝 Editar Produto Existente\n" +
                        "[3] 🗑️ Remover Produto do Estoque\n" +
                        "[4] 📊 Visualizar histórioco de Vendas\n" +
                        "[5] 👀 Ver Lista de Produtos em Estoque\n" +
                        "[6] 💰 Consultar Total de Vendas\n" +
                        "[0] ❌ Sair do Sistema\n" +
                        "Escolha uma opção: "
        );


    }

    public static void tipoDeListaProduto() {
        System.out.println(
                "\n===== 🛒 Escolha a Categoria =====\n" +
                        "[1] 🥦 Alimentos\n" +
                        "[2] 🔌 Eletrodomésticos\n" +
                        "[0] ↩️ Voltar\n" +
                        "Escolha uma opção: "
        );
    }

    public static void opcoesAlteracaoAlimento() {
        System.out.println("""
                Qual informação deseja alterar?
                1 - Tipo do Produto
                2 - Nome
                3 - Valor
                4 - Descrição
                5 - Quantidade
                6 - Validade
                7 - Peso
                """);

    }

    public static void opcoesAlteracaoEletrodomesticos() {
        System.out.println("""
                Qual informação deseja alterar?
                1 - Tipo do Produto
                2 - Marca
                3 - Nome
                4 - Valor
                5 - Descrição
                6 - Quantidade
                """);


    }
}
