package edson1416.inventarios.services.interfaces;

import edson1416.inventarios.dto.ProveedorDTO;
import edson1416.inventarios.model.Proveedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProveedorService {
    List<ProveedorDTO> findAll();
    Proveedor findById(int id);
    Proveedor save(Proveedor proveedor);
    void delete(int id);
}
