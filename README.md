# Padrão Decorator

O projeto se baseia no padrão de projeto Decorator, utilizando como exemplo um sistema de estoque e produtos. O objetivo é demonstrar como o padrão Decorator permite adicionar dinamicamente comportamentos a um objeto, possibilitando combinar descontos e acréscimos sem modificar a classe original EstoqueProduto.

# Estrutura

* Estoque — interface principal do componente.

* EstoqueProduto — implementação concreta do estoque.

* EstoqueDecorator — classe abstrata base dos decorators.

* EstoqueDesconto — adiciona o comportamento de desconto ao produto.

* EstoqueAcrescimo — adiciona o comportamento de acréscimo ao produto.

* EstoqueTest — testes unitários das funcionalidades.
