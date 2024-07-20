package com.ucoltis.elimas.veterinaria;

class DetalleFactura {

  private Integer Cantidad;
  private Factura factura;//getter y setter asociacion 
  private Producto producto;

  public DetalleFactura(Integer Cantidad) {
    this.Cantidad = Cantidad;
  }

  public Integer getCantidad() {
    return Cantidad;
  }

  public void setCantidad(Integer Cantidad) {
    this.Cantidad = Cantidad;
  }

  public Double getTotal() {
    //TODO
    return null;
  }

  public Factura getFactura() {
    return factura;
  }

  public void setFactura(Factura factura) {
    this.factura = factura;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

}
