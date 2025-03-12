package edson1416.inventarios.services.interfaces;

import edson1416.inventarios.model.Proveedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProveedorService {
    Page<Proveedor> findAll(Pageable pageable);
    Proveedor findById(int id);
    Proveedor save(Proveedor proveedor);
    void delete(int id);
}
