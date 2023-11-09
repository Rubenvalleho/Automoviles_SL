public class Ventas {
    private String codigoVenta;
    private String fechaVenta;

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    private String formaPago;
    private String precio;
}
