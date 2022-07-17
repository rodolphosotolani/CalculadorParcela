package br.com.rts.calculador.calculadorparcela.controller;

import br.com.rts.calculador.calculadorparcela.controller.response.SimuladorEmprestimoResponse;
import br.com.rts.calculador.calculadorparcela.controller.resquest.SimuladorEmprestimoResquest;
import br.com.rts.calculador.calculadorparcela.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoras")
public class Calculadora {

    @Autowired
    private CalculadoraService service;

    @GetMapping("/parcelas")
    public ResponseEntity<SimuladorEmprestimoResponse> calcularParcelas(SimuladorEmprestimoResquest simuladorEmprestimo) {
        SimuladorEmprestimoResponse response = service.calcularParcelas(simuladorEmprestimo);
        return ResponseEntity.ok(response);
    }
}
