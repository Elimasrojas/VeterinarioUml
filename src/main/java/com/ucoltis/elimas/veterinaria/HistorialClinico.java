
package com.ucoltis.elimas.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class HistorialClinico {
  private Mascota mascota;
  private final Long id;
  private final List<DetalleClinico> detalleClinicos; //getter y final se inicializa en contructor

  public HistorialClinico(Long id) {
    this.id = id;
    detalleClinicos= new ArrayList<>();
  }

  public List<DetalleClinico> getDetalleClinicos() {
    return detalleClinicos;
  }

  public Long getId() {
    return id;
  }

  
  public void agregarDetalle(DetalleClinico detalleClinico){
    detalleClinicos.add(detalleClinico);
    
  }

  public Mascota getMascota() {
    return mascota;
  }

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }
  
  
  
  
  
}
