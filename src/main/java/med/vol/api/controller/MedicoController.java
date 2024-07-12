package med.vol.api.controller;

import med.vol.api.medico.DadosCadastromedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar( @RequestBody DadosCadastromedico dados) {
        System.out.println(dados);
    }
}
