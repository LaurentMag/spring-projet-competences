package fr.moi.formation.projectcomp.springbootcompetenceproject.equipes;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class EquipeServiceImpl implements EquipeService {

    private final EquipeRepository equipeRepository;

    public EquipeServiceImpl(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @Override
    public List<Equipe> findAll() {
        return equipeRepository.findAll();
    }


    @Override
    public Equipe save(Equipe equipe) {
        return equipeRepository.save(equipe);
    }


    @Override
    public Equipe findById(String s) {
        return equipeRepository.findById(s)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String s) {
        equipeRepository.deleteById(s);
    }
}
