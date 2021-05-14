package br.com.design.pattern.bonus;

import br.com.design.pattern.Funcionario;

import java.math.BigDecimal;

public class SemBonus extends CalculadoraBonus{
    public SemBonus() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
       return BigDecimal.ZERO;
    }

    @Override
    protected Boolean validaBonus(Funcionario funcionario) {
        return true;
    }
}
