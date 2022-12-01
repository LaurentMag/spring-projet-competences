package fr.moi.formation.projectcomp.springbootcompetenceproject.equipes;

import fr.moi.formation.projectcomp.springbootcompetenceproject.personnes.Personne;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/equipes")
public class EquipeController {

    private final EquipeService equipeService;

    public EquipeController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    @GetMapping("")
    public List<Equipe> findAll() {
        return equipeService.findAll();
    }

    @GetMapping("{id}")
    public Equipe findById(@PathVariable String id) {
        return equipeService.findById(id);
    }

    @PostMapping("")
    public Equipe save(Equipe equipe) {
        return equipeService.save(equipe);
    }


    @DeleteMapping("")
    public void deleteById(String id) {
        equipeService.deleteById(id);
    }
}
