
package com.ucoltis.elimas.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class HistorialClinico {
  private Mascota mascota;
  private final Integer id;
  private final List<DetalleClinico> detalleClinicos; //getter y final se inicializa en contructor

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
    detalleClinicos.add(detalleClinico);
    
  }

  public Mascota getMascota() {
    return mascota;
  }

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }
  
  
  
  
  
}
