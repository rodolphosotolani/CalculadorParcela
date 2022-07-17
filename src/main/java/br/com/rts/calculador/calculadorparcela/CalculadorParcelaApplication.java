package br.com.rts.calculador.calculadorparcela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@SpringBootApplication
public class CalculadorParcelaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadorParcelaApplication.class, args);
    }

}
