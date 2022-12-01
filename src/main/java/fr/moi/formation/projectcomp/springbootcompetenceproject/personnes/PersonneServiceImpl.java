package fr.moi.formation.projectcomp.springbootcompetenceproject.personnes;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

// bonne pratique est d'enlever le @Service sur la class service et à la place on créer un personne config
//@Service
public class PersonneServiceImpl implements PersonneService {

    private final PersonnesRepository personnesRepository;

    public PersonneServiceImpl(PersonnesRepository personnesRepository) {
        this.personnesRepository = personnesRepository;
    }


    @Override
    public List<Personne> findAll() {
        return personnesRepository.findAll();
    }


    @Override
    public Personne save(Personne personne) {
        return personnesRepository.save(personne);
    }


    @Override
    public Personne findById(String id) {
        return personnesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    @Override
    public void deleteById(String id) {
        personnesRepository.deleteById(id);
    }
}
