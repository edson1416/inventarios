package edson1416.inventarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String descripcion;
    Double precio;
    Integer existencia;

//    public Producto() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public Double getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(Double precio) {
//        this.precio = precio;
//    }
//
//    public Integer getExistencia() {
//        return existencia;
//    }
//
//    public void setExistencia(Integer existencia) {
//        this.existencia = existencia;
//    }
//
//    @Override
//    public String toString() {
//        return "Producto{" +
//                "id=" + id +
//                ", descripcion='" + descripcion + '\'' +
//                ", precio=" + precio +
//                ", existencia=" + existencia +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Producto producto = (Producto) o;
//        return Objects.equals(id, producto.id) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(precio, producto.precio) && Objects.equals(existencia, producto.existencia);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, descripcion, precio, existencia);
//    }
}
