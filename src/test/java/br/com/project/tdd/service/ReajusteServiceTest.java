package br.com.project.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.project.tdd.modelo.Desempenho;
import br.com.project.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
        var reajusteService = new ReajusteService();
        var Funcionario = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));
        reajusteService.concederReajuste(Funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), Funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
        var reajusteService = new ReajusteService();
        var Funcionario = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));
        reajusteService.concederReajuste(Funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), Funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
        var reajusteService = new ReajusteService();
        var Funcionario = new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("1000.00"));
        reajusteService.concederReajuste(Funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), Funcionario.getSalario());
    }
    
}
