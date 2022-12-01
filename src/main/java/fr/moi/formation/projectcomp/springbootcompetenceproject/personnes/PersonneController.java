package fr.moi.formation.projectcomp.springbootcompetenceproject.personnes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/personnes")
public class PersonneController {

    private PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping("")
    public List<Personne> findAll() {
        return personneService.findAll();
    }

    @GetMapping("{id}")
    public Personne findById(@PathVariable String id) {
        return personneService.findById(id);
    }

    @PostMapping("")
    public Personne save(@RequestBody Personne personne) {
        return personneService.save(personne);
    }


    @DeleteMapping("")
    public void deleteById(String id) {
        personneService.deleteById(id);
    }
}
