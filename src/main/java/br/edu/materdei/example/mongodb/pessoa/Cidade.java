package br.edu.materdei.example.mongodb.pessoa;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cidade {

    private String nome;
    private String uf;

}

