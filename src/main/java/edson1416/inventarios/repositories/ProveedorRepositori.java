package edson1416.inventarios.repositories;

import edson1416.inventarios.model.Proveedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepositori extends JpaRepository<Proveedor, Integer> {
    Page<Proveedor> findAll(Pageable pageable);
}
