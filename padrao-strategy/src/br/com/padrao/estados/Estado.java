package br.com.padrao.estados;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Estado {

     BigDecimal getValorFrete();

    default BigDecimal round(BigDecimal valor) {
        return valor.setScale(2, RoundingMode.HALF_EVEN);
    }
}
