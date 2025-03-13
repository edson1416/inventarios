package edson1416.inventarios.services;

import edson1416.inventarios.dto.ProveedorDTO;
import edson1416.inventarios.mapper.ProveedorMapper;
import edson1416.inventarios.model.Proveedor;
import edson1416.inventarios.repositories.ProductoRepositori;
import edson1416.inventarios.repositories.ProveedorRepositori;
import edson1416.inventarios.services.interfaces.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService implements IProveedorService {

    @Autowired
    private ProveedorRepositori proveedorRepositori;

    @Autowired
    private ProveedorMapper proveedorMapper;

    @Override
    public List<ProveedorDTO> findAll() {
        List<Proveedor> proveedorEntity = this.proveedorRepositori.findAll();
        return this.proveedorMapper.toDTOList(proveedorEntity);
    }

    @Override
    public Proveedor findById(int id) {
        return proveedorRepositori.findById(id).orElse(null);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveedorRepositori.save(proveedor);
    }

    @Override
    public void delete(int id) {
        proveedorRepositori.deleteById(id);
    }
}
