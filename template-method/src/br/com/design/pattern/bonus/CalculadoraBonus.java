package br.com.design.pattern.bonus;

import br.com.design.pattern.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CalculadoraBonus {

    protected CalculadoraBonus proximo;

    public CalculadoraBonus(CalculadoraBonus proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal calcular(Funcionario funcionario);

    public BigDecimal chamarCalculo(Funcionario funcionario) {
            return validaBonus(funcionario) ? calcular(funcionario) : proximo.chamarCalculo(funcionario);
    }

    protected abstract Boolean validaBonus(Funcionario funcionario);
    protected BigDecimal roundValue(BigDecimal valor) {
        return valor.setScale(2, RoundingMode.HALF_EVEN);
    }
}
