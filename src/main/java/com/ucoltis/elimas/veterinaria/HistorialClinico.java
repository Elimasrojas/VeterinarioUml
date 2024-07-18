
package com.ucoltis.elimas.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class HistorialClinico {
  private Mascota mascota;
  private final Integer id;
  private final List<DetalleClinico> detalleClinicos;

  public HistorialClinico(Integer id) {
    this.id = id;
    detalleClinicos= new ArrayList<>();
  }

  public List<DetalleClinico> getDetalleClinicos() {
    return detalleClinicos;
  }

  public Integer getId() {
    return id;
  }
  
  public void agregarDetalle(DetalleClinico detalleClinico){
    
  }

  public Mascota getMascota() {
    return mascota;
  }

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }
  
  
  
  
  
}
