package fr.moi.formation.projectcomp.springbootcompetenceproject.equipes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipeRepository extends MongoRepository<Equipe, String> {
}
