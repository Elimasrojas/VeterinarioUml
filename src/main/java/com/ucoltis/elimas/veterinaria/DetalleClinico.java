
package com.ucoltis.elimas.veterinaria;

import java.time.LocalDateTime;


class DetalleClinico {
  private LocalDateTime fecha;
  private String descripcion;
  
  private HistorialClinico historialClinico; //setter y getter
  private final Consulta consulta;//getter final xq tiene contructor

  public DetalleClinico(Consulta consulta) {
    this.consulta=consulta;
  }

  public Consulta getConsulta() {
    return consulta;
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

  public HistorialClinico getHistorialClinico() {
    return historialClinico;
  }

  public void setHistorialClinico(HistorialClinico historialClinico) {
    this.historialClinico = historialClinico;
  }
  
  
  
  
}
