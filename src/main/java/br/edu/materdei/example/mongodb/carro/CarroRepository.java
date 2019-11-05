package br.edu.materdei.example.mongodb.carro;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarroRepository extends MongoRepository<Carro, String> {
}
