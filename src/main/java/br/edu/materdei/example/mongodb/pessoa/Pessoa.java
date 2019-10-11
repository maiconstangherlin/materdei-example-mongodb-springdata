package br.edu.materdei.example.mongodb.pessoa;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("pessoa")
@Data
@Builder
public class Pessoa implements Serializable {

    @Id
    private String _id;
    private String nome;
    private Cidade cidade;

}
