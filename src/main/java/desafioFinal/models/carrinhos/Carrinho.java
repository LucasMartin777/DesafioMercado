package desafioFinal.models.carrinhos;

public class Carrinho {
    String tipoPodruto;
    double valorProduto;

    public Carrinho(String tipoPodruto, double valorProduto) {
        this.tipoPodruto = tipoPodruto;
        this.valorProduto = valorProduto;
    }

    public String getTipoPodruto() {
        return tipoPodruto;
    }

    public void setTipoPodruto(String tipoPodruto) {
        this.tipoPodruto = tipoPodruto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return String.format("📦 Carrinho de Compras 🛒\nProduto: %s\nValor: R$ %.2f", tipoPodruto, valorProduto);
    }

}
