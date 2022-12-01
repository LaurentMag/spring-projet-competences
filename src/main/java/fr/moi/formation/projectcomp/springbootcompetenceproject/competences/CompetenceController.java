package fr.moi.formation.projectcomp.springbootcompetenceproject.competences;

import fr.moi.formation.projectcomp.springbootcompetenceproject.equipes.Equipe;
import fr.moi.formation.projectcomp.springbootcompetenceproject.equipes.EquipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/equipes")
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
    public Competence save(Competence competence) {
        return competenceService.save(competence);
    }


    @DeleteMapping("")
    public void deleteById(String id) {
        competenceService.deleteById(id);
    }
}
