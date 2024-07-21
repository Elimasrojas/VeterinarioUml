
package com.ucoltis.elimas.veterinaria;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Persona{
  
  private final List<Mascota> mascotas;
  
  public Cliente(Long cedula, String nombre, String apellido, Integer edad) {
    super(cedula, nombre, apellido, edad);
    mascotas= new ArrayList<>();
  }
  
  
  public void agregarMascota(Mascota mascota){
    mascotas.add(mascota);    
  }

  public List<Mascota> getMascotas() {
    return mascotas;
  }

  @Override
  public String toString() {
    return "| "+getCedula()+" | "+getNombre(); 
  }
}
