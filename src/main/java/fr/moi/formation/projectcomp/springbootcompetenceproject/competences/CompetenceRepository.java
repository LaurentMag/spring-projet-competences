package fr.moi.formation.projectcomp.springbootcompetenceproject.competences;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompetenceRepository extends MongoRepository<Competence, String> {
}
