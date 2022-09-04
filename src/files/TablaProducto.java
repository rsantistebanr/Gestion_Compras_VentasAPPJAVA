package files;

import java.util.ArrayList;
import java.util.List;
import entidades.Producto;
import javax.swing.JOptionPane;

public class TablaProducto extends Archivo {

    private List<Producto> productos = new ArrayList<Producto>();

    public TablaProducto(String ruta) {
        super(ruta, "productos", "txt");
    }

    public int size() {
        return productos.size();
    }

    public List<Producto> Seleccionar(String patron) {
        List<Producto> filtro = new ArrayList<Producto>();

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().contains(patron)) {
                filtro.add(productos.get(i));
            }
        }

        return filtro;
    }

    public Producto Seleccionar(Producto producto) {
        Producto productoUbicado = null;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(producto.getNombre())) {
                productoUbicado = productos.get(i);
                break;
            }
        }

        return productoUbicado;
    }

    public int Ubicar(Producto producto) {
        int posicion = -1;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equals(producto.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(Producto producto) {
        int posicion;

        posicion = Ubicar(producto);
        if (posicion == -1) {
            productos.add(producto);
            JOptionPane.showMessageDialog(null, "Insertado correctamente.");
            return new Mensaje("Producto insertado correctamente", "OK");
        } else {
                        JOptionPane.showMessageDialog(null, "Producto ya se encuentra registrado");
            return new Mensaje("Producto ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(Producto producto) {
        int posicion;

        posicion = Ubicar(producto);
        if (posicion != -1) {
            productos.set(posicion, producto);
            System.out.println("entro modif");
            return new Mensaje("Producto actualizada correctamente", "OK");
        } else {
            System.out.println("no entro modif");
            return new Mensaje("Producto no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(Producto producto) {
        int posicion;

        posicion = Ubicar(producto);
        if (posicion != -1) {
            productos.remove(posicion);
            return new Mensaje("Producto eliminada correctamente", "OK");
        } else {
            return new Mensaje("Producto no se encuentra registrada", "ERROR");
        }
    }

    //este metodo me recorre lo qu recofgio del txt para comprobar si lo que estoy comprando es valido
    public void recorrerCompra(String nombre,float cantidad,float subtotal) {
         for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                productos.get(i).comprar(cantidad,subtotal);
                break;
            }
        }
    }
    
    public void recorrerVenta(String nombre,float cantidad) {
         for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                productos.get(i).vender(cantidad);
                if(productos.get(i).getStock()>=20){
                   
                }
                break;
            }
        }
    }
    
    public boolean  MensajeAlmacen(){
        boolean ban = false;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getStock()<=20) {
                ban =  true;
                break;
            }
        }
        return ban;
        
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < productos.size(); i++) {
            cadena = cadena + productos.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        Producto producto;

        if (cadena.length() > 0) {
            for (int i = 0; i < cadena.split("/").length; i++) {
                producto = new Producto();

                producto.setCodigo(cadena.split("/")[i].split("-")[0]);
                producto.setNombre(cadena.split("/")[i].split("-")[1]);
                producto.setUnidadMedida(cadena.split("/")[i].split("-")[2]);
                producto.setPrecioUnitario(Float.parseFloat(cadena.split("/")[i].split("-")[3]));
                producto.setStock(Float.parseFloat(cadena.split("/")[i].split("-")[4]));
                producto.setcCompra(Float.parseFloat(cadena.split("/")[i].split("-")[5]));
                producto.setcVenta(Float.parseFloat(cadena.split("/")[i].split("-")[6]));

                productos.add(producto);
            }
        } else {
            System.out.println("No hay productos registrados.");
        }
    }
}
