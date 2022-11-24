
package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.entity.EmpleadoEntity;
import pe.idat.edu.lauchun.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository repositorio;
    
    @Override
    public List<EmpleadoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<EmpleadoEntity> findbyId(long id) {
        return repositorio.findById(id);
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity c) {
        return repositorio.save(c);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity c) {
        EmpleadoEntity objempleado = repositorio.getById(c.getIDempleado());
        BeanUtils.copyProperties(c, objempleado);
        return repositorio.save(objempleado);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity c) {
        EmpleadoEntity objempleado = repositorio.getById(c.getIDempleado());
        objempleado.setEstado(false);
        return repositorio.save(objempleado);
    }
}
