
package com.ucoltis.elimas.veterinaria;

import java.time.LocalDateTime;



public class Consulta {
  private final Long id;
  private LocalDateTime fecha;
  private String descripcion;
  private DetalleClinico detalleClinico;
  private Veterinario veterinario;
  private Factura factura;
  
  /***
   * Consulta: Cada consulta está asociada con exactamente un veterinario (1).
   * 
   */

  public Consulta(Long id, String descripcion) {
    this.id = id;
    this.descripcion = descripcion;
  }

  public Consulta(Long id, Integer anio,Integer mes,Integer dia, String descripcion) {
    this(id,descripcion);
    fecha=LocalDateTime.of(anio, mes, dia, 0, 0);
   
  }
  public void relacionConObjetos(Mascota mascota,Veterinario veterinario){
     //TODO
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

    public DetalleClinico getDetalleClinico() {
        return detalleClinico;
    }

    public void setDetalleClinico(DetalleClinico detalleClinico) {
        this.detalleClinico = detalleClinico;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
   
  
  
  
}
