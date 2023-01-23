package com.dominio.springcrud1.repositorio;

import com.dominio.springcrud1.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

}
