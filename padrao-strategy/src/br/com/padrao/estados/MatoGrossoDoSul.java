package br.com.padrao.estados;

import java.math.BigDecimal;

public class MatoGrossoDoSul implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return this.round(new BigDecimal(16.21));
    }
}
