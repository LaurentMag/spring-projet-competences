package fr.moi.formation.projectcomp.springbootcompetenceproject.personnes;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneServiceImpl {

    private final PersonnesRepository personnesRepository;

    public PersonneServiceImpl(PersonnesRepository personnesRepository) {
        this.personnesRepository = personnesRepository;
    }


    public List<Personne> findAll() {
        return personnesRepository.findAll();
    }


    public Personne save(Personne personne) {
        return personnesRepository.save(personne);
    }


    public Personne findById(String id) {
        return personnesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    public void deleteById(String id) {
        personnesRepository.deleteById(id);
    }
}
