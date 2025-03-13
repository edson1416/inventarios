package edson1416.inventarios.controllers;

import edson1416.inventarios.dto.ProductoDTO;
import edson1416.inventarios.model.Producto;
import edson1416.inventarios.services.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class); //loger de la aplicacion

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public List<ProductoDTO> allProductos() {
        List<ProductoDTO> productos = this.productoService.listar();
        logger.info("productos encontrados:");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }

    @PostMapping("/productos")
    public ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO) {
        logger.info("Creando un producto: " + productoDTO);
        return this.productoService.guardar(productoDTO);
    }

    @GetMapping("/productos/{id}")
    public Producto findProductoById(@PathVariable int id) {
        logger.info("Buscando un producto: " + id);
        return this.productoService.buscar(id);
    }

    @DeleteMapping("/productos/{id}")
    public void deleteProducto(@PathVariable int id) {
        logger.info("Eliminando un producto: " + id);
        this.productoService.eliminar(id);
    }

}
