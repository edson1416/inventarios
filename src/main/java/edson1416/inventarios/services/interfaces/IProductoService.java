package edson1416.inventarios.services.interfaces;

import edson1416.inventarios.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductoService {
//    Page<Producto> listar(Pageable pageable);
    List <Producto> listar();
    Producto buscar(int id);
    Producto guardar(Producto producto);
    void eliminar(int id);
}
