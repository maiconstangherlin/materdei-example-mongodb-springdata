package br.edu.materdei.example.mongodb.carro;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("carro")
@Data
public class Carro {

    private String id;

    private String modelo;

    private String marca;

    private Integer ano;

    List<Acessorio> acessorios;
}
