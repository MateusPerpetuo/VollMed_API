package med.vol.api.controller;


import jakarta.validation.Valid;
import med.vol.api.domain.consulta.ConsultaRepository;
import med.vol.api.domain.consulta.DadosAgendamentoConsulta;
import med.vol.api.domain.consulta.DadosDetalhamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity agendar (@RequestBody @Valid DadosAgendamentoConsulta dados){
        System.out.println(dados);
        return ResponseEntity.ok(new DadosDetalhamentoConsulta(null,null,null,null));
    }
}
