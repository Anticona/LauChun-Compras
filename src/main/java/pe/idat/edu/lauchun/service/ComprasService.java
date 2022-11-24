

package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.ComprasEntity;

public interface ComprasService {
     // funcion que te permita mostrar todos los datos    
    List<ComprasEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<ComprasEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<ComprasEntity> findById(Long id);
    
    //funcion para registrar datos
    ComprasEntity add(ComprasEntity c);
    
    //funcion para actualizar datos
    ComprasEntity update(ComprasEntity c);
    
    //funcion para eliminar datos
    ComprasEntity delete(ComprasEntity c);
}
