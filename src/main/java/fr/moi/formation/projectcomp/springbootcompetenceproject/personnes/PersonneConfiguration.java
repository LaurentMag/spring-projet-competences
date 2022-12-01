package fr.moi.formation.projectcomp.springbootcompetenceproject.personnes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonneConfiguration {

    // permet de simplifier  si jamais on veut changer de service
    // comme ça on change juste les choses ici
    @Bean
    public PersonneService personneService(PersonnesRepository personnesRepository) {
        return new PersonneServiceImpl(personnesRepository);
    }
}
