package br.com.rts.calculador.calculadorparcela.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimuladorEmprestimoResponse {

    private Long quantidadeParcelas;

    private BigDecimal valorParcela;

    private BigDecimal valorTotalParcelas;

    private BigDecimal valorTotal;

    private String nome;

    private String sobrenome;
}
