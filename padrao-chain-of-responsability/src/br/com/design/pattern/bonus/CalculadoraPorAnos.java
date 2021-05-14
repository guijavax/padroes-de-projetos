package br.com.design.pattern.bonus;

import br.com.design.pattern.Funcionario;

import java.math.BigDecimal;

public class CalculadoraPorAnos extends CalculadoraBonus{

    public CalculadoraPorAnos(CalculadoraBonus proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        if(funcionario.getAnosDeEmpresa() > 2)
            return roundValue(salario.add(salario.multiply(new BigDecimal(0.12))));
        return proximo.calcular(funcionario);
    }


}
