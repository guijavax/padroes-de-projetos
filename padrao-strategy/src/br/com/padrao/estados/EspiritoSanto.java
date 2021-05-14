package br.com.padrao.estados;

import java.math.BigDecimal;

public class EspiritoSanto implements Estado {

    @Override
    public BigDecimal getValorFrete() {
        return new BigDecimal(18.23);
    }
}
