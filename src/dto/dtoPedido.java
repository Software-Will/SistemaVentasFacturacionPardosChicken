package dto;

public class dtoPedido {

    //Atributos
    private Integer idPedido;
    private String nombreProducto;
    private Integer cantidad;
    private Double precioProducto;
    private Double montoProducto;
    private String nombreCliente;

    //Constructo
    public dtoPedido() {
    }

    //Encapsulamiento
    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Double getMontoProducto() {
        return montoProducto;
    }

    public void setMontoProducto(Double montoProducto) {
        this.montoProducto = montoProducto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNombreProducto());
        sb.append(getCantidad());
        sb.append(getPrecioProducto());
        return sb.toString();
    }

}
