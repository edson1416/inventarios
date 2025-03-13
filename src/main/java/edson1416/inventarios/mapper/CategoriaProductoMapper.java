package edson1416.inventarios.mapper;


import edson1416.inventarios.dto.CategoriaProductoDTO;
import edson1416.inventarios.model.CategoriaProducto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaProductoMapper {
    CategoriaProductoMapper INSTANCE = Mappers.getMapper(CategoriaProductoMapper.class);

    CategoriaProductoDTO toDTO(CategoriaProducto categoria);

    CategoriaProducto toEntity(CategoriaProductoDTO categoriaDTO);

}
