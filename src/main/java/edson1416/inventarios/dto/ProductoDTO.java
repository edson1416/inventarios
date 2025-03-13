package edson1416.inventarios.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductoDTO {
    private Integer id;
    private String descripcion;
    private Double precio;
    private Integer existencia;
    private List<CategoriaProductoDTO> categorias;
}
