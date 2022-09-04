package entidades;

import javax.swing.JOptionPane;

public class Producto {
    private String Codigo;
    private String Nombre;
    private float PrecioUnitario;
    private float Stock;
    
    /*------------------------*/
    private String UnidadMedida;
    private float cCompra = 0;
    private float cVenta = 0;
    private float cVendida = 0;

    public Producto() {
    }

    public Producto(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public Producto(String Codigo, String Nombre, String um,float PrecioUnitario, int Stock) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
        this.UnidadMedida = um;
        this.Stock = Stock;
    }

    public Producto(String Codigo, String Nombre, float PrecioUnitario, float Stock, String UnidadMedida) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
        this.Stock = Stock;
        this.UnidadMedida = UnidadMedida;
    }
    
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public float getStock() {
        return Stock;
    }

    public void setStock(float Stock) {
        this.Stock = Stock;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public float getcCompra() {
        return cCompra;
    }

    public void setcCompra(float cCompra) {
        this.cCompra = cCompra;
    }

    public float getcVenta() {
        return cVenta;
    }

    public void setcVenta(float cVenta) {
        this.cVenta = cVenta;
    }

    public float getcVendida() {
        return cVendida;
    }

    public void setcVendida(float cVendida) {
        this.cVendida = cVendida;
    }
    /*---------------  funciones para modificar el stock ----------------------*/
    public boolean vender(float cantidad) {

        if (cantidad > this.getStock()) {
            JOptionPane.showMessageDialog(null, "No hay Stock suficiente del producto.");
            return true;
            
        } else {
            this.Stock = this.Stock - cantidad;
            this.cVenta = this.cVenta + (this.PrecioUnitario * cantidad);
            return false;
        }
    }

    public boolean comprar(float cantidad,float subtotal) {
        this.Stock = this.Stock + cantidad;
        this.cCompra = this.cCompra + subtotal;
        return true;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (((Producto) obj).getCodigo().equals(this.Codigo)) {
            return true;
        } else {
            return false;
        }
    }    
    
    @Override
    public String toString() {
        return getCodigo() + "|" + Nombre + "|" + UnidadMedida + "|" + PrecioUnitario;
    }
    
    
    public String aCadena() {
        return this.getCodigo() + "-" + this.getNombre() + "-" + this.getUnidadMedida()+ "-" 
                + this.getPrecioUnitario() +"-" + this.getStock()+ "-" + this.getcCompra() +"-"+ this.cVenta;
    }
}
