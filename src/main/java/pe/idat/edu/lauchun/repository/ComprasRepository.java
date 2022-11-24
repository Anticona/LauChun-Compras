

package pe.idat.edu.lauchun.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.edu.lauchun.entity.ComprasEntity;

public interface ComprasRepository extends JpaRepository<ComprasEntity, Long>{
    @Query("select c from ComprasEntity c where c.Estado='Completa'")
    List<ComprasEntity>findAllCustom();
}
