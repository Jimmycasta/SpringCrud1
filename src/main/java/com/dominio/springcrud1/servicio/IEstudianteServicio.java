package com.dominio.springcrud1.servicio;

import com.dominio.springcrud1.entidad.Estudiante;

import java.util.List;

public interface IEstudianteServicio {

    public List<Estudiante> listar();

    public Estudiante guardar(Estudiante estudiante);

    public Estudiante getEstudiantePorId(int id);

    public Estudiante actualizar(Estudiante estudiante);

    public void eliminar(int id);
}
