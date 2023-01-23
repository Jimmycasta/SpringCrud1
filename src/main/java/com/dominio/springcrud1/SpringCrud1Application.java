package com.dominio.springcrud1;

import com.dominio.springcrud1.entidad.Estudiante;
import com.dominio.springcrud1.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrud1Application implements CommandLineRunner {

    @Autowired
    private EstudianteRepositorio repositorio;

    public static void main(String[] args) {
        SpringApplication.run(SpringCrud1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        Estudiante estudiant1 = new Estudiante("jimmy","Castañeda","jimmycasta@gmail.com");
        Estudiante estudiant2 = new Estudiante("Natalia","Sierra","nata@gmail.com");
        Estudiante estudiant3 = new Estudiante("Daniel","Castañeda","Daniel@gmail.com");
        repositorio.save(estudiant1);
        repositorio.save(estudiant2);
        repositorio.save(estudiant3);

         */
    }
}
