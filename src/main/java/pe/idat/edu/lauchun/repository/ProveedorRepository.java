

package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.entity.ProveedorEntity;

public interface ProveedorRepository extends JpaRepository<ProveedorEntity, Long>{
    @Query("select c from ProveedorEntity c where c.Estado='activo'")
    List<ProveedorEntity>findAllCustom();
}
