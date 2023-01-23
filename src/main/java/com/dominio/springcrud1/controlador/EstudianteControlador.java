package com.dominio.springcrud1.controlador;

import com.dominio.springcrud1.entidad.Estudiante;
import com.dominio.springcrud1.servicio.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {

    @Autowired
    private IEstudianteServicio servicio;

    @GetMapping({"estudiantes", "/"})
    public String listar(Model model) {
        model.addAttribute("estudiantes", servicio.listar());
        return "estudiantes";

    }

    @GetMapping("estudiantes/nuevo")
    public String formularioNuevo(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }
    @PostMapping("/estudiantes")
    public  String guardar(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guardar(estudiante);
        return "redirect:/estudiantes";

    }
    @GetMapping("/estudiantes/actualizar/{id}")
    public String formularioActualizar(@PathVariable Integer id, Model model){
        model.addAttribute("estudiante", servicio.getEstudiantePorId(id));
        return "actualizar_estudiante";

    }
    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Integer id, @ModelAttribute("estudiante") Estudiante estudiante, Model model){
        Estudiante estudianteActual = servicio.getEstudiantePorId(id);
        estudianteActual.setId(id);
        estudianteActual.setNombre(estudiante.getNombre());
        estudianteActual.setApellido(estudiante.getApellido());
        estudianteActual.setEmail(estudiante.getEmail());
        servicio.actualizar(estudianteActual);
        return "redirect:/estudiantes";
    }
    @GetMapping("/estudiantes/{id}")
    public String eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return "redirect:/estudiantes";

    }
}
