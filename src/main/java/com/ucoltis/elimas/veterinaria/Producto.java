
package com.ucoltis.elimas.veterinaria;


public class Producto {
  private Long codigo;
  private String nombre;
  private Double precio;

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
