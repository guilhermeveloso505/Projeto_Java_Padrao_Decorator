package Padrao_Decorator;

public class EstoqueProduto implements Estoque {
    private String produto;
    private String tipoProduto;
    private float preco;
    private float desconto;
    private float acrescimo;

    public EstoqueProduto() {
    }

    public EstoqueProduto(String produto, String tipoProduto, float preco) {
        this.produto = produto;
        this.tipoProduto = tipoProduto;
        this.preco = preco;
        this.desconto = 0;
        this.acrescimo = 0;
    }

    public String getProduto() {
        return produto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public float getPreco() {
        return preco;
    }

    public float getDesconto() {
        return desconto;
    }

    public float getAcrescimo() {
        return acrescimo;
    }
}
