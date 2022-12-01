package fr.moi.formation.projectcomp.springbootcompetenceproject.equipes;

import fr.moi.formation.projectcomp.springbootcompetenceproject.personnes.Personne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipe {

    @Id
    private String id;
    private String nom;
    private List<Personne> personneList = new ArrayList<>();

}
