package br.com.padrao.estados;

import java.math.BigDecimal;

public class Tocantins implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return this.round(new BigDecimal(15.31));
    }
}
