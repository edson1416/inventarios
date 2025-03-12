package edson1416.inventarios.controllers;

import edson1416.inventarios.model.Proveedor;
import edson1416.inventarios.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProveedorController extends BaseController {

    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/proveedores")
    public Page<Proveedor> allProveedores(Pageable pageable) {
        return proveedorService.findAll(pageable);
    }

}
