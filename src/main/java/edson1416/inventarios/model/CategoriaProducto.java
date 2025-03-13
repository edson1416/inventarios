package edson1416.inventarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

//    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<Producto> productos;

}
