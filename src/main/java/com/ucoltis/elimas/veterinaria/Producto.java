
package com.ucoltis.elimas.veterinaria;


public class Producto {
  private Long codigo;
  private String nombre;
  private Double precio;
  
  /***
   * Queremos saber qué productos están en cada Detallefactura,
   * pero el producto no necesita saber en qué DetalleFactura está. 0.*
   * La relación de 0..* indica que un Producto puede estar en cero,
   * una o muchas DetalleFactura, pero no es necesario que el Producto 
   * conozca directamente todas las DetalleFactura.
   * 
   */

  public Producto(Long codigo, String nombre, Double precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
  }

  public Long getCodigo() {
    return codigo;
  }

  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }
  
  
}
