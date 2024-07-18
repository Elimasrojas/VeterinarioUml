
package com.ucoltis.elimas.veterinaria;


public abstract class Empleado extends Persona implements IAcciones{
  private Double sueldo;

  public Empleado(Long cedula, String nombre, String apellido, Integer edad,Double sueldoS) {
    super(cedula, nombre, apellido, edad);
    this.sueldo = sueldo;
  }

  public Double getSueldo() {
    return sueldo;
  }

  public void setSueldo(Double sueldo) {
    this.sueldo = sueldo;
  }

  
  
}
