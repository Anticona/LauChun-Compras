package pe.idat.edu.lauchun.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.edu.lauchun.entity.EmpleadoEntity;
import pe.idat.edu.lauchun.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService servicio;
    
    @GetMapping
    public List<EmpleadoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable Long id){
        return servicio.findbyId(id);
    }
    
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity c){
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity c){
        c.setIDempleado(id);
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable long id){
        EmpleadoEntity objEmpleado = new EmpleadoEntity();
        objEmpleado.setEstado(false);
        return servicio.delete(EmpleadoEntity.builder().IDempleado(id).build());
    }
}
