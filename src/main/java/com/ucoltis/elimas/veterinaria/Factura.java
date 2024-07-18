package com.ucoltis.elimas.veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    private final Long numero;
    private LocalDate fecha;
    private List<DetalleFactura> detalleFacturas;
    private Consulta consulta;

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
    }

    public Double Total() {
        //TODO
        return null;
    }

    public List<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    

}
