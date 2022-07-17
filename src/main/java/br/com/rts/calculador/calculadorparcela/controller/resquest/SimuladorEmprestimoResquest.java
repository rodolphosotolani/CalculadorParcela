package br.com.rts.calculador.calculadorparcela.controller.resquest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimuladorEmprestimoResquest {

    private String nome;

    private Long quantidadeParcelas;

    private String sobrenome;

    private BigDecimal valorTotal;

}
