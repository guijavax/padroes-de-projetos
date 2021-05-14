package br.com.padrao.estados;

import java.math.BigDecimal;

public class MatoGrosso implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return new BigDecimal(15.21);
    }
}
