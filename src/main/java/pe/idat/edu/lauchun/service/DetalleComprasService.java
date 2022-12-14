

package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import pe.idat.edu.lauchun.entity.DetalleComprasEntity;


public interface DetalleComprasService {
    // funcion que te permita mostrar todos los datos    
    List<DetalleComprasEntity> findAll();
    
    //funcion para mostrar todods los datos habilitados
    List<DetalleComprasEntity> findAllCustom();
    
    //funcion para buscar por codigo
    Optional<DetalleComprasEntity> findById(Long id);
    
    //funcion para registrar datos
    DetalleComprasEntity add(DetalleComprasEntity d);
    
    //funcion para actualizar datos
    DetalleComprasEntity update(DetalleComprasEntity d);
    
    //funcion para eliminar datos
    //DetalleComprasEntity delete(DetalleComprasEntity d);
}
