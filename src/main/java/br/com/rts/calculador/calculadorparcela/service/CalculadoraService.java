package br.com.rts.calculador.calculadorparcela.service;

import br.com.rts.calculador.calculadorparcela.controller.response.SimuladorEmprestimoResponse;
import br.com.rts.calculador.calculadorparcela.controller.resquest.SimuladorEmprestimoResquest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculadoraService {

    public SimuladorEmprestimoResponse calcularParcelas(SimuladorEmprestimoResquest request) {

        BigDecimal juros = this.getTaxaJurosEmprestimo(request.getQuantidadeParcelas());

        BigDecimal valorTotalParcelas = request.getValorTotal()
                .multiply(juros)
                .divide(new BigDecimal(100))
                .add(request.getValorTotal());

        BigDecimal valorParcela = valorTotalParcelas.divide(new BigDecimal(request.getQuantidadeParcelas()));

        return
                SimuladorEmprestimoResponse
                        .builder()
                        .nome(request.getNome())
                        .sobrenome(request.getSobrenome())
                        .quantidadeParcelas(request.getQuantidadeParcelas())
                        .valorTotal(request.getValorTotal())
                        .valorTotalParcelas(valorTotalParcelas)
                        .valorParcela(valorParcela)
                        .build();
    }

    private BigDecimal getTaxaJurosEmprestimo(Long quantidadeParcelas) {

        if (quantidadeParcelas >= 12
        && quantidadeParcelas <= 23)
            return new BigDecimal(5);

        if (quantidadeParcelas >= 24
        && quantidadeParcelas <= 31)
            return new BigDecimal(10);

        if (quantidadeParcelas >= 32
        && quantidadeParcelas <= 48)
            return new BigDecimal(10);

        return BigDecimal.ZERO;
    }
}
