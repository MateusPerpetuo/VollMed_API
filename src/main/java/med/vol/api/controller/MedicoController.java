package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.medico.DadosCadastroMedico;
import med.vol.api.medico.Medico;
import med.vol.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional // tem que ser a anotação que vem do pacote do string
    public void cadastrar( @RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}
