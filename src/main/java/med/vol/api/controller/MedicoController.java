package med.vol.api.controller;

import med.vol.api.medico.DadosCadastromedico;
import med.vol.api.medico.Medico;
import med.vol.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar( @RequestBody DadosCadastromedico dados) {
        repository.save(new Medico(dados));
    }
}
