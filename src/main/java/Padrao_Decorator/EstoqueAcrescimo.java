package Padrao_Decorator;

public class EstoqueAcrescimo extends EstoqueDecorator {

    private float percentualAcrescimo;

    public EstoqueAcrescimo(Estoque estoque, float percentualAcrescimo) {
        super(estoque);
        this.percentualAcrescimo = percentualAcrescimo;
    }

    @Override
    public float getPreco() {
        return super.getPreco() * (1 + percentualAcrescimo / 100);
    }

    @Override
    public float getAcrescimo() {
        return super.getAcrescimo() + percentualAcrescimo;
    }
}
