package entidades;

//
import departamento.*;
import java.util.ArrayList;
import java.util.List;

public class Ventas extends Factura {

    private String NombreCliente;
    private List<String> lproductos ;
    private List<Float> lCantidad;
    private List<String> lUm;
    private List<Float> lprecio;
    private List<Float> lPU;
    private List<Float> lFactor;
    private int des;

    public Ventas(Mantenimiento oMantenimiento) {
//        this.lproductos = new ArrayList<>();
//        this.lCantidad = new ArrayList<>();
//        this.lUm = new ArrayList<>();
//        this.lprecio = new ArrayList<>();
//        this.lPU = new ArrayList<>();
//        this.lFactor = new ArrayList<>();
    }

    public Ventas() {
//        this.lproductos = new ArrayList<>();
//        this.lCantidad = new ArrayList<>();
//        this.lUm = new ArrayList<>();
//        this.lprecio = new ArrayList<>();
//        this.lPU = new ArrayList<>();
//        this.lFactor = new ArrayList<>();
    }
    
    

    public Ventas(String NombreCliente, List<String> lproductos) {
//        if (!(lproductos == null)) {
//            this.lproductos = new ArrayList<>();
//            this.lCantidad = new ArrayList<>();
//            this.lUm = new ArrayList<>();
//            this.lprecio = new ArrayList<>();
//            this.lPU = new ArrayList<>();
//            this.lproductos = new ArrayList<>();
//            this.lFactor = new ArrayList<>();
//
//        }
        this.NombreCliente = NombreCliente;
//        this.lproductos = lproductos;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

//    public List<String> getLproductos() {
//        return lproductos;
//    }

//    public void setLproductos(List<String> lproductos) {
//        this.lproductos = lproductos;
//    }
//
//    public List<Float> getlCantidad() {
//        return lCantidad;
//    }
//
//    public void setlCantidad(List<Float> lCantidad) {
//        this.lCantidad = lCantidad;
//    }
//
//    public List<String> getlUm() {
//        return lUm;
//    }

//    public void setlUm(List<String> lUm) {
//        this.lUm = lUm;
//    }
//
//    public List<Float> getLprecio() {
//        return lprecio;
//    }
//
//    public void setLprecio(List<Float> lprecio) {
//        this.lprecio = lprecio;
//    }
//
//    public List<Float> getlPU() {
//        return lPU;
//    }

//    public void setlPU(List<Float> lPU) {
//        this.lPU = lPU;
//    }
//
//    public List<Float> getlFactor() {
//        return lFactor;
//    }
//
//    public void setlFactor(List<Float> lFactor) {
//        this.lFactor = lFactor;
//    }

//    @Override
//    public void MostrarFactura(Mantenimiento oMantenimiento) {
//        float cantidadTotal = 0;
////        if (oMantenimiento.getlProductos().size() > 0) {
//        if (this.lproductos.size() > 0) {
//
//            System.out.println("Factura N°    | " + this.getCodigo() + " | " + this.getCorrelativo() + " |");
//            System.out.println("Nombre: " + this.getNombreCliente());
//            System.out.printf("%12s |%12s |%12s |%12s |%12s | %12s %n", "N°", "Producto", "Cantidad", "Uni. Med", "P. Unitario", "Subtotal");
//            for (int i = 0; i < this.lproductos.size(); i++) {
//                System.out.printf("%12d |%12s |%12f |", (i + 1), lproductos.get(i), this.getlCantidad().get(i));
//
//                System.out.printf("%12s |", this.lUm.get(i));
//                System.out.printf("%12f |", this.lPU.get(i));
//                System.out.printf("%12f  %n", this.lprecio.get(i));
//                cantidadTotal = cantidadTotal + this.lprecio.get(i);
//
//            }
//            System.out.printf("%12s |%12s  %12s  %12s  %12s   %12f %n", "Total", "-", " -", "-", "-", cantidadTotal);
//        } else {
//            System.out.println("No se ha realizado ninguna ventaa :(.");
//
//        }
//
//    }

//    @Override
//    public void agregarProductos(String nombre, float cantidad, float precio, float pu, String um, float factor) {
//        int i = 0;
//        int k = 0;
//
//        do {
//            if (this.lproductos.size() > 0 && this.lproductos.get(i).equals(nombre)) {
//                k++;
//                i = this.lproductos.size();
//            } else {
//                i++;
//            }
//        } while (i < this.lproductos.size());
//        if (k == 0) {
//            this.lproductos.add(nombre);
//            this.lCantidad.add(cantidad);
//            this.lprecio.add(precio);
//            this.lUm.add(um);
//            this.lPU.add(pu);
//            this.lFactor.add(factor);
//
//            System.out.println("El producto se agrego a la factura.");
//
//        } else {
//            System.out.println("El producto ya existe. ");
//        }
//    }
//
//    
//    @Override
//    public void modificarfactura(String nombre, float cantidad, float precio, float pu, String um, float factor) {
//        if (this.lproductos.size() > 0) {
//            int i = 0;
//            int k = 0;
//            do {
//                if (this.lproductos.get(i).equals(nombre)) {
//                    k = 1;
//                    this.lCantidad.set(i, cantidad);
//                    this.lPU.set(i, pu);
//                    this.lUm.set(i, um);
//                    this.lprecio.set(i, precio);
//                    this.lFactor.set(i, factor);
//                    i = this.lproductos.size();
//                    System.out.println("Modificacion exitosa.");
//                } else {
//                    i++;
//                }
//            } while (i < this.lproductos.size());
//            if (k == 0) {
//                System.out.println("El producto a modificar no encontrado.");
//            }
//        } else {
//            System.out.println("Aun no se ha vendido algun producto.");
//        }
//    }
//
//    
//    @Override
//    public void eliminarFactura(String nombre) {
//
//        if (this.lproductos.size() > 0) {
//            int i = 0;
//            do {
//                if (this.lproductos.get(i).equals(nombre)) {
//                    this.lCantidad.remove(i);
//                    this.lproductos.remove(i);
//                    this.lprecio.remove(i);
//                    this.lUm.remove(i);
//                    this.lPU.remove(i);
//                    this.lFactor.remove(i);
//                    System.out.println("Eliminado exitosamente.");
//                } else {
//                    i++;
//                }
//            } while (i < this.lproductos.size());
//        } else {
//            System.out.println("Factura vacia.");
//        }
//    }

    public String aCadena() {
        return this.getCodigo()+"-"+this.getCorrelativo() + "-" + this.getNombreCliente() ;
        
    }
    
    @Override
    public String toString() {
        return this.getCodigo()+" | " + this.NombreCliente ;
    }
    
}
