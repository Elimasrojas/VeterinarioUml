
package com.ucoltis.elimas.veterinaria;


public abstract class Persona {
  private final Long cedula;
  private final String nombre;
  private final String apellido;
  private final Integer edad;

  public Persona(Long cedula, String nombre, String apellido, Integer edad) {
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
  }

  public Long getCedula() {
    return cedula;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public Integer getEdad() {
    return edad;
  }
          
          
  /****
   * char-Character
   * byte-Byte
   * short-short
   * int-Integer 9digitos
   * long-Long  18 digitos
   * float-Float 
   * double-Double
   * boolean-Boolean
   * String
   */
  
  
  
}
