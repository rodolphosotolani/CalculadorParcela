package br.com.rts.calculador.calculadorparcela.controller.resquest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimuladorEmprestimoResquest {

    @NotNull(message = "Nome não pode ser nulo")
    private String nome;

    @NotNull(message = "Quantidade de Parcelas não pode ser nulo")
    @Min(value = 12, message = "Quantidade de Parcelas Minimas é 12")
    @Max(value = 48, message = "Quantidade de Parcelas Maximas é 48")
    private Long quantidadeParcelas;

    @NotNull(message = "Sobrenome não pode ser nulo")
    private String sobrenome;

    @NotNull
    @Min(value = 1000, message = "Valor do Financiamento Minimo é 1000")
    @Max(value = 100000, message = "Valor do Financiamento Maximo é 1000000")
    private BigDecimal valorTotal;

}
