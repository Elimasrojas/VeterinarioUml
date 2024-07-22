
package agregacionejemplo;

import composicionejemplo.*;

/**
 *
 * @author COREi5 -10TH
 */
public class Ppal {
  public static void main(String[] args) {
    var cliente = new Cliente();
    var mascota= new Mascota(1L);
    cliente.addMascota(mascota);
    System.out.println(cliente);
    cliente=null;
    
    var cliente1 = new Cliente();
    mascota= new Mascota(2L);
    cliente1.addMascota(mascota);
    System.out.println(cliente1);
    System.gc();
    
    
    
  }
          
          
  
}
