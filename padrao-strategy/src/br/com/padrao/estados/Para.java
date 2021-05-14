package br.com.padrao.estados;

import java.math.BigDecimal;

public class Para implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return this.round(new BigDecimal(17.19));
    }
}
