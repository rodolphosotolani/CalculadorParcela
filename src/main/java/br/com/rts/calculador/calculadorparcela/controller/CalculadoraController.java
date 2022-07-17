package br.com.rts.calculador.calculadorparcela.controller;

import br.com.rts.calculador.calculadorparcela.controller.response.SimuladorEmprestimoResponse;
import br.com.rts.calculador.calculadorparcela.controller.resquest.SimuladorEmprestimoResquest;
import br.com.rts.calculador.calculadorparcela.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/calculadoras")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @PostMapping("/parcelas")
    public ResponseEntity<SimuladorEmprestimoResponse> calcularParcelas(
            @RequestBody @Valid SimuladorEmprestimoResquest simuladorEmprestimo) {

        SimuladorEmprestimoResponse response = service.calcularParcelas(simuladorEmprestimo);
        return ResponseEntity.ok(response);
    }
}
