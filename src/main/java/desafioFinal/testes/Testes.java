package desafioFinal.testes;

public class Testes {
    public static void main(String[] args) {
        int item = 5;

        String mensagem = String.format(
                "*********************************************************\n" +
                        "*        🔌📺 L I S T A   D E   %s 📺🔌       *\n" +
                        "*********************************************************\n" +
                        "--------------------------------------------------------- \n", item);


        System.out.println(mensagem);

    }


}
