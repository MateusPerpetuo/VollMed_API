package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.medico.DadosCadastroMedico;
import med.vol.api.medico.DadosListagemMedico;
import med.vol.api.medico.Medico;
import med.vol.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional // tem que ser a anotação que vem do pacote do spring
    public void cadastrar( @RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping                 //Pageable tem que ser uma classe do pacote Spring e nao awt
    public Page<DadosListagemMedico> lisstarMedicos(
            @PageableDefault(size = 10, sort = {"nome"})
           // @RequestParam(required = false)
            Pageable paginacao) {

        return repository.findAll(paginacao)
                .map(DadosListagemMedico::new);
    }
}
