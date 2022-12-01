package fr.moi.formation.projectcomp.springbootcompetenceproject.equipes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EquipeConfiguration {

    @Bean
    public EquipeService equipeService(EquipeRepository equipeRepository) {
        return new EquipeServiceImpl(equipeRepository);
    }
}
