package exercicios.grupo4_1;

public class ProdutoLojaVirtual extends Produto {
    protected double peso;
    protected boolean hasEstoque;
    protected double precoCompra;
    protected double precoVenda;

    public ProdutoLojaVirtual() {
    }

    public double getPreco(){
        return this.precoVenda;
    }



}
