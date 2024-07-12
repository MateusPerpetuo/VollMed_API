package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping
    @Transactional // tem que ser a anotação que vem do pacote do spring
    public void cadastrar (@RequestBody @Valid DadosCadastroPaciente dados){
        repository.save(new Paciente(dados));
    }

    @GetMapping                           //Pageable tem que ser uma classe do pacote Spring e nao awt
    public Page<DadosListagemPaciente> listarMedicos(
            @PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {

        return repository.findAllByAtivoTrue(paginacao)
                .map(DadosListagemPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarPaciente dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir (@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.excluir();
    }
}
