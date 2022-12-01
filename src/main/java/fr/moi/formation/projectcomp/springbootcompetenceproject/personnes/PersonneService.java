package fr.moi.formation.projectcomp.springbootcompetenceproject.personnes;

import java.util.List;

public interface PersonneService {
    List<Personne> findAll();

    Personne save(Personne personne);

    Personne findById(String id);

    void deleteById(String id);
}
