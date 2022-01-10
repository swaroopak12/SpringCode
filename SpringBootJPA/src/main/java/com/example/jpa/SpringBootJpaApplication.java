package com.example.jpa;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.jpa.repository.ActorRepository;
import com.example.jpa.bean.Actor;
@SpringBootApplication
public class SpringBootJpaApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);

    ActorRepository actorRepository = context.getBean(ActorRepository.class);

    /*
     * Save Actor in the db*\
     */

    Actor actor = new Actor(" Edward", "Robinson", "er@gmail.com", "United states");
    actorRepository.save(actor);
    Actor actor2 = new Actor("Zara", "Phythian", "zp@gmail.com", "Europe");
    actorRepository.save(actor2);
    Actor actor3 = new Actor("Jim", "Carrey", "jc@gmail.com", "Canada");
    actorRepository.save(actor3);

    // Read All
    System.out.println(actorRepository.findAll());
    // Read by ID
    System.out.println(actorRepository.findById(2l));

    // Update actor with id -->2

    Optional<Actor> optional = actorRepository.findById(2l);
    Actor actor4 = optional.get();
    actor4.setLocation("ABC");
    Actor a = actorRepository.save(actor4);
    System.out.println(a);

    // delete by Id
     actorRepository.deleteById(2L);

  }

}