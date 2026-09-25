package Padrao_Decorator;

public abstract class EstoqueDecorator implements Estoque {
    private Estoque estoque;

    public EstoqueDecorator(Estoque estoque) {
        this.estoque = estoque;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getProduto() {
        return this.estoque.getProduto();
    }

    public String getTipoProduto() {
        return this.estoque.getTipoProduto();
    }

    public float getPreco() {
        return this.estoque.getPreco();
    }

    public float getDesconto() {
        return this.estoque.getDesconto();
    }

    public float getAcrescimo() {
        return this.estoque.getAcrescimo();
    }

}
