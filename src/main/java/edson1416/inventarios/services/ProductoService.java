package edson1416.inventarios.services;

import edson1416.inventarios.dto.ProductoDTO;
import edson1416.inventarios.mapper.ProductoMapper;
import edson1416.inventarios.model.Producto;
import edson1416.inventarios.repositories.ProductoRepositori;
import edson1416.inventarios.services.interfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepositori productoRepositori;

    @Autowired
    private ProductoMapper productoMapper;

    @Override
    public List<ProductoDTO> listar() {
        List<Producto> productos = productoRepositori.findAll();
        return this.productoMapper.toDTOList(productos);
    }

    @Override
    public Producto buscar(int id) {
        return this.productoRepositori.findById(id).orElse(null);
    }

    @Override
    public ProductoDTO guardar(ProductoDTO productoDTO) {
        Producto producto = productoMapper.toProducto(productoDTO);
        Producto productoEntity = this.productoRepositori.save(producto);
        return this.productoMapper.toDto(productoEntity);
    }

    @Override
    public void eliminar(int id) {
        this.productoRepositori.deleteById(id);
    }
}
