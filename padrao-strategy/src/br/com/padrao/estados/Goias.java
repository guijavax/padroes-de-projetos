package br.com.padrao.estados;

import java.math.BigDecimal;

public class Goias implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return new BigDecimal(19.54);
    }
}
