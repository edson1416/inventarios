package edson1416.inventarios.repositories;

import edson1416.inventarios.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositori extends JpaRepository<Producto, Integer> {
    @Override
    Page<Producto> findAll(Pageable pageable);
}
