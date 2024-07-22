package com.ucoltis.elimas.veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    private final Long numero;
    private LocalDate fecha;
    
    private final List<DetalleFactura> detalleFacturas;
    private Consulta consulta;// crear la fact y luego le doce que consulta es 

    public Factura(Long numero, LocalDate fecha) {
        this.numero = numero;
        this.fecha = fecha;
        this.detalleFacturas = new ArrayList<>();
    }

    public Long getNumero() {
        return numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void agregarDetalleFactura(DetalleFactura detalleFactura) {
        //TODO
        detalleFacturas.add(detalleFactura);
    }

    public Double getTotal() {
        //TODO
        return detalleFacturas.stream().mapToDouble(DetalleFactura::getTotal).sum(); 
    }

    public List<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

   
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    

}
