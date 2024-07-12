package med.vol.api.medico;

import med.vol.api.endereco.DadosEndereco;

public record DadosCadastromedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {
}
