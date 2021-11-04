package dto;

public class dtoDetalleFactura {

    //Atributos
    private Integer idDetalleFactura;
    private Integer idFactura;
    private String nomProd;
    private Integer cantidad;
    private Double precioProd;
    private Double montoProd;

    //Constructor
    public dtoDetalleFactura() {
    }

    //Encapsulamiento
    public Integer getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(Integer idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Double precioProd) {
        this.precioProd = precioProd;
    }

    public Double getMontoProd() {
        return montoProd;
    }

    public void setMontoProd(Double montoProd) {
        this.montoProd = montoProd;
    }

}
