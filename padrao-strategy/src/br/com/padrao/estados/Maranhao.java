package br.com.padrao.estados;

import java.math.BigDecimal;

public class Maranhao implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return new BigDecimal(16.13);
    }
}
