
package com.ucoltis.elimas.veterinaria;

import java.util.ArrayList;
import java.util.List;


class Mascota extends Animal{
  
  private Long id;
  
  private Cliente cliente;  //getter y 
  private HistorialClinico historialClinico;//getter y setter
  private List<Consulta> consultas;//solo getter y agregarConsulta
  
  public Mascota(Long id, String especie, String raza, String nombre) {
    super(especie, raza, nombre);
    this.id = id;
    consultas= new ArrayList<>();
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

  public List<Consulta> getConsultas() {
    return consultas;
  }
  
  public void agregarConsulta(Consulta consulta){
    consultas.add(consulta);
  }
  
  
  
  
}
