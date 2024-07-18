
package com.ucoltis.elimas.veterinaria;

import java.time.LocalDateTime;
import java.time.Month;


public class Consulta {
  private final Long id;
  private LocalDateTime fecha;
  private String descripcion;

  public Consulta(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;
  }

  public Consulta(Long id, Integer anio,Integer mes,Integer dia, String descripcion) {
    this(id,descripcion);
    fecha=LocalDateTime.of(anio, mes, dia, 0, 0);
   
  }
  public void relacionConObjetos(Mascota mascota,Veterinario veterinario){
     
  }

  public Long getId() {
    return id;
  }
  public LocalDateTime getFecha() {
    return fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
   
  
  
  
}
