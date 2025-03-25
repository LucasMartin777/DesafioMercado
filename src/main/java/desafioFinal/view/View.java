package desafioFinal.view;

public class View {
    int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void testess(int valor){
        while (valor == 4) {
            System.out.println("Finalizar compra");
            break;
        }

    }
}
