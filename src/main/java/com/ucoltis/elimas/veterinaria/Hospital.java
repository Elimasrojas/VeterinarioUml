package com.ucoltis.elimas.veterinaria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Hospital {
  
    private List<Cliente> clientes;
    private List<Veterinario> veterinarios;
    private List<Producto> productos;

    public static void main(String[] args) {
        // Hospital app = new Hospital(); -> Java 1+
        var app = new Hospital();
        app.iniciarHospital();

        app.mostrarMenuPrincipal();
    }
    
    
    
    private void iniciarHospital(){
        clientes = new ArrayList<>();
        veterinarios = new ArrayList<>();
        
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
        
        // TODO: Creacion de productos
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
                /****
                 * switch (opcion) {
                    case 1:
                        atenderMascota(scanner);
                        break;
                    case 2:
                        consultaHistorialAtencion();
                        break;
                    case 3:
                        listarClientes();
                        break;

                    case 0:
                        salir = true;
                        break;
                    default:
                        System.err.println("La opcion ingresada no es valida: " + opcion);
                }
                 */
                switch (opcion) {
                    case 1 -> atenderMascota(scanner);
                    case 2 -> consultaHistorialAtencion();
                    case 3 -> listarClientes();

                    case 0 -> salir = true;
                    default -> System.err.println("La opcion ingresada no es valida: " + opcion);
                }

            } catch (NumberFormatException e) {
                System.err.println("El valor de la entrada no es válida: " + entrada);
            }
            
            if(!salir) {
                esperarEnter(scanner);
            }
        }
    }

    private void esperarEnter(Scanner scanner) {
        System.out.println("\nPresione ENTER para continuar.");
        scanner.nextLine();
    }

    private void atenderMascota(Scanner scanner) {
        // TODO: Implementar
        System.out.println("\nAtencion:");
        
        // Seleccionar el cliente dueño de mascota
        System.out.println("\nSeleccione el cliente:");
        for(int i = 1; i <= clientes.size(); i++) {
            System.out.println(i + " - " + clientes.get(i - 1));
        }
        System.out.println("Cual es el cliente: ");
        var indice = Integer.parseInt(scanner.nextLine());
        var cliente = clientes.get(indice - 1);
        
        // Seleccionar mascota
        System.out.println("\nSeleccione la mascota:");
        for(int i = 1; i <= cliente.getMascotas().size(); i++) {
            System.out.println(i + " - " + cliente.getMascotas().get(i - 1));
        }
        System.out.println("Cual es la mascota: ");
        indice = Integer.parseInt(scanner.nextLine());
        var mascota = cliente.getMascotas().get(indice - 1);
        
        // Seleccionar veterinario
        System.out.println("\nSeleccione el veterinario:");
        for(int i = 1; i <= veterinarios.size(); i++) {
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

        // TODO: Generar factura
        
        // TODO: agrego varios productos al detalle de la factura
        
        // TODO imprimir en pantalla la descripcion de toda la factura
    }

    private void consultaHistorialAtencion() {
        // TODO: Selecionar cliente
        // TODO: Selecionar mascota
        // TODO: Imprimir todas detalles que tiene el historial de la mascota
    }

    private void listarClientes() {
        System.out.println("\nClientes:");
        
        for(var cliente : clientes) {
            System.out.println(cliente);
        }
        // TODO: Implementar
    }
}
