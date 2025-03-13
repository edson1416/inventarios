package edson1416.inventarios.mapper;

import edson1416.inventarios.dto.CategoriaProductoDTO;
import edson1416.inventarios.dto.ProductoDTO;
import edson1416.inventarios.model.CategoriaProducto;
import edson1416.inventarios.model.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;

@Mapper(componentModel = "spring", uses = CategoriaProductoMapper.class)
public interface ProductoMapper {

    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);

    @Mapping(source = "categoria", target = "categorias")
    ProductoDTO toDto(Producto producto);

    List<ProductoDTO> toDTOList(List<Producto> productos);

    @Mapping(source = "categorias", target = "categoria")
    Producto toProducto(ProductoDTO productoDTO);

    default List<CategoriaProductoDTO> mapCategoriaToList(CategoriaProducto categoria) {
        if (categoria == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(CategoriaProductoMapper.INSTANCE.toDTO(categoria));
    }

    default CategoriaProducto mapListToCategoria(List<CategoriaProductoDTO> categorias) {
        if (categorias == null || categorias.isEmpty()) {
            return null;
        }
        return CategoriaProductoMapper.INSTANCE.toEntity(categorias.get(0));
    }

}
