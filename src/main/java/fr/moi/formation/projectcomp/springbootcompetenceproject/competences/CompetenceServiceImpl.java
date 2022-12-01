package fr.moi.formation.projectcomp.springbootcompetenceproject.competences;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

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
    public Competence save(Competence entity) {
        return competenceRepository.save(entity);
    }


    @Override
    public Competence findById(String s) {
        return competenceRepository.findById(s).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String s) {
        competenceRepository.deleteById(s);
    }
}
