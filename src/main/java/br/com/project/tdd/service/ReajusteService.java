package br.com.project.tdd.service;

import br.com.project.tdd.modelo.Desempenho;
import br.com.project.tdd.modelo.Funcionario;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho){
        if(desempenho == Desempenho.A_DESEJAR){
            var reajuste = funcionario.getSalario().multiply(new java.math.BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        } else if(desempenho == Desempenho.BOM){
            var reajuste = funcionario.getSalario().multiply(new java.math.BigDecimal("0.15"));
            funcionario.reajustarSalario(reajuste);
        } else if(desempenho == Desempenho.OTIMO){
            var reajuste = funcionario.getSalario().multiply(new java.math.BigDecimal("0.20"));
            funcionario.reajustarSalario(reajuste);
        }
    }
    
}
