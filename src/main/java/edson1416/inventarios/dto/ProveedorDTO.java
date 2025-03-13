package edson1416.inventarios.dto;

import lombok.Data;

@Data
public class ProveedorDTO {
    private Integer id;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
}
