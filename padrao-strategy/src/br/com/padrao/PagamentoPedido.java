package br.com.padrao;

import br.com.padrao.estados.*;
import br.com.padrao.frete.CalculoFrete;
import br.com.padrao.pedido.Pedido;

import java.math.RoundingMode;
import java.util.*;
import java.math.BigDecimal;

public class PagamentoPedido {

    public static void main(String[] args) {

        CalculoFrete calculo = new CalculoFrete();

        Pedido pedido1 = new Pedido(new BigDecimal(122.90), new MinasGerais());
        Pedido pedido2 = new Pedido(new BigDecimal(122.90), new SaoPaulo());
        Pedido pedido3 = new Pedido(new BigDecimal(122.90), new Tocantins());
        Pedido pedido4 = new Pedido(new BigDecimal(122.90), new Para());
        Pedido pedido5 = new Pedido(new BigDecimal(122.90), new MatoGrosso());
        Pedido pedido6 = new Pedido(new BigDecimal(122.90), new Goias());
        Pedido pedido7 = new Pedido(new BigDecimal(122.90), new Maranhao());
        Pedido pedido8 = new Pedido(new BigDecimal(122.90), new EspiritoSanto());
        Pedido pedido9 = new Pedido(new BigDecimal(122.90), new MatoGrossoDoSul());

        List<Pedido> pedidos = List.of(pedido1, pedido2, pedido3, pedido4, pedido5, pedido6, pedido7, pedido8, pedido9);

        int i = 1;
        for (Pedido pedido : pedidos){
            BigDecimal valorComFrete = calculo.calculoFrete(pedido.getEstado(), pedido.getValorPedido());
            System.out.println("O valor do Pedido" + (i++) +  " com o frete é: " + valorComFrete.setScale(2, RoundingMode.HALF_EVEN));
        }

    }
}
