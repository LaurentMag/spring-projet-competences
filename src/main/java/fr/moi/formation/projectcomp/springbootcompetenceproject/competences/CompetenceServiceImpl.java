package fr.moi.formation.projectcomp.springbootcompetenceproject.competences;

import java.util.List;
import java.util.Optional;

public class CompetenceServiceImpl implements CompetenceService {

    private final CompetenceRepository competenceRepository;

    public CompetenceServiceImpl(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    @Override
    public List<Competence> findAll() {
        return competenceRepository.findAll();
    }


    @Override
    public <S extends Competence> S save(S entity) {
        return competenceRepository.save(entity);
    }


    @Override
    public Optional<Competence> findById(String s) {
        return competenceRepository.findById(s);
    }

    @Override
    public void deleteById(String s) {
        competenceRepository.deleteById(s);
    }
}
