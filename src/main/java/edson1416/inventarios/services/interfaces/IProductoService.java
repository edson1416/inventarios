package edson1416.inventarios.services.interfaces;

import edson1416.inventarios.dto.ProductoDTO;
import edson1416.inventarios.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductoService {
//    Page<Producto> listar(Pageable pageable);
    List <ProductoDTO> listar();
    Producto buscar(int id);
    ProductoDTO guardar(ProductoDTO productoDTO);
    void eliminar(int id);
}
