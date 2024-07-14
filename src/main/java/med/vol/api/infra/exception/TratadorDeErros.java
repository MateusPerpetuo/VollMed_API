package med.vol.api.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import med.vol.api.domain.ValidacaoException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErros {

    // Tratamento de erro quando não acha o id no banco de dados
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarErro404(){
        return ResponseEntity.notFound().build();
    }

    // Erros por nao conseguir processar uma requisição, por erro de validação dos dados enviado pelo client
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException exception){
        var erros = exception.getFieldErrors();

        return ResponseEntity.badRequest().body(erros.stream()
                .map(DadosErroValidacao::new).toList());
    }

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity tratarErrosValidacao(ValidacaoException exception){
        return ResponseEntity.badRequest().body(exception.getMessage());
    }

    private record  DadosErroValidacao ( String campo, String mensagem) {
        public DadosErroValidacao (FieldError erro){
            this(erro.getField(), erro.getDefaultMessage());
        }
    }
}
