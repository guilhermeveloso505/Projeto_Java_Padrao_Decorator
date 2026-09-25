package Padrao_Decorator;

public class EstoqueDesconto extends EstoqueDecorator {

    private float percentualDesconto;

    public EstoqueDesconto(Estoque estoque, float percentualDesconto) {
        super(estoque);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public float getPreco() {
        return super.getPreco() * (1 - percentualDesconto / 100);
    }

    @Override
    public float getDesconto() {
        return super.getDesconto() + percentualDesconto;
    }

}
