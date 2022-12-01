package fr.moi.formation.projectcomp.springbootcompetenceproject.competences;

import java.util.List;
import java.util.Optional;

public interface CompetenceService {
    List<Competence> findAll();

    <S extends Competence> S save(S entity);

    Competence findById(String s);

    void deleteById(String s);
}
