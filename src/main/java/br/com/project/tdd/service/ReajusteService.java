package br.com.project.tdd.service;

import br.com.project.tdd.modelo.Desempenho;
import br.com.project.tdd.modelo.Funcionario;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        var percentual = desempenho.percentualReajuste();
        var reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajustarSalario(reajuste);
    }

}
