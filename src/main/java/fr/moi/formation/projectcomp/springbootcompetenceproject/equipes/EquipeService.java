package fr.moi.formation.projectcomp.springbootcompetenceproject.equipes;

import java.util.List;
import java.util.Optional;

public interface EquipeService {
    List<Equipe> findAll();

    Equipe save(Equipe entity);

    Equipe findById(String s);

    void deleteById(String s);
}
