package br.edu.materdei.example.mongodb.carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("carro")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @GetMapping
    public List<Carro> findAll() {
        return repository.findAll();
    }
}
