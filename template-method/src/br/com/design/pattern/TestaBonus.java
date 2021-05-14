package br.com.design.pattern;

import br.com.design.pattern.bonus.CalculadoraPorAnos;
import br.com.design.pattern.bonus.CalculadoraPorSalario;
import br.com.design.pattern.bonus.SemBonus;

import java.math.BigDecimal;

public class TestaBonus {

    public static void main(String[] args) {
        Funcionario f1  = new Funcionario("Joao", new BigDecimal(5500), 1);
        Funcionario f2  = new Funcionario("Maria", new BigDecimal(1200.0), 4);

        BigDecimal bonusF1 = new CalculadoraPorAnos(new CalculadoraPorSalario(new SemBonus())).chamarCalculo(f1);
        BigDecimal bonusF2 = new CalculadoraPorAnos(new CalculadoraPorSalario(new SemBonus())).chamarCalculo(f2);

        montaMensagem(bonusF1);
        montaMensagem(bonusF2);
    }

    private static void montaMensagem(BigDecimal salario) {
        System.out.println("O salario com bonús é: " + salario);
    }
}
