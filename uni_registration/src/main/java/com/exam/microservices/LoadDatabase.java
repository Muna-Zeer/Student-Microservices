package com.exam.microservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exam.microservices.model.Student;


@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(StudentRepository student) {
//String firstName, String lastName, String major, String dob
    return args -> {
    	student.save(new Student("muna", "zeer", "software","25/1/2001"));
    	student.save(new Student("manar", "zeer", "software","25/1/2001"));
    	student.save(new Student("rana", "zeer", "software","26/1/2001"));
    	student.save(new Student("reem", "zeer", "software","27/1/2001"));
    	student.save(new Student("sara", "zeer", "software","28/1/2001"));
    	student.save(new Student("ali", "zeer", "software","29/1/2001"));
    	student.findAll().forEach(student1 -> log.info("Preloaded " + student1.toString()));

      
    
      
    };
  }
}