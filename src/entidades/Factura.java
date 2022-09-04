
package entidades;
import departamento.Mantenimiento;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ROBERT
 */
public class Factura {
    Scanner entrada;
    private String codigo;
    private String correlativo;
    private float Cantidad;
    
    private List<String> lProductos;
    
    Mantenimiento oMantenimiento;

    public Factura() {
    }

    public Factura(Mantenimiento oMantenimiento) {
        this.oMantenimiento = oMantenimiento;
    }
    
    public Factura(Scanner entrada, String codigo, String correlativo, float Cantidad,  List<String> lProductos, Mantenimiento oMantenimiento) {
        this.entrada = entrada;
        this.codigo = codigo;
        this.correlativo = correlativo;
        this.Cantidad = Cantidad;
        this.lProductos = lProductos;
        this.oMantenimiento = oMantenimiento;
    }

    public Factura(String codigo, String correlativo, Mantenimiento oMantenimiento) {
        this.codigo = codigo;
        this.correlativo = correlativo;
        this.oMantenimiento = oMantenimiento;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public List<String> getlProductos() {
        return lProductos;
    }

    public void setlProductos(List<String> lProductos) {
        this.lProductos = lProductos;
    }

    public Mantenimiento getoMantenimiento() {
        return oMantenimiento;
    }

    public void setoMantenimiento(Mantenimiento oMantenimiento) {
        this.oMantenimiento = oMantenimiento;
    }

    
   

    public void MostrarFactura(Mantenimiento oMantenimiento) {
    }

    public void agregarProductos(String nombre,float cantidad,float precio,float pu,String um,float factor) {

    }
    public void modificarfactura(String nombre, float cantidad,float precio,float pu,String um,float factor){
        
    }
    public void eliminarFactura(String nombre){
    
    }
    
//    public void genrarCodigo(int n) {
//    }
//
//    public void generarCorrelativo(int n) {
//
//    }
    
}
