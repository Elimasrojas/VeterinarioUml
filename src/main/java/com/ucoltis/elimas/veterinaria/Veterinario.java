
package com.ucoltis.elimas.veterinaria;




public class Veterinario extends Empleado{
  private String especialidad;
  
  /***
   * Veterinario: Un veterinario puede estar asociado con muchas consultas (0..*).
   * 
   */

  public Veterinario(Long cedula, String nombre, String apellido, Integer edad, 
          Double sueldo,String especialidad ) {
    super(cedula, nombre, apellido, edad, sueldo);
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
