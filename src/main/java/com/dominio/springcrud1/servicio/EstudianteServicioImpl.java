package com.dominio.springcrud1.servicio;

import com.dominio.springcrud1.entidad.Estudiante;
import com.dominio.springcrud1.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioImpl implements IEstudianteServicio {

    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listar() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante getEstudiantePorId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Estudiante actualizar(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);

    }
}
