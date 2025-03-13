package edson1416.inventarios.services;

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

    @Override
    public List<Producto> listar() {
        return this.productoRepositori.findAll();
    }

    @Override
    public Producto buscar(int id) {
        return this.productoRepositori.findById(id).orElse(null);
    }

    @Override
    public Producto guardar(Producto producto) {
        return this.productoRepositori.save(producto);
    }

    @Override
    public void eliminar(int id) {
        this.productoRepositori.deleteById(id);
    }
}
