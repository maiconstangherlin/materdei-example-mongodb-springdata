package br.edu.materdei.example.mongodb.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> findAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoas;
    }

    @PostMapping
    public void addPessoa(){
        Pessoa pessoa = Pessoa.builder()
                .nome("Pessoa Teste")
                .cidade(Cidade.builder()
                        .nome("Itapema")
                        .uf("SC")
                        .build())
                .build();
        pessoaRepository.save(pessoa);
    }

}
