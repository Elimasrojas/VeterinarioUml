
package agregacionejemplo;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Mascota> mascotas;

    // Constructor
    public Cliente() {
        this.mascotas = new ArrayList<>();
    }

    // Método para añadir una mascota ya creada
    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
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

