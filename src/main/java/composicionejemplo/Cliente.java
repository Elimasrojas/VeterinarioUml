package composicionejemplo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  private String nombre;
  private List<Mascota> mascotas;

  // Constructor
  public Cliente(String nombre) {
    this.nombre=nombre;
    this.mascotas = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Método para crear y añadir una nueva mascota
  public void addMascota(Long id) {
    Mascota nuevaMascota = new Mascota(id);
    this.mascotas.add(nuevaMascota);
  }

  // Getters
  public List<Mascota> getMascotas() {
    return mascotas;
  }

  @Override
  public String toString() {
    return "Cliente{mascotas=" + mascotas + "}";
  }
}

class Mascota {

  private Long id;

  // Constructor
  public Mascota(Long id) {
    this.id = id;
  }

  // Getters
  public Long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Mascota{id=" + id + "}";
  }
}
