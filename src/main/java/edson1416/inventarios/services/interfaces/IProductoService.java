package edson1416.inventarios.services.interfaces;

import edson1416.inventarios.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductoService {
    Page<Producto> listar(Pageable pageable);
    Producto buscar(int id);
    Producto guardar(Producto producto);
    void eliminar(int id);
}
