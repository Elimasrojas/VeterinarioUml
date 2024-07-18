
package com.ucoltis.elimas.veterinaria;


public class Veterinario extends Empleado{
  private String especialidad;

  public Veterinario(String especialidad, Long cedula, String nombre, String apellido, Integer edad, Double sueldoS) {
    super(cedula, nombre, apellido, edad, sueldoS);
    this.especialidad = especialidad;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  @Override
  public void calcularSueldo() {
    
  }
  
  
  
}
