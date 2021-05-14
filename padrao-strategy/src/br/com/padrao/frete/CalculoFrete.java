package br.com.padrao.frete;

import br.com.padrao.estados.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoFrete {

    public BigDecimal calculoFrete(Estado estado, BigDecimal valor) {
        return estado.getValorFrete().add(valor);
    }
}
