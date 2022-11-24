
package pe.idat.edu.lauchun.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.edu.lauchun.entity.DetalleComprasEntity;
import pe.idat.edu.lauchun.repository.DetalleComprasRepository;

@Service
public class DetalleComprasServiceImpl implements DetalleComprasService {

    @Autowired
    private DetalleComprasRepository DetcomprasRepo;
    @Override
    public List<DetalleComprasEntity> findAll() {
        return DetcomprasRepo.findAll();
    }

    

    @Override
    public Optional<DetalleComprasEntity> findById(Long id) {
        return DetcomprasRepo.findById(id);
    }

    @Override
    public DetalleComprasEntity add(DetalleComprasEntity d) {
        return DetcomprasRepo.save(d);
    }

    @Override
    public DetalleComprasEntity update(DetalleComprasEntity d) {
        DetalleComprasEntity objdetcomp = DetcomprasRepo.getById(d.getIDdetalleCompra());
        BeanUtils.copyProperties(d, objdetcomp);
        return DetcomprasRepo.save(objdetcomp);
    }

    @Override
    public List<DetalleComprasEntity> findAllCustom() {
        return DetcomprasRepo.findAllCustom();
    }
    
    
}
