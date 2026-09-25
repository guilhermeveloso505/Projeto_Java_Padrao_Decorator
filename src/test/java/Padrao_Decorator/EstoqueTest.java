package Padrao_Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    @Test
    public void deveCriarEstoqueProduto() {
        Estoque estoque = new EstoqueProduto(
                "Notebook",
                "Eletrônico",
                1000.0f
        );

        assertEquals("Notebook", estoque.getProduto());
        assertEquals("Eletrônico", estoque.getTipoProduto());
        assertEquals(1000.0f, estoque.getPreco());
        assertEquals(0.0f, estoque.getDesconto());
        assertEquals(0.0f, estoque.getAcrescimo());
    }

    @Test
    public void deveAplicarDesconto() {
        Estoque estoque = new EstoqueProduto(
                "Notebook",
                "Eletrônico",
                1000.0f
        );

        Estoque estoqueComDesconto =
                new EstoqueDesconto(estoque, 10.0f);

        assertEquals(900.0f, estoqueComDesconto.getPreco());
        assertEquals(10.0f, estoqueComDesconto.getDesconto());
        assertEquals(0.0f, estoqueComDesconto.getAcrescimo());
    }

    @Test
    public void deveAplicarAcrescimo() {
        Estoque estoque = new EstoqueProduto(
                "Notebook",
                "Eletrônico",
                1000.0f
        );

        Estoque estoqueComAcrescimo =
                new EstoqueAcrescimo(estoque, 10.0f);

        assertEquals(1100.0f, estoqueComAcrescimo.getPreco());
        assertEquals(0.0f, estoqueComAcrescimo.getDesconto());
        assertEquals(10.0f, estoqueComAcrescimo.getAcrescimo());
    }

    @Test
    public void deveAplicarDoisDescontos() {
        Estoque estoque = new EstoqueProduto(
                "Notebook",
                "Eletrônico",
                1000.0f
        );

        Estoque estoqueComDesconto =
                new EstoqueDesconto(estoque, 10.0f);

        Estoque estoqueComDoisDescontos =
                new EstoqueDesconto(estoqueComDesconto, 20.0f);

        assertEquals(720.0f, estoqueComDoisDescontos.getPreco());
        assertEquals(30.0f, estoqueComDoisDescontos.getDesconto());
    }

    @Test
    public void deveAplicarDoisAcrescimos() {
        Estoque estoque = new EstoqueProduto(
                "Notebook",
                "Eletrônico",
                1000.0f
        );

        Estoque estoqueComAcrescimo =
                new EstoqueAcrescimo(estoque, 10.0f);

        Estoque estoqueComDoisAcrescimos =
                new EstoqueAcrescimo(estoqueComAcrescimo, 20.0f);

        assertEquals(1320.0f, estoqueComDoisAcrescimos.getPreco());
        assertEquals(30.0f, estoqueComDoisAcrescimos.getAcrescimo());
    }

    @Test
    public void deveAplicarDescontoEAcréscimo() {
        Estoque estoque = new EstoqueProduto(
                "Notebook",
                "Eletrônico",
                1000.0f
        );

        Estoque estoqueComDesconto =
                new EstoqueDesconto(estoque, 10.0f);

        Estoque estoqueComDescontoEAcrescimo =
                new EstoqueAcrescimo(estoqueComDesconto, 20.0f);

        assertEquals(1080.0f, estoqueComDescontoEAcrescimo.getPreco());
        assertEquals(10.0f, estoqueComDescontoEAcrescimo.getDesconto());
        assertEquals(20.0f, estoqueComDescontoEAcrescimo.getAcrescimo());
    }
}