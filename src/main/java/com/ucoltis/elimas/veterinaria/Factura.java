
package com.ucoltis.elimas.veterinaria;

import java.time.LocalDate;

public class Factura {
  private final Long numero;
  private LocalDate fecha;

  public Factura(Long numero, LocalDate fecha) {
    this.numero = numero;
    this.fecha = fecha;
  }

  public Long getNumero() {
    return numero;
  }
  
  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
  
  public void agregarDetalleFactura(DetalleFactura detalleFactura){
    //TODO
  }
  public Double Total(){
    //TODO
    return null;
  }
  
}
