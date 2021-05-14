package br.com.padrao.pedido;

import br.com.padrao.estados.Estado;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.math.BigDecimal;

public class Pedido {

    private BigDecimal valorPedido;
    private Estado estado;
    private BigDecimal valorTotalPedido;

    public Pedido(BigDecimal valorPedido, Estado estado) {
        this.valorPedido = valorPedido;
        this.estado = estado;
    }

    public BigDecimal getValorPedido() {
        return valorPedido;
    }

    public Estado getEstado() {
        return estado;
    }

    public BigDecimal getValorTotalPedido() {
        return valorTotalPedido;
    }
}
