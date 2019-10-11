package br.edu.materdei.example.mongodb.pessoa;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {

    @Override
    List<Pessoa> findAll();

    @Override
    Optional<Pessoa> findById(String id);
}
