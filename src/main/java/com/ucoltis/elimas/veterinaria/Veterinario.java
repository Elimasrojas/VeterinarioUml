package com.ucoltis.elimas.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Empleado {

  private String especialidad;
  private List<Consulta> consultas;

  /**
   * *
   * Veterinario: Un veterinario puede estar asociado con muchas consultas
   * (0..*).
   *
   */
  public Veterinario(Long cedula, String nombre, String apellido, Integer edad,
          Double sueldo, String especialidad) {
    super(cedula, nombre, apellido, edad, sueldo);
    this.especialidad = especialidad;
    consultas = new ArrayList<>();
  }

  public List<Consulta> getConsultas() {
    return consultas;
  }

  public void agregarConsulta(Consulta consulta) {
    consultas.add(consulta);
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
