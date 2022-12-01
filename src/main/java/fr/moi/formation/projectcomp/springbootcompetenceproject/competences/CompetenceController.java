package fr.moi.formation.projectcomp.springbootcompetenceproject.competences;

import fr.moi.formation.projectcomp.springbootcompetenceproject.equipes.Equipe;
import fr.moi.formation.projectcomp.springbootcompetenceproject.equipes.EquipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/competences")
public class CompetenceController {

    private final CompetenceService competenceService;

    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @GetMapping("")
    public List<Competence> findAll() {
        return competenceService.findAll();
    }

    @GetMapping("{id}")
    public Competence findById(@PathVariable String id) {
        return competenceService.findById(id);
    }

    @PostMapping("")
    public Competence save(@RequestBody Competence competence) {
        return competenceService.save(competence);
    }


    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        competenceService.deleteById(id);
    }
}
