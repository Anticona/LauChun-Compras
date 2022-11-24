package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.EmpleadoEntity;

public interface EmpleadoService {

    public List<EmpleadoEntity> findAll();
    
    public List<EmpleadoEntity> findAllCustom();
    
    public Optional<EmpleadoEntity> findbyId(long id);
    
    public EmpleadoEntity add(EmpleadoEntity c);
    
    public EmpleadoEntity update(EmpleadoEntity c);
    
    public EmpleadoEntity delete(EmpleadoEntity c);
}
