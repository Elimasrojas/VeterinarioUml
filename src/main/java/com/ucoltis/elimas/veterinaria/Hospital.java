package com.ucoltis.elimas.veterinaria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {

  private List<Cliente> clientes;
  private List<Veterinario> veterinarios;
  private List<Producto> productos;
  public static Long NUMERO = 0L;

  public static void main(String[] args) {
    // Hospital app = new Hospital(); -> Java 1+
    var app = new Hospital();
    app.iniciarHospital();

    app.mostrarMenuPrincipal();
  }

  private void iniciarHospital() {
    clientes = new ArrayList<>();
    veterinarios = new ArrayList<>();
    productos = new ArrayList<>();

    // Creacion de clientes
    var cliente = new Cliente(100001L, "Cesar", "Diaz", 15);
    var mascota = new Mascota("Perro", "Chiguagua", "Fiera", 1L);
    //var mascota = new Mascota(especie, raza, nombre, Long.MIN_VALUE)
    cliente.agregarMascota(mascota);
    clientes.add(cliente);

    cliente = new Cliente(100002L, "Carlos", "Bermudez", 25);
    mascota = new Mascota("Gato", "Siames", "Minino", 2L);
    cliente.agregarMascota(mascota);
    mascota = new Mascota("Perro", "Labrador", "Quien", 1L);
    cliente.agregarMascota(mascota);
    clientes.add(cliente);

    cliente = new Cliente(100003L, "Mauricio", "Lopez", 40);
    mascota = new Mascota("Perro", "Bulldog", "Gruñido", 1L);
    cliente.agregarMascota(mascota);
    clientes.add(cliente);

    // Creacion de veterinarios
    var veterinario = new Veterinario(200001L, "Francisco", "Medina", 45, 25_000d, "Perro");
    veterinarios.add(veterinario);
    veterinarios.add(new Veterinario(200002L, "Pedro", "Perez", 28, 25_000d, "Gato"));

    //  Creacion de productos
    var producto = new Producto(1L, "PUPPY 2.04 KG HILLS SCIENCE DIET", 105000.0);
    productos.add(producto);
    productos.add(new Producto(2L, "ADULT SMALL PAWS 2.03 KG HILLS", 104000.0));
    productos.add(new Producto(3L, "FELINO ADULTO LIGHT 1 - 6 / 3.1KG", 197000.0));
  }

  public void mostrarMenuPrincipal() {
    var scanner = new Scanner(System.in);
    var salir = false;

    while (!salir) {
      System.out.println("---------------------------------------------");
      System.out.println("-             Menu Principal                -");
      System.out.println("---------------------------------------------");
      System.out.println("1. Atender una mascota");
      System.out.println("2. Consultar una atención");
      System.out.println("3. Listar clientes");
      System.out.println("0. Salir de la aplicacion");

      System.out.println("Ingrese su opción: ");
      var entrada = scanner.nextLine();

      try {
        var opcion = Integer.parseInt(entrada);
        /**
         * **
         * switch (opcion) { case 1: atenderMascota(scanner); break; case 2:
         * consultaHistorialAtencion(); break; case 3: listarClientes(); break;
         *
         * case 0: salir = true; break; default: System.err.println("La opcion
         * ingresada no es valida: " + opcion); }
         */
        switch (opcion) {
          case 1 ->
            atenderMascota(scanner);
          case 2 ->
            consultaHistorialAtencion(scanner);
          case 3 ->
            listarClientes();

          case 0 ->
            salir = true;
          default ->
            System.err.println("La opcion ingresada no es valida: " + opcion);
        }

      } catch (NumberFormatException e) {
        System.err.println("El valor de la entrada no es válida: " + entrada);
      }

      if (!salir) {
        esperarEnter(scanner);
      }
    }
  }

  private void esperarEnter(Scanner scanner) {
    System.out.println("\nPresione ENTER para continuar.");
    scanner.nextLine();
  }

  private void atenderMascota(Scanner scanner) {
    //  Implementar
    System.out.println("\nAtencion:");

    // Seleccionar el cliente dueño de mascota
    System.out.println("\nSeleccione el cliente:");
    for (int i = 1; i <= clientes.size(); i++) {
      System.out.println(i + " - " + clientes.get(i - 1));
    }
    System.out.println("Cual es el cliente: ");
    var indice = Integer.parseInt(scanner.nextLine());
    var cliente = clientes.get(indice - 1);

    // Seleccionar mascota
    System.out.println("\nSeleccione la mascota:");
    for (int i = 1; i <= cliente.getMascotas().size(); i++) {
      System.out.println(i + " - " + cliente.getMascotas().get(i - 1));
    }
    System.out.println("Cual es la mascota: ");
    indice = Integer.parseInt(scanner.nextLine());
    var mascota = cliente.getMascotas().get(indice - 1);

    // Seleccionar veterinario
    System.out.println("\nSeleccione el veterinario:");
    for (int i = 1; i <= veterinarios.size(); i++) {
      System.out.println(i + " - " + veterinarios.get(i - 1));
    }
    System.out.println("Cual es el veterinario: ");
    indice = Integer.parseInt(scanner.nextLine());
    var veterinario = veterinarios.get(indice - 1);

    // Crear consulta
    System.out.println("Cual es motivo de la consulta: ");
    var consulta = new Consulta(1L, scanner.nextLine());
    consulta.relacionConObjetos(mascota, veterinario);
    veterinario.agregarConsulta(consulta);
    mascota.agregarConsulta(consulta);
    consulta.setFecha(LocalDateTime.now());

    // Agregamos detalle clinico
    var detalle = new DetalleClinico(consulta);
    detalle.setFecha(consulta.getFecha());
    System.out.println("Que se realizó durante la atencion: ");
    detalle.setDescripcion(scanner.nextLine());

    consulta.setDetalleClinico(detalle);

    // Agregar al historial de la mascota
    if (mascota.getHistorialClinico() == null) {
      mascota.setHistorialClinico(new HistorialClinico(1L));
    }

    var historial = mascota.getHistorialClinico();
    historial.agregarDetalle(detalle);
    detalle.setHistorialClinico(historial);

    //  Generar factura
    NUMERO += 1;
    System.out.println("\n********Facturaciòn********:");
    var factura = new Factura(NUMERO, LocalDate.now());

    //  agrego varios productos al detalle de la factura
    var isAddProduct = false;
    while (!isAddProduct) {
      System.out.println("\nSeleccione el Producto:");
      for (int i = 1; i <= productos.size(); i++) {
        System.out.println(i + " - " + productos.get(i - 1));
      }
      System.out.println("Cual es el Producto: ");
      indice = Integer.parseInt(scanner.nextLine());
      var producto = productos.get(indice - 1);

      System.out.println("\nSeleccione el Cantidad del Producto:");
      var cantidad = Integer.parseInt(scanner.nextLine());
      var detalleFactura = new DetalleFactura(cantidad);
      detalleFactura.setProducto(producto);
      factura.agregarDetalleFactura(detalleFactura);     
      int temp=0;
      var isValidNumber=false;
      System.out.println("\nDigite 1  agregar Otro Producto:");
      System.out.println("Digite 0  para salir ");
      do {  
        isValidNumber=false;
        temp = Integer.parseInt(scanner.nextLine());
        if (temp == 0) {
          isAddProduct = true;
          isValidNumber=false;
        } else if (temp != 1) {
          System.out.println("\nDigite un numero valido ");
          isValidNumber=true;
        }
      } while (temp != 0 && isValidNumber );
      
    }
    // imprimir en pantalla la descripcion de toda la factura
    System.out.println("\n******************** ");
    System.out.println("Factura Numero: "+ factura.getNumero());
    System.out.println("Fecha factura: "+ factura.getFecha());
    System.out.println("******************** ");
    System.out.println("*Item | cod | Nombre |      Cantidad | valor ** ");
    var detallesFact=factura.getDetalleFacturas();
    for (int i = 0; i < detallesFact.size(); i++) {
      System.out.println( 
              " "+(i+1)+" | "
              +detallesFact.get(i).getProducto().getCodigo()
              +" | "+detallesFact.get(i).getProducto().getNombre()
              +" | "+detallesFact.get(i).getCantidad()
              +" | "+detallesFact.get(i).getTotal());
    }    
    System.out.println();
    System.out.println("Total a pagar: "+factura.getTotal());
    
  }

  private void consultaHistorialAtencion(Scanner scanner) {
    //  Selecionar cliente
    System.out.println("\nAtencion:");

    // Seleccionar el cliente dueño de mascota
    System.out.println("\nSeleccione el cliente:");
    for (int i = 1; i <= clientes.size(); i++) {
      System.out.println(i + " - " + clientes.get(i - 1));
    }
    System.out.println("Cual es el cliente: ");
    var indice = Integer.parseInt(scanner.nextLine());
    var cliente = clientes.get(indice - 1);

    //  Selecionar mascota
    System.out.println("\nSeleccione la mascota:");
    for (int i = 1; i <= cliente.getMascotas().size(); i++) {
      System.out.println(i + " - " + cliente.getMascotas().get(i - 1));
    }
    System.out.println("Cual es la mascota: ");
    indice = Integer.parseInt(scanner.nextLine());
    var mascota = cliente.getMascotas().get(indice - 1);

    // Imprimir todas detalles que tiene el historial de la mascota
    System.out.println("Detalles Clinicos de la mascota: ");
    if (mascota.getHistorialClinico() == null) {
      System.out.println("No registra historial");
    } else {
      var detalles = mascota.getHistorialClinico().getDetalleClinicos();
      for (DetalleClinico dc : detalles) {
        System.out.println("| " + dc.getDescripcion());
      }
    }

  }

  private void listarClientes() {
    System.out.println("\nClientes:");

    for (var cliente : clientes) {
      System.out.println(cliente);
    }
   
  }
}
