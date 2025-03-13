package edson1416.inventarios.mapper;

import edson1416.inventarios.dto.ProductoDTO;
import edson1416.inventarios.dto.ProveedorDTO;
import edson1416.inventarios.model.Proveedor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProveedorMapper {

    ProveedorMapper INSTANCE = Mappers.getMapper(ProveedorMapper.class);

    ProveedorDTO toDto(Proveedor proveedor);

    List<ProveedorDTO> toDTOList(List<Proveedor> proveedores);

    Proveedor toProveedor(ProveedorDTO proveedorDTO);

}
