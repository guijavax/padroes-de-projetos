package br.com.padrao.estados;

import java.math.BigDecimal;

public class SaoPaulo implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return this.round(new BigDecimal(21.12));
    }
}
