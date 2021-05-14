package br.com.padrao.estados;

import java.math.BigDecimal;

public class MinasGerais implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return this.round(new BigDecimal(23.81));
    }
}
