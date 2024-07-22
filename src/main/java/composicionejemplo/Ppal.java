
package composicionejemplo;

/**
 *
 * @author COREi5 -10TH
 */
public class Ppal {
  public static void main(String[] args) {
    var cliente = new Cliente("Cristian");
    cliente.addMascota(1L);
    System.out.println(cliente);
    cliente=null;
    
    var cliente1 = new Cliente("Cristian");
    cliente1.addMascota(2L);
    System.out.println(cliente1);
    
    
    
  }
          
          
  
}
