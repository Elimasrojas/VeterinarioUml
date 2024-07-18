
package com.ucoltis.elimas.veterinaria;


class Mascota extends Animal{
  private Cliente cliente;
  private HistorialClinico historialClinico;
  private Long id;

  public Mascota(Long id, String especie, String raza, String nombre) {
    super(especie, raza, nombre);
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public HistorialClinico getHistorialClinico() {
    return historialClinico;
  }

  public void setHistorialClinico(HistorialClinico hc) {
    this.historialClinico = hc;
  }
  
  
  
  
}
