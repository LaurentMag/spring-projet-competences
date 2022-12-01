package fr.moi.formation.projectcomp.springbootcompetenceproject.personnes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonnesRepository extends MongoRepository<Personne, String> {
}
