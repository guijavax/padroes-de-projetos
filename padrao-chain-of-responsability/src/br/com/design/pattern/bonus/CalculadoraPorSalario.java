package br.com.design.pattern.bonus;

import br.com.design.pattern.Funcionario;

import java.math.BigDecimal;

public class CalculadoraPorSalario extends CalculadoraBonus{

    public CalculadoraPorSalario(CalculadoraBonus proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        if(funcionario.getSalario().compareTo(new BigDecimal(5000.0)) > 0)
            return roundValue(salario.add(salario.multiply(new BigDecimal(0.1))));
        return proximo.calcular(funcionario);
    }
}
